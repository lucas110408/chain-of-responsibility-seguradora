package chainofresponsibility;

public class TipoSinistroPerdaTotal implements TipoSinistro {

    private static TipoSinistroPerdaTotal tipoSinistroPerdaTotal = new TipoSinistroPerdaTotal();

    private TipoSinistroPerdaTotal() {};

    public static TipoSinistroPerdaTotal getTipoSinistroPerdaTotal() {
        return tipoSinistroPerdaTotal;
    }
}
