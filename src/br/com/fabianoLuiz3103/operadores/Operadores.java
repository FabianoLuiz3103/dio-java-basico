package br.com.fabianoLuiz3103.operadores;

public class Operadores {

    public static void main(String[] args) {

        /*
        Operador de atribuição:
        =
        Operadores aritméticos:
        +, -, *, /, %
         */
        int adicao  = 1 + 2;
        System.out.println("(+) 1 + 2: " + adicao);
        int subtracao = 3 - 2;
        System.out.println("(-) 3 - 2 " + subtracao);
        int multiplicacao = 5 * 7;
        System.out.println("(*) 5 * 7: " + multiplicacao);
        int divisao = 15 / 5;
        System.out.println("(/) 15 / 5: " + divisao);
        int modulo = 2 % 2;
        System.out.println("(%) 2 % 2: " + modulo);

        String concatenacao = "";

        /*
        Quando o primeiro caracter de string for identificado
        só a concatenação vai acontecer, no primeiro caso como
        ele é o último 1 ele faz a soma dos primeiros
        quando o parentêses é usado o trecho fica em evidência
        e é feito executado primeiro
         */

        concatenacao = 1+1+1+"1";
        System.out.println("1º resultado: " + concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println("2º resultado: " + concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println("3º resultado: " + concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println("4º resultado: " + concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println("5º resultado: " + concatenacao);

    }
}
