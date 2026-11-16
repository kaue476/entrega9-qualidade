
package org.example;

/**
 * Classe responsável pela autenticação de usuários.
 */
public final class Autenticacao {

    /**
     * Construtor privado para impedir instanciação.
     */
    private Autenticacao() {
    }

    /**
     * Verifica se as credenciais informadas são válidas.
     *
     * @param usuario nome do usuário
     * @param senha senha informada
     * @return true se as credenciais forem válidas
     */
    public static boolean login(final String usuario, final String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }
}
