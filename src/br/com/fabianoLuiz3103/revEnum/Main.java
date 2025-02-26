package br.com.fabianoLuiz3103.revEnum;

public class Main {

    public static void main(String[] args) {

        EstadoBrasileiro estado = EstadoBrasileiro.SAO_PAULO; //referência estado apotando para o objeto SAO_PAULO
        System.out.println(estado.getNome() + " - " + estado.getSigla());

        estado = EstadoBrasileiro.BAHIA;//referência estado apontando para o objeto BAHIA
        System.out.println(estado.getNome() + " - " + estado.getSigla());

        System.out.println("\nESTADOS:");
        for (EstadoBrasileiro eb : EstadoBrasileiro.values()){
            System.out.println("- " + eb.getNomeMaiusculo());
        }
    }
}
