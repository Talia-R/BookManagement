import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
    private Biblioteca b;
    private Livro l4;

    @BeforeEach
    void setup(){
        b = new Biblioteca();
        Livro l1 = new Livro("The Hero of Ages", 500, 500);
        Livro l2 = new Livro("Warbreaker", 400, 50 );
        Livro l3 = new Livro("Throne of Glass", 380, 80);
        l4 = new Livro("Strange, the Dreamer", 300);
        b.adicionarLivro(l1);
        b.adicionarLivro(l2);
        b.adicionarLivro(l3);
    }

    @Test
    public void adicionarLivroCorretamente(){
        b.adicionarLivro(l4);
        assertEquals(b.todosLivros.size(), 4);
    }

    @Test
    public void leiturasAndamentoCorretamente(){
        assertEquals(2, b.getQntLivrosAndamento());
    }
}
