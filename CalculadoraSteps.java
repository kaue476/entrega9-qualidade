package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.example.Calculadora;

public class CalculadoraSteps {

    private int num1;
    private int num2;
    private int resultado;
    private Exception exception;

    @Dado("que eu tenho os números {int} e {int}")
    public void definirNumeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Quando("eu peço para somar")
    public void somar() {
        this.resultado = Calculadora.somar(num1, num2);
    }

    @Então("o resultado deve ser {int}")
    public void verificarResultado(int esperado) {
        assertEquals(esperado, resultado);
    }

    @Quando("eu peço para dividir")
    public void dividir() {
        try {
            this.resultado = Calculadora.dividir(num1, num2);
        } catch (Exception e) {
            this.exception = e;
        }
    }

    @Então("o sistema deve informar {string}")
    public void verificarMensagem(String mensagem) {
        assertNotNull(exception);
        assertEquals(mensagem, exception.getMessage());
    }
}