package br.com.fabianoLuiz3103.repeticao;

public class EstruturaFor {

    public static void main(String[] args) {

        /**
         * for para exibir os números de 1 a 10
         * @param i variável contadora
         * i <= 10 é a condição que controla a repetição, quando i > 10 o for não executa mais
         *     */
        for(int i = 1; i <= 10; i++){
            System.out.print(i + (i == 10?".":","));
        }
        /*
        Ordem de execução:
        1️⃣ Inicialização → Executada apenas uma vez no início.
        2️⃣ Condição → Verifica se o loop continua ou para.
        3️⃣ Execução do bloco → Se a condição for true, o código dentro do {} roda.
        4️⃣ Incremento/Decremento → Atualiza a variável de controle (i++ ou i--). --> dps de executar o bloco
        5️⃣ Volta para a condição e repete o processo até que a condição seja false.
         */

        /*
        For em vetores (arrays)
        i < alunos.lenght porque o vetor começa em 0, se ele tem 3 elementos vai ter length de 3
        mas o indice vai até 2
         */
        System.out.println();
        String[] alunos = {"João", "Fabiano", "Carlos", "Marcos", "Gustavo"};
        for(int i = 0; i < alunos.length; i++){
            System.out.println((i+1) + "º aluno: " + alunos[i] + " - posição no array: " + i);
        }

        /*
        ForEach para percorrer vetores
         */
        System.out.println("foreach");
        for(String aluno: alunos){
            System.out.println("- " + aluno);
        }
    }
}
