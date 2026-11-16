
package org.example;

/**
 * Classe utilitária para operações matemáticas.
 */
public final class Calculadora {

    /**
     * Construtor privado para impedir instanciação.
     */
    private Calculadora() {
    }

    /**
     * Soma dois números inteiros.
     *
     * @param num1 primeiro número
     * @param num2 segundo número
     * @return resultado da soma
     */
    public static int somar(final int num1, final int num2) {
        return num1 + num2;
    }

    /**
     * Divide dois números inteiros.
     *
     * @param num1 dividendo
     * @param num2 divisor
     * @return resultado da divisão
     * @throws ArithmeticException se o divisor for zero
     */
    public static int dividir(final int num1, final int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }

        return num1 / num2;
    }
}
