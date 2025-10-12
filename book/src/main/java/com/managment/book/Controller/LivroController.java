package com.managment.book.Controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.managment.book.Model.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LivroController {
    
    @PersistenceUnit
    private EntityManagerFactory emf;

    @PostMapping("/livros/{nome}/{totalPaginas}")
    public @ResponseBody Livro criarLivro(@PathVariable String nome, 
                                            @PathVariable int totalPaginas) {
        Livro novoLivro = new Livro(nome, totalPaginas);
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(novoLivro);
        manager.getTransaction().commit();
        return novoLivro;
    }

    @GetMapping("/livros/")
    public @ResponseBody LinkedList<String> buscarTodosLivros() {
        LinkedList<String> todosLivros = new LinkedList<>();
        EntityManager manager = emf.createEntityManager();
        List<?> livros = manager.createQuery("SELECT l from Livro l").getResultList();
        for(Object l : livros){
            Livro novoLivro = (Livro)l;
            todosLivros.add(novoLivro.relatorio());
        }
        return todosLivros;
    }
    
    @GetMapping("/livros/{id}")
    public @ResponseBody String buscarLivroID(@PathVariable int id) {
        EntityManager manager = emf.createEntityManager();
        Livro livroBuscado = manager.find(Livro.class, id);
        return livroBuscado.relatorio();
    }
    
}
