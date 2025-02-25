package br.com.fabianoLuiz3103.exemplos.processoSeletivo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessoSeletivo {

    private static final double SALARIO_BASE = 2000.0;
    private static final String PRETENSAO_MENOR = "LIGAR PARA O CANDIDATO";
    private static final String PRETENSAO_IGUAL = "LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA";
    private static final String PRETENSAO_MAIOR = "AGUARDANDO RESULTADO DEMAIS CANDIDATOS";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salarioPretendido = receberSalarioPretendido(scanner);
        scanner.close();
    }

    private static double receberSalarioPretendido(Scanner scanner){
        while (true){
            try{
                System.out.println("\n\tOlá candidato, informe sua pretenção salarial: ");
                double valor = scanner.nextDouble();
                if(valor > 0){return valor;}
                System.out.println("\n\tERRO! O valor não pode ser negativo. ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }


}
