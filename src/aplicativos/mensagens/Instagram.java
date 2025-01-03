package aplicativos.mensagens;

import aplicativos.servicos.ServicoInternet;
import aplicativos.servicos.ServicoMensagem;

public class Instagram implements ServicoMensagem, ServicoInternet {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Mensagem enviada pelo Facebook");
    }

    public void receberMensagem(){
        validarInternet();
        System.out.println("Mensagem enviada pelo Facebook");
    }

    @Override
    public void validarInternet() {

    }
}

