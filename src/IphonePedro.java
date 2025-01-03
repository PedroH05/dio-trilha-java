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

        System.out.println("\n");
        Safari safari = new Safari();
        safari.pesquisandoNaInternet();
        safari.validarInternet();

        System.out.println("\n");
        MusicApple music = new MusicApple();
        music.validarInternet();
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
