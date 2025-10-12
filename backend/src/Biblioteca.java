import java.util.LinkedList;

public class Biblioteca {
    LinkedList<Livro> todosLivros = new LinkedList<>();

    public String adicionarLivro(Livro livroNovo){
        todosLivros.add(livroNovo);
        return livroNovo.relatorio();
    }

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
