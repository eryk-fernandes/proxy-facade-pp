package org.example.exercicioProxy1;

public class AcessoPremium implements Acesso {
    @Override
    public void ler(LivroDigital livroDigital) {
        livroDigital.ler();
    }
}
