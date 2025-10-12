import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Autor sanderson = new Autor("Brandon Sanderson");
        Autor sarah = new Autor("Sarah J Maas", "americana");
        // Autor a = new Autor("Aly");
        // Livro l1 = new Livro("Alycia", 50, a, EStatus.iniciado);
        Livro l1 = new Livro("Mistborn", 530);
        // System.out.println(l1.relatorio());

        Livro l2 = new Livro("Mistborn", 530, 20);
        // System.out.println(l2.relatorio());

        Livro l3 = new Livro("Mistborn", sanderson, 530, 530);
        // System.out.println(l3.relatorio());

        Livro l4 = new Livro("Trono de Vidro", sarah, 530, 80);
        // System.out.println(l4.relatorio());

        LinkedList<Livro> todosOsLivros = new LinkedList<>();
        Livro.adicionarLivro(l1, todosOsLivros);
        Livro.adicionarLivro(l2, todosOsLivros);
        Livro.adicionarLivro(l3, todosOsLivros);
        Livro.adicionarLivro(l4, todosOsLivros);

        System.out.print(Livro.acumularTodosLivros(todosOsLivros));

        // for(Livro livro: todosOsLivros){
        //     livro.relatorio();
        // }
    }

    public static String menu(){
        StringBuilder s = new StringBuilder();
        s.append("\nMenu:");
        s.append("\n1) Adicionar novo livro");
        s.append("\n1) Adicionar novo autor");
        s.append("\n O que gostaria de ver: ");
        s.append("\n1) Leituras em andamento");
        s.append("\n1) Leituras concluídas");
        s.append("\n1) Livros não lidos");
        s.append("\n1) Gênero mais lido");
        s.append("\n1) Grupo racial mais lido");
        s.append("\n1) Quantidade total de livros");
        s.append("\n1) Todos os livros");
        s.append("\n1) Todos os autores");
        return s.toString();
    }
}
