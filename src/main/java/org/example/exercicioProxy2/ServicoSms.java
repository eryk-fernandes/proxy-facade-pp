package org.example.exercicioProxy2;

public class ServicoSms {

    public void envia(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }
}
