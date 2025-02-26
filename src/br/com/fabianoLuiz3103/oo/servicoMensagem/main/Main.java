package br.com.fabianoLuiz3103.oo.servicoMensagem.main;

import br.com.fabianoLuiz3103.oo.servicoMensagem.model.Facebook;
import br.com.fabianoLuiz3103.oo.servicoMensagem.model.MSNMessenger;
import br.com.fabianoLuiz3103.oo.servicoMensagem.model.ServicoDeMensagem;

public class Main {

    public static void main(String[] args) {

        //Polimorfismo
        /*
        A referência é genérica e o método escolhido vai ter a
        implementação do objeto específico que está sendo referenciado.

        O polimorfismo permite que uma referência de tipo genérico (superclasse ou interface) aponte para objetos de diferentes classes (subclasses).
Quando um método é chamado através dessa referência, a implementação específica do objeto que está sendo referenciado é executada.
Isso permite que diferentes classes implementem seus próprios comportamentos para o mesmo método, promovendo flexibilidade e reutilização de código.
*/

        ServicoDeMensagem servicoDeMensagem = null;
        String servicoEscolhido = "msn";

        if(servicoEscolhido.equals("msn")){
            servicoDeMensagem = new MSNMessenger();
        }else if(servicoEscolhido.equals("facebook")){
            servicoDeMensagem = new Facebook();
        }else{
            System.out.println("Serviço inválido!");
        }

        servicoDeMensagem.enviarMensagem();
        servicoDeMensagem.receberMensagem();
    }
}
