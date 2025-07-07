package org.example.exercicioProxy2;

public class ServicoSmsProxy implements Sms {

    private ServicoSms servicoSms;
    private Integer contador;

    public ServicoSmsProxy() {
        contador = 0;
    }

    @Override
    public void envia(String numero, String mensagem) {
        if (servicoSms != null) {
            servicoSms = new ServicoSms();
        }

        /*
        Mais alguma lógica de reiniciar quando chegar 00:00
         */

        if (contador < 3) {
            servicoSms.envia(numero, mensagem);
        }
        else {
            contador += 1;
        }
    }
}
