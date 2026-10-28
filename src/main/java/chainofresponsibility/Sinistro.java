package chainofresponsibility;

public class Sinistro {

    private TipoSinistro tipoSinistro;

    public Sinistro(TipoSinistro tipoSinistro) {
        this.tipoSinistro = tipoSinistro;
    }

    public TipoSinistro getTipoSinistro() {
        return tipoSinistro;
    }

    public void setTipoSinistro(TipoSinistro tipoSinistro) {
        this.tipoSinistro = tipoSinistro;
    }

}
