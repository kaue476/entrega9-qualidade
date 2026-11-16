package org.example;

public class Autenticacao {

    public static boolean login(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }
}