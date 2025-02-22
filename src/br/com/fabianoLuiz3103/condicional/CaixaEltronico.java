package br.com.fabianoLuiz3103.condicional;

public class CaixaEltronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        /*
        Condicional simples
         */
        if(valorSolicitado < saldo){
            saldo = saldo-valorSolicitado;
        }
        System.out.println(saldo);

        /*
        Condicional composta
         */
        if(valorSolicitado < saldo){
            saldo = saldo-valorSolicitado;
        }else{
            System.out.println("Saldo insuficiente!");
        }

        double score = 6.7;
        /*
        Condicional encadeada
         */
        if(score >= 7){
            System.out.println("Bom");
        }else if (score >= 5 && score < 7){
            System.out.println("Medio");
        }else{
            System.out.println("Ruim");
        }

        /*
        Ternário
         */
        String imprimirSaldo = saldo > 0 ? "Cliente seu sado é de R$"+saldo : "Cliente sua conta está zerada!"; //simples
        String resultadoScore = score >= 7 ? "Seu score está bom!" : score >= 5 && score < 7 ? "Seu score é médio":"Seu score é ruim"; //encadeado
        System.out.println(imprimirSaldo);
        System.out.println(resultadoScore);

        /*
        Switch Case - caso que poderia ser usado if-else
         */
        int codigoVerificadorConta = 3;
        switch (codigoVerificadorConta){
            case 0:
                System.out.println("Sua conta é da região A");
            break;
            case 1:
                System.out.println("Sua conta é da região B");
            break;
            case 2:
                System.out.println("Sua conta é da região C");
            break;
            case 3:
                System.out.println("Sua conta é da região D");
            break;
            default:
                System.out.println("Código de região inválido!");
        }
        /*
        O caso acima poderia ser facilmente trocado por if-else

        -->>> O caso abaixo é um BOM EXEMPLO! para switch-case
        Por que usando if-else 100 minutos de ligação ia ser escrito 3 vezes no código, por que faz parte dos 3 planos
        já no switch case só escrito uma vez, porque sem o break se eu escolher o plano T (tem tudo) o código
        vai executar até o último case. Se eu escolher o B vai exibir só o conteúdo dele pq não tem mais case abaixo
         */

        String plano = "T";
        switch (plano){
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whats e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
}
