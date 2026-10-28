package chainofresponsibility;

public class TipoSinistroRoubo implements TipoSinistro {

    private static TipoSinistroRoubo tipoSinistroRoubo = new TipoSinistroRoubo();

    private TipoSinistroRoubo() {};

    public static TipoSinistroRoubo getTipoSinistroRoubo() {
        return tipoSinistroRoubo;
    }
}
