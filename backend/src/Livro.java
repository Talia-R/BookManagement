public class Livro {
    private int id;
    private int ultimoLivro;

    private String nome;
    private Autor autor;
    private int totalPaginas;
    private int paginasLidas;
    private String status;

    public Livro(String nome, int totalPaginas){
        if(nome == null || nome.trim().length() < 2){
            throw new IllegalArgumentException("Nome deve ser um campo preenchido com pelo menos dois caracter");
        }
        if(totalPaginas <= 0){
            throw new IllegalArgumentException("O total de páginas deve ser maior que zero");
        }
        this.nome = nome;
        this.totalPaginas = totalPaginas;
        id = +ultimoLivro;
    }

    public Livro(String nome, int totalPaginas, int paginasLidas){
        this(nome, totalPaginas);
        if(paginasLidas < 0 || paginasLidas > totalPaginas){
            throw new IllegalArgumentException("O total de páginas lidas deve ser maior que zero e menor que o total de páginas do livro.");
        }
        this.paginasLidas = paginasLidas;
        setarStatus();
    }

    public Livro(String nome, int totalPaginas, Autor autor, int paginasLidas){
        this(nome, totalPaginas, paginasLidas);
        this.autor = autor;
    }

    private void setarStatus(){
        String statusAtual = EStatus.nãoLido.getDescricao();
        if(paginasLidas == totalPaginas){
            statusAtual = EStatus.lido.getDescricao();
        } else if(paginasLidas > 0){
            statusAtual = EStatus.iniciado.getDescricao();
        }
        this.status = statusAtual;
    }

}