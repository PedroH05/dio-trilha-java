package aplicativos.mensagens;

import aplicativos.servicos.ServicoInternet;
import aplicativos.servicos.ServicoMensagem;

public class Whatsapp implements ServicoInternet, ServicoMensagem {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo Whatsapp");
    }

    public void receberMensagem(){
        validarInternet();
         System.out.println("Mensagem recebida pelo Whatsapp");
    }

    @Override
    public void validarInternet() {
        System.out.println("Validando internet");
    }
}


