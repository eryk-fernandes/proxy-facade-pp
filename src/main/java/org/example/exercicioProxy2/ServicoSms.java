package org.example.exercicioProxy2;

public class ServicoSms implements Sms {

    public void envia(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }
}
