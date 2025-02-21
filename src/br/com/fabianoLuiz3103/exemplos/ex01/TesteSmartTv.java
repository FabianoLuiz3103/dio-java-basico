package br.com.fabianoLuiz3103.exemplos.ex01;

public class TesteSmartTv {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();
        System.out.println(smartTV.statusSmartTV());
        smartTV.ligarOudesligar();
        smartTV.mudarCanal(3);
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println(smartTV.statusSmartTV());
    }
}
