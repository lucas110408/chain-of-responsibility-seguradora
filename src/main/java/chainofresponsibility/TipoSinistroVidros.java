package chainofresponsibility;

public class TipoSinistroVidros implements TipoSinistro {

    private static TipoSinistroVidros tipoSinistroVidros = new TipoSinistroVidros();

    private TipoSinistroVidros() {};

    public static TipoSinistroVidros getTipoSinistroVidros() {
        return tipoSinistroVidros;
    }
}
