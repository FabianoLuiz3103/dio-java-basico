package br.com.fabianoLuiz3103.oo.servicoMensagem.model;

public class ServicoDeMensagem {

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet(){}

    private void salvarHistoricoMensagem(){}
}
