package br.com.fabianoLuiz3103.oo.servicoMensagem.model;

public class MSNMessenger extends ServicoDeMensagem{

    @Override
    public void enviarMensagem() {
        super.validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
}
