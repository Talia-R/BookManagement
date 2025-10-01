import java.util.List;

public enum EGenero {

    ROMANCE(List.of("Romance histórico", "Romance policial", "Romance de época", "Romance contemporâneo")),
    FANTASIA(List.of("Alta fantasia", "Baixa fantasia", "Fantasia urbana", "Dark fantasy")),
    TERROR(List.of("Horror psicológico", "Sobrenatural", "Slasher", "Lovecraftiano")),
    FICCAO_CIENTIFICA(List.of("Space opera", "Cyberpunk", "Distopia", "Viagem no tempo")),
    AVENTURA(List.of("Aventura histórica", "Sobrevivência", "Exploração")),
    DRAMA(List.of("Drama familiar", "Drama social", "Drama psicológico"));

    private final List<String> subgeneros;

    private EGenero(List<String> subgeneros) {
        this.subgeneros = subgeneros;
    }

    public List<String> getSubgeneros() {
        return subgeneros;
    }
}


