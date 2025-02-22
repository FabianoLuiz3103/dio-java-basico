package br.com.fabianoLuiz3103.repeticao;

import java.util.Random;

public class EstruturaDoWhile {

    public static void main(String[] args) {

        /*
        Enquanto estiver discando vai esperar o colega atender
        usar do-while porque o telefone toca pelo menos uma vez
         */
        System.out.println("Discando...");

        do{
            //executa até alguém atender
            System.out.println("Telefone tocando....");
        }while (tocando());

        System.out.println("Alô!!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        /*
        se o random retornar 2 atendeu é falso, mas é negado e vira true
        ou seja, tocando continua true
        se for 1 atendeu true e o método tocando return false saindo do loop
         */
        return ! atendeu; //continuar tocando se atendeu n se n atendeu sim
    }
}
