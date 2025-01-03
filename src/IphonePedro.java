import aplicativos.MusicApple;
import aplicativos.Safari;
import aplicativos.Telefone;
import aplicativos.mensagens.FacebookMensager;
import aplicativos.mensagens.Instagram;
import aplicativos.mensagens.Whatsapp;
import aplicativos.servicos.ServicoMensagem;

public class IphonePedro {
    public static void main(String[] args) {

        Telefone tel = new Telefone();
        tel.validandoSinal();
        tel.validandoCredito();
        tel.validandoTelefone();

        Safari safari = new Safari();
        safari.validarInternet();
        safari.pesquisandoNaInternet();

        MusicApple music = new MusicApple();
        music.escolhendoMusica();

        ServicoMensagem sm = null;
        String appEscolhido = "whats";

        if (appEscolhido.equals("insta")) {
            sm = new Instagram();
        } else if (appEscolhido.equals("face")) {
            sm = new FacebookMensager();
        } else if (appEscolhido.equals("whats")) {
            sm = new Whatsapp();
        }
        System.out.println("\n");
        sm.enviarMensagem();
        sm.receberMensagem();
    }
}
