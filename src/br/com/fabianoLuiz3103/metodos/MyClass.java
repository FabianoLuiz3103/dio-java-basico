package br.com.fabianoLuiz3103.metodos;

public class MyClass {

    /*
    public - visível para o programa inteiro
    private - visível somente para a classe
     */
    public double somar(int num1, int num2){
        return num1+num2;
    }

    public void imprimir(String texto){
        System.out.println(texto);
    }

    public double dividir(int dividendo, int divisor) throws Exception{
        return (double) dividendo /divisor;
    }

    private void metodoPrivado(){}

    //equívico estrutural
    public void validar(){} // esse método deveria retornar um true ou false
    //equívico estrutural
    public void calcularEnviar(){} // um método deve representgar uma única responsabilidade
    //equívico estrutural
    public void gravarCliente(String nome, String cpf, int idade){
        //informações de um cliente, por que não criar um objeto Cliente e passar como parâmetro?
    }
    /*
    public void gravarCliente(Cliente cliente){}
     */
}
