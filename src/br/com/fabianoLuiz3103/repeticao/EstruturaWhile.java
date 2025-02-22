package br.com.fabianoLuiz3103.repeticao;

import java.util.Random;

public class EstruturaWhile {

    public static void main(String[] args) {

        double mesada = 50.0;
        int numeroDoces = 0;
        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){ //para o valor não ficar negativo
                valorDoce = mesada;
            }
            System.out.println("Doce de R$"+valorDoce+" adicionado ao carrinho.");
            mesada=mesada-valorDoce;
            numeroDoces++;
            System.out.println("--> Valor atual mesada: R$"+mesada);
        }
        System.out.println("Mesada: R$"+mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em " + numeroDoces + " doces");
    }

    private static double valorAleatorio(){
        Random r = new Random();
        return r.nextDouble(5);
    }
}
