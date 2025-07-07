package org.example.exercicioProxy1;

public class LivroDigital implements Livro {

    private String titulo;
    private String conteudo;

    public LivroDigital(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void ler() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
