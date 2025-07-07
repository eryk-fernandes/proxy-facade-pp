package org.example.exercicioFacade1;

public class ReprodutorVideoFacade {

    private CarregadorDeArquivo carregador;
    private DecodificadorDeVideo video;
    private DecodificadorDeAudio audio;
    private Reprodutor reprodutor;

    public ReprodutorVideoFacade(CarregadorDeArquivo carregador, DecodificadorDeVideo video, DecodificadorDeAudio audio, Reprodutor reprodutor) {
        this.carregador = carregador;
        this.video = video;
        this.audio = audio;
        this.reprodutor = reprodutor;
    }

    public void reproduzirVideo(String nomeArquivo) {
        carregador.carregar(nomeArquivo);
        audio.decodificar();
        video.decodificar();
        reprodutor.reproduzir();
    }

}
