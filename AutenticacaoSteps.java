package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.example.Autenticacao;

public class AutenticacaoSteps {

    private String usuario;
    private String senha;
    private boolean acesso;

    @Dado("que eu tenho o usuário {string} e a senha {string}")
    public void definirCredenciais(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Quando("eu tento fazer login")
    public void tentarLogin() {
        this.acesso = Autenticacao.login(usuario, senha);
    }

    @Então("o acesso deve ser permitido")
    public void verificarAcessoPermitido() {
        assertTrue(acesso);
    }

    @Então("o acesso deve ser negado")
    public void verificarAcessoNegado() {
        assertFalse(acesso);
    }
}