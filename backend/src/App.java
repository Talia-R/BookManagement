import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(menu());
    }

    public static String menu(){
        StringBuilder s = new StringBuilder();
        s.append("\nMenu:");
        s.append("\n1) Adicionar novo livro");
        s.append("\n2) Adicionar novo autor");
        s.append("\n O que gostaria de ver: ");
        s.append("\n3) Leituras em andamento");
        s.append("\n4) Leituras concluídas");
        s.append("\n5) Livros não lidos");
        s.append("\n6) Gênero mais lido");
        s.append("\n7) Grupo racial mais lido");
        s.append("\n8) Quantidade total de livros");
        s.append("\n9) Todos os livros");
        s.append("\n10) Todos os autores");
        return s.toString();
    }
}
