package br.com.fabianoLuiz3103.exemplos.ex01;

public class SmartTV {

    boolean ligada = false;
    int canal=1;
    int volume;

    public void ligarOudesligar(){ //botão liga/desliga
        ligada=!ligada;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int numeroCanal){
        canal = numeroCanal;
    }
    public String statusSmartTV(){
        return  "Ligada: " + ligada +
                "\nCanal: " + canal
                +"\nVolume: " + volume;
    }
}
