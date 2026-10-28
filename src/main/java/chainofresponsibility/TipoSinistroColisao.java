package chainofresponsibility;

public class TipoSinistroColisao implements TipoSinistro {

    private static TipoSinistroColisao tipoSinistroColisao = new TipoSinistroColisao();

    private TipoSinistroColisao() {};

    public static TipoSinistroColisao getTipoSinistroColisao() {
        return tipoSinistroColisao;
    }
}
