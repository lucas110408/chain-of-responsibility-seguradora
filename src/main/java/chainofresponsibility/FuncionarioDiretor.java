package chainofresponsibility;

public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaSinistros.add(TipoSinistroPerdaTotal.getTipoSinistroPerdaTotal());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
