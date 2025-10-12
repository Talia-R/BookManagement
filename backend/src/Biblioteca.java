import java.util.LinkedList;

public class Biblioteca {
    LinkedList<Livro> todosLivros = new LinkedList<>();
    LinkedList<Autor> todosAutores = new LinkedList<>();

    // public Biblioteca(LinkedList<Livro> livros){
    //     todosLivros = livros;
    // }

    public String adicionarLivro(Livro livroNovo){
        todosLivros.add(livroNovo);
        return livroNovo.relatorio();
    }

    public String adicionarAutor(Autor autorNovo){
        todosAutores.add(autorNovo);
        return autorNovo.relatorio();
    }

    public String leiturasAndamento(){
        LinkedList<Livro> andamento = new LinkedList<>();
        for(Livro item : todosLivros){
            if(item.getStatus() == EStatus.iniciado.getDescricao()){
                andamento.add(item);
            }
        }
        return andamento.toString();
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
            s.append(livro.relatorio());
            s.append("\n" + "-".repeat(10) + "\n");
        }
        return s.toString();
    }
}
