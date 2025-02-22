package br.com.fabianoLuiz3103.repeticao;

public class ExemploBreakContinue {

    public static void main(String[] args) {

        /*
        break;
        Quando o i == 3 o for vai ser encerrado então só vai exibir
        1 e 2
         */
        for(int i = 1; i <= 5; i++){
            if(i == 3)
                break;
            System.out.print(i + ",");
        }

        /*
        continue
        Quando o i == 3 a iteração vai ser interrompida,
         ou seja, volta para o início (próxima iteração) ou fim se era a última
        vai imprimir 1,2,4,5 porque no 3 o continue faz ir para i=4 antes de 3 ser exibido
         */
        System.out.println();
        for(int i = 1; i <= 5; i++){
            if(i == 3)
                continue;
            System.out.print(i + ",");
        }

    }
}
