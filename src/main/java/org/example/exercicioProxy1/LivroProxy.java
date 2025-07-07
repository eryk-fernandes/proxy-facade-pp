package org.example.exercicioProxy1;

public class LivroProxy implements Livro {

    private LivroDigital livroDigital;
    private String titulo;
    private String conteudo;
    private Acesso acesso;

    public LivroProxy(String titulo, String conteudo, Acesso acesso) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.acesso = acesso;
    }

    @Override
    public void ler() {
        if (livroDigital == null) {
            livroDigital = new LivroDigital(titulo, conteudo);
        }

        acesso.ler(livroDigital);
    }
}
