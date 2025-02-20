package br.com.fabianoLuiz3103.anatomiaDasClasses;

public class MinhaClasse {

    //se a classe for executável precisa ter o método main
    public static void main(String[] args) {

       //declarando variáveis
        int anoFabricacao = 2023;
        String marca = "Adidas";
        double preco = 27.9;
        boolean temNoEstoque;
        temNoEstoque = true;
        anoFabricacao = 2019;

        //declarando constantes
        final String CODIGO_FILIAL01 = "009001";
       // CODIGO_FILIAL01 = "00012"; --> Não é possível porque é constante

    }

    /*
    declarando métodos -> nesse caso, esse método precisa ser static
    para poder ser chamado dentro da main que tb é static, ou eu teria que
    que criar uma istância de MinhaClasse na main
     */
    public int somar(int numeroUm, int numeroDois){
        return numeroUm+numeroDois;
    }

}
