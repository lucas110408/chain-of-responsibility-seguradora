package chainofresponsibility;

public class FuncionarioAnalista extends Funcionario {

    public FuncionarioAnalista(Funcionario superior) {
        listaSinistros.add(TipoSinistroVidros.getTipoSinistroVidros());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Analista";
    }
}
