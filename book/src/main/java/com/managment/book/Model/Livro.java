package com.managment.book.Model;

import java.util.LinkedList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ultimoLivro;

    private String nome;

    @OneToOne
    private Autor autor;
    private int totalPaginas;
    private int paginasLidas;
    private String status;

    public Livro(){}

    public Livro(String nome, int totalPaginas){
        if(nome == null || nome.trim().length() < 2){
            throw new IllegalArgumentException("Nome deve ser um campo preenchido com pelo menos dois caracter");
        }
        if(totalPaginas <= 0){
            throw new IllegalArgumentException("O total de páginas deve ser maior que zero");
        }
        this.nome = nome;
        this.totalPaginas = totalPaginas;
        id = +ultimoLivro;
        paginasLidas = -1;
    }

    public Livro(String nome, int totalPaginas, int paginasLidas){
        this(nome, totalPaginas);
        if(paginasLidas < 0 || paginasLidas > totalPaginas){
            throw new IllegalArgumentException("O total de páginas lidas deve ser maior que zero e menor que o total de páginas do livro.");
        }
        this.paginasLidas = paginasLidas;
        setarStatus();
    }

    public Livro(String nome,  Autor autor, int totalPaginas, int paginasLidas){
        this(nome, totalPaginas, paginasLidas);
        this.autor = autor;
    }

    private void setarStatus(){
        String statusAtual = EStatus.nãoLido.getDescricao();
        if(paginasLidas == totalPaginas){
            statusAtual = EStatus.lido.getDescricao();
        } else if(paginasLidas > 0){
            statusAtual = EStatus.iniciado.getDescricao();
        }
        this.status = statusAtual;
    }

    public String relatorio(){
        StringBuilder s = new StringBuilder(String.format("%s - %s páginas.", nome, totalPaginas));

        if(autor != null){
            s.append("\nBy: " + autor.relatorio());
        }
        if(paginasLidas >= 0){
            s.append(" | " + status);
        }

        return s.toString();
    }

    public static String adicionarLivro(Livro livroNovo, LinkedList<Livro> todosOsLivros){
        todosOsLivros.add(livroNovo);
        return livroNovo.relatorio();
    }

    public static String acumularTodosLivros(LinkedList<Livro> todosOsLivros){
        StringBuilder s = new StringBuilder();
        int totalLivros = 0;
        for(Livro livro : todosOsLivros){
            s.append(++totalLivros + ") ");
            s.append(livro.relatorio());
            s.append("\n" + "-".repeat(10) + "\n");
        }
        return s.toString();
    }

}