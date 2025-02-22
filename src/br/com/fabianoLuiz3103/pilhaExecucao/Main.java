package br.com.fabianoLuiz3103.pilhaExecucao;

public class Main {

    /*
    Um programa java começa e termina no método main
     */
    public static void main(String[] args) {
        System.out.println("Iniciou o programa no método main.");
        a();
        System.out.println("Finalizou o programa no método main");
    }

    private static void a(){
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    private static void b(){
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++){
            System.out.print(i + (i==4?".":","));
        }
        c();
        System.out.println("Finalizou o método b.");
    }

    private static void c(){
        System.out.println("\nEntrou no método c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
