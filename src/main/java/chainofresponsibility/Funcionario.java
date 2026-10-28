package chainofresponsibility;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaSinistros = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarSinistro(Sinistro sinistro) {
        if (listaSinistros.contains(sinistro.getTipoSinistro())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.aprovarSinistro(sinistro);
            }
            else {
                return "Sem aprovação";
            }
        }
    }
}
