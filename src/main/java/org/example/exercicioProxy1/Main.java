package org.example.exercicioProxy1;

/* TODO:  BIBLIOTECA DIGITAL
    O sistema disponibiliza o acesso a livros digitais, porém esse acesso está aberto para qualquer usuário.
    É necessário algumas adequações para que o acesso aos conteúdos dependa do tipo de usuário, onde:
    .
    1 - Usuários comuns: podem apenas ler o título de um livro;
        Exibir mensagem: "Assine o plano Premium para acessar o conteúdo completo."
    2 - Usuários premium: podem ler o conteúdo completo.
    ...
    ...
    Aplique o padrão de Projeto Proxy neste contexto para controle de acesso.

 */
public class Main {

    public static void main(String[] args) {
        LivroProxy livro = new LivroProxy("Padrões de projeto", "Conteúdo completo do livro...", new AcessoPremium());

        livro.ler();

        System.out.println();

        LivroProxy livro1 = new LivroProxy("POO", "Conteúdo completo do livro...", new AcessoComum());

        livro1.ler();


        /*
        Na hora de implementar a autenticação, notei que facilmente poderia infrigir o
        aberto e fechado
        Pra isso, criei uma interface Acesso e classes pra todo tipo de acesso
        Dessa forma o programa está aberto para novos tipos de acesso e fechado para modificação
        Sem a necessidade de usar uma estrutura de if e else
         */
    }
}
