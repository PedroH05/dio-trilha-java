package aplicativos;

import aplicativos.servicos.ServicoCredito;
import aplicativos.servicos.ServicoSinal;

public class Telefone implements ServicoSinal, ServicoCredito {

    public void verificarSinal(){
        validandoSinal();
    }

    public void verificandoCredito() {
        validandoCredito();
    }

    public void validandoTelefone(){
        System.out.println("Ligando para mae | telefone");
    }

    @Override
    public void validandoSinal() {
        System.out.println("Validando sinal");
    }

    @Override
    public void validandoCredito() {
        System.out.println("Validando Credito");
    }
}
