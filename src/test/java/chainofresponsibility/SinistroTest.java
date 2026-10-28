package chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinistroTest {

    FuncionarioDiretor diretor;
    FuncionarioGerente gerente;
    FuncionarioSupervisor supervisor;
    FuncionarioAnalista analista;

    @BeforeEach
    void setUp() {
        diretor = new FuncionarioDiretor(null);
        gerente = new FuncionarioGerente(diretor);
        supervisor = new FuncionarioSupervisor(gerente);
        analista = new FuncionarioAnalista(supervisor);
    }

    @Test
    void deveRetornarAnalistaParaAprovacaoVidros() {
        assertEquals("Analista", analista.aprovarSinistro(new Sinistro(TipoSinistroVidros.getTipoSinistroVidros())));
    }

    @Test
    void deveRetornarSupervisorParaAprovacaoColisao() {
        assertEquals("Supervisor", analista.aprovarSinistro(new Sinistro(TipoSinistroColisao.getTipoSinistroColisao())));
    }

    @Test
    void deveRetornarGerenteParaAprovacaoRoubo() {
        assertEquals("Gerente", analista.aprovarSinistro(new Sinistro(TipoSinistroRoubo.getTipoSinistroRoubo())));
    }

    @Test
    void deveRetornarDiretorParaAprovacaoPerdaTotal() {
        assertEquals("Diretor", analista.aprovarSinistro(new Sinistro(TipoSinistroPerdaTotal.getTipoSinistroPerdaTotal())));
    }

    @Test
    void deveRetornarSemAprovacaoParaAprovacaoGuerra() {
        assertEquals("Sem aprovação", analista.aprovarSinistro(new Sinistro(TipoSinistroGuerra.getTipoSinistroGuerra())));
    }

}
