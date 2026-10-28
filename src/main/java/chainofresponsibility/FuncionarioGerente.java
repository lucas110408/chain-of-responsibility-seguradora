package chainofresponsibility;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaSinistros.add(TipoSinistroRoubo.getTipoSinistroRoubo());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
