package aplicativos;

import aplicativos.servicos.ServicoInternet;
import aplicativos.servicos.ServicoMensagem;

public class MusicApple implements ServicoInternet {

    public void escolhendoMusica(){
        validarInternet();
        System.out.println("Escolhendo a musica | music");
        System.out.println("Musica escolhida foi You shook me all night long | music");
    }

    @Override
    public void validarInternet() {

    }
}
