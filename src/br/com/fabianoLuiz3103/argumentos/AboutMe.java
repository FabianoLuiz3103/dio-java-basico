package br.com.fabianoLuiz3103.argumentos;

public class AboutMe {

    public static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("\nOlá me chamo: " + nome + " " + sobrenome +
        "\nTenho " + idade + " anos e " + altura + " de altura");
    }
}
