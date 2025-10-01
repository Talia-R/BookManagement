import java.text.Normalizer;

public class InputUtils {
    
    /**
     * Tira toda acentuação contida em um texto.
     * @param texto string a ser formatada
     * @return nova strig sem acentos
     */
    public static String limparAcentuacao(String texto){
        String novoTexto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        return novoTexto.replaceAll("\\p{M}", "");
    }
}
