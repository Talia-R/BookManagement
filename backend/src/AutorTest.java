import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AutorTest {
    private LinkedList<Autor> todosAutores;
    private Autor novoAutor;
    @BeforeEach
    void setup(){
        todosAutores = new LinkedList<>();
        novoAutor = new Autor("Alycia Carvalho", "Brasileira");
        todosAutores.add(novoAutor);
    }

    @Test
    public void adicionarAutorCorretamente(){
        Autor resultado = todosAutores.getLast();
        assertTrue(resultado.equals(novoAutor));
    }

    @Test
    public void formatarNomeENacCorretamente(){
        String resultado = "Alycia Carvalho, Brasileira";
        assertEquals(resultado, novoAutor.formatarNomeENac());
    }
}
