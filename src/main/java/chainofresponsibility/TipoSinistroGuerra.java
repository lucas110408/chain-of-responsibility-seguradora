package chainofresponsibility;

public class TipoSinistroGuerra implements TipoSinistro {

    private static TipoSinistroGuerra tipoSinistroGuerra = new TipoSinistroGuerra();

    private TipoSinistroGuerra() {};

    public static TipoSinistroGuerra getTipoSinistroGuerra() {
        return tipoSinistroGuerra;
    }
}
