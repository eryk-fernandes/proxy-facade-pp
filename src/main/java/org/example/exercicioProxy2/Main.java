package org.example.exercicioProxy2;


/* TODO:  ENVIO DE SMS
    A classe ServicoSms envia mensagens com código de verificação.
    A empresa decidiu que o número de envios dessas mensagens será limitado em 3 mensagens por dia.
    ...
    Aplique o padrão de Projeto Proxy neste contexto para controle de uso do serviço de mensagens, verificando o limite.

 */
public class Main {

    public static void main(String[] args) {
        ServicoSms sms = new ServicoSms();
        sms.envia("99999-9090", "Código de verificação: 123456");
        sms.envia("99999-9090", "Código de verificação: 567890");
    }
}
