public enum EStatus {
    lido("Concluido"),
    nãoLido("Não lido"),
    iniciado("Em andamento");

    private String descricao;

    private EStatus(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
