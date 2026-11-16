package org.example;

public class Calculadora {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }

        return num1 / num2;
    }

}