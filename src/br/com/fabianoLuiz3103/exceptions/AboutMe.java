package br.com.fabianoLuiz3103.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        POSSÍVEIS EXCEÇÕES:
            - Não informar o nome e sobrenome;
            - O valor da idade ter caractere não numérico
            - O valor da altura ter um . ao invés de , conforme o padrão br
         */

        try{
            System.out.println("Informe seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Informe seu sobrenome: ");
            String sobrenome = scanner.nextLine();
            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Informe sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("\nOlá me chamo: " + nome + " " + sobrenome +
                    "\nTenho " + idade + " anos e " + altura + " de altura");
            scanner.close();
        }catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }


    }
}
