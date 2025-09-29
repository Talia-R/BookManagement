import java.util.LinkedList;

public class Musica {
    String nomeCantor;
    String nomeMusica;

    public Musica(String nomeCantor, String nomeMusica){
        if(nomeCantor == null || nomeMusica == null){
            throw new IllegalArgumentException("Entrada não pode ser vazia");
        }
        this.nomeCantor = nomeCantor.trim();
        this.nomeMusica = nomeMusica.trim();
    }

    /**
     * Adiciona uma nova musica em um lista.
     * @param lista lista
     * @param nomeAutor nome do autor
     * @param nac nacionalidade do autor
     */
    public void adicionarNovaMusica(LinkedList<Musica> lista, Musica novaMusica){
        lista.add(novaMusica);
    }
}
