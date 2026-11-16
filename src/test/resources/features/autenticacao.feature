# language: pt

Funcionalidade: Autenticação

  Cenário: Login com credenciais válidas
    Dado que eu tenho o usuário "admin" e a senha "1234"
    Quando eu tento fazer login
    Então o acesso deve ser permitido

  Cenário: Login com credenciais inválidas
    Dado que eu tenho o usuário "admin" e a senha "senhaerrada"
    Quando eu tento fazer login
    Então o acesso deve ser negado