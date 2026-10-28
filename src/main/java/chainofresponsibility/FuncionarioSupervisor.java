package chainofresponsibility;

public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(Funcionario superior) {
        listaSinistros.add(TipoSinistroColisao.getTipoSinistroColisao());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}
