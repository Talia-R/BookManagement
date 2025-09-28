import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class InputUtilsTest {
    @Test
    public void limparAcentuacaoCorretamente(){
        String texto = "áèîçõ";
        assertEquals("aeico", InputUtils.limparAcentuacao(texto));
    }
}
