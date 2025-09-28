public class Livro {
    private int id_ISBN;

    private String nome;
    private Autor autor;
    private int totalPaginas;
    private EStatus status;

    public Livro(String nome, int totalPaginas){
        if(nome == null || nome.trim().length() < 2){
            throw new IllegalArgumentException("Nome deve ser um campo preenchido com pelo menos dois caracter");
        }
        if(totalPaginas <= 0){
            throw new IllegalArgumentException("O total de páginas deve ser maior que zero");
        }
        this.nome = nome;
        this.totalPaginas = totalPaginas;
    }

    public Livro(String nome, int totalPaginas, Autor autor, EStatus status){
        this(nome, totalPaginas);
        this.autor = autor;
        this.status = status;
    }


}