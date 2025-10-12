import java.util.LinkedList;

public class Biblioteca {
    LinkedList<Livro> todosLivros = new LinkedList<>();
    LinkedList<Autor> todosAutores = new LinkedList<>();

    // public Biblioteca(LinkedList<Livro> livros){
    //     todosLivros = livros;
    // }

    /**
     * Adiciona um novo livro na lista de livros
     * @param livroNovo livro a ser adicionado
     * @return String com informações do novo livro adicionado
     */
    public String adicionarLivro(Livro livroNovo){
        todosLivros.add(livroNovo);
        return livroNovo.toString();
    }

    /**
     * Adiciona um novo autor na lista de autores.
     * @param autorNovo autor a ser adicionado.
     * @return String com informações do novo autor adicionado.
     */
    public String adicionarAutor(Autor autorNovo){
        todosAutores.add(autorNovo);
        return autorNovo.toString();
    }

    /**
     * Verifica quantos livros da lista com todos os livros estão em andamento.
     * @return lista com todos os livros em andamento.
     */
    private LinkedList<Livro> leiturasAndamento(){
        LinkedList<Livro> andamento = new LinkedList<>();
        for(Livro item : todosLivros){
            if(item.getStatus() == EStatus.iniciado.getDescricao()){
                andamento.add(item);
            }
        }
        return andamento;
    }

    /**
     * Exibe uma string formatada com todos os livros em andamento.
     * @return string formatada com todos os livros em andamento.
     */
    public String exibirLeiturasAndamento(){
        LinkedList<Livro> lista = leiturasAndamento();
        StringBuilder s = new StringBuilder();
        for(Livro l : lista){
            s.append(l.toString() + "\n");
        }
        return s.toString();
    }

    public int getQntLivrosAndamento(){
        return leiturasAndamento().size();
    }
    // futuro: assim que colocar um livro com autor ele add na listaAutor
    private void preencherListaAutores(){
        for(Livro item : todosLivros){
            if(item.getAutor() != null){
                todosAutores.add(item.getAutor());
            }
        }
    }

    // public <T> String transformarListaEmRelatorio(LinkedList<T> lista){
    //     StringBuilder s = new StringBuilder();
    //     for(T item : lista){
    //         s.append(item.toString());
    //     }
    //     return s.toString();
    // }

    public String exibirTodosLivros(){
        StringBuilder s = new StringBuilder();
        int totalLivros = 0;
        for(Livro livro : todosLivros){
            s.append(++totalLivros + ") ");
            s.append(livro.toString());
            s.append("\n" + "-".repeat(10) + "\n");
        }
        return s.toString();
    }

    public String exibirTodosAutores(){
        StringBuilder s = new StringBuilder();
        int totalAutores = 0;
        for(Autor a : todosAutores){
            s.append(++totalAutores + ") ");
            s.append(a.toString());
            s.append("\n" + "-".repeat(10) + "\n");
        }
        return s.toString();
    }
}
