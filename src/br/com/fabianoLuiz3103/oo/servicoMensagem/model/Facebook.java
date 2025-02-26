package br.com.fabianoLuiz3103.oo.servicoMensagem.model;

public class Facebook extends ServicoDeMensagem{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
