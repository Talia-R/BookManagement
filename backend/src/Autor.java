import java.util.LinkedList;

public class Autor {
    private String nome;
    private String nacionalidade;

    public Autor(String nome){
        if(!eSoTexto(nome)){
            throw new IllegalArgumentException("Deve conter apenas letras e mais que 2 caracter");
        }
        this.nome = nome;
    }


    public Autor(String nome, String nac){
        this(nome);
        if(!eSoTexto(nac)){
            throw new IllegalArgumentException("Deve conter apenas letras e mais que 2 caracter");
        }
        nacionalidade = nac;
    }

    /**
     * Valida se um texto é maior que 2 caracters e tem apenas letras de A-Z. Espaços são considerados. Acentos são desconsiderados.
     * @param texto string a ser verificada
     * @return true se o texto for maior que 2 caracter e tiver apenas letras.
     */
    public boolean eSoTexto(String texto){
        if(texto != null && texto.trim().length() < 2){
            return false;
        }
        String textoFormatado = InputUtils.limparAcentuacao(texto.trim().toUpperCase());
        return textoFormatado.matches("[A-Z ]+");
    }

    /**
     * Adiciona um novo autor em um lista.
     * @param lista lista
     * @param nomeAutor nome do autor
     * @param nac nacionalidade do autor
     */
    public void adicionarAutor(LinkedList<Autor> lista, String nomeAutor, String nac){
        Autor novoAutor = new Autor(nomeAutor, nac);
        lista.add(novoAutor);
    }

    /**
     * Retorna uma string formata com o nome de um autor e sua nacionalidade no formato:
     *  'Nome Autor, Nacionalidade'.
     * @return string formata com o nome de um autor e sua nacionalidade
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder(String.format("%s", nome));
        if(nacionalidade != null)
            s.append(", " + nacionalidade);

        return s.toString();
    }
}
