package br.com.fabianoLuiz3103.oo.equipamentoMultifuncional;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{
    @Override
    public void copiar() {
        System.out.println("Copiando");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo");
    }
}
