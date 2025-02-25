package br.com.fabianoLuiz3103.exemplos.processoSeletivo;

import java.util.Random;

public class ProcessoSeletivo {

    private static final double SALARIO_BASE = 2000.0;
    private static final String PRETENSAO_MENOR = "LIGAR PARA O CANDIDATO";
    private static final String PRETENSAO_IGUAL = "LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA";
    private static final String PRETENSAO_MAIOR = "AGUARDANDO RESULTADO DEMAIS CANDIDATOS";

    public static void main(String[] args) {

        String[] candidatosSelecionados = selecionarCandidatos();
        exibirSelecionados(candidatosSelecionados);
    }

    private static void analisarCandidato(double salarioPretendido){
        if(salarioPretendido < SALARIO_BASE){
            System.out.println(PRETENSAO_MENOR);
        }else if(salarioPretendido == SALARIO_BASE){
            System.out.println(PRETENSAO_IGUAL);
        }else{
            System.out.println(PRETENSAO_MAIOR);
        }
    }

    private static double gerarSalarioPretendido(){
        Random r = new Random();
        return r.nextDouble(1800, 2200);
    }

    private static String[] pegarCandidatos(){
        return new String[]{"Fabiano", "Yolanda", "Carlos", "João", "Miguel", "Manoela", "Ricardo", "Marcelo", "Ezequiel",
        "Renato", "Erika", "Fernanda", "Sabrina", "Joana", "Marina", "Marlene", "Márcia", "Yoni", "Gustavo O."};
    }

    private static void exibirSelecionados(String[] selecionados){
        for(String s: selecionados){
            System.out.println(s);
        }
    }

    private static String[] selecionarCandidatos(){
        String[] candidatos = pegarCandidatos();
        String[] candidatosSelecionados = new String[5];
        int quantidadeSelecionados = 0;
        for (String c : candidatos) {
            double salarioPretendido = gerarSalarioPretendido();
            exibirPropostaDoCandidato(c, salarioPretendido);
            if (salarioPretendido <= SALARIO_BASE) {
                candidatosSelecionados[quantidadeSelecionados] = c + " sal. pretendido R$" + salarioPretendido;
                quantidadeSelecionados++;
            }
            if (quantidadeSelecionados == 5)
                break;
        }
        return candidatosSelecionados;
    }
    private static void exibirPropostaDoCandidato(String cadidato, double salarioPretendido){
        System.out.println("\tO candidato " + cadidato + " tem como pretensão salarial o valor de R$" + salarioPretendido
                + (salarioPretendido<=SALARIO_BASE?" -----> CANDIDATO SELECIONADO! " : "."));
    }
}
