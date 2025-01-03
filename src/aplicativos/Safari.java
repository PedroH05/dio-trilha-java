package aplicativos;
import aplicativos.servicos.ServicoInternet;

public class Safari implements ServicoInternet {

    public void pesquisandoNaInternet(){
        validarInternet();
        System.out.println("Pesquisando alguma coisa na internet | safari");
    }

    @Override
    public void validarInternet() {
        System.out.println("Validando internet");
    }
}

