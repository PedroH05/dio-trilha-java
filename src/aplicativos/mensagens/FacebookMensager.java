package aplicativos.mensagens;

import aplicativos.servicos.ServicoInternet;
import aplicativos.servicos.ServicoMensagem;

public class FacebookMensager implements ServicoInternet, ServicoMensagem {

    public void enviarMensagem(){
        validarInternet();
        System.out.println("Mensagem enviada pelo Facebook");
    }

    public void receberMensagem(){
        validarInternet();
        System.out.println("Mensagem enviada pelo Facebook");
    }


    public void validarInternet() {

    }
}
