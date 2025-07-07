package org.example.exercicioProxy1;

public class AcessoComum implements Acesso {

    @Override
    public void ler(LivroDigital livroDigital) {
        System.out.println("Título: " + livroDigital.getTitulo());
        System.out.println("Assine o plano Premium para acessar o conteúdo completo.");
    }
}
