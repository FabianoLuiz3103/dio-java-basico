package br.com.fabianoLuiz3103.revEnum;

public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    BAHIA("BA", "Bahia"),
    MINAS_GERAIS("MG", "Minas Gerais")
    ;


    private final String sigla; //final garante a imutabilidade
    private final String nome;

    EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
