import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    static String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
    static final double SALARIO_BASE = 2000.0;

    public static void main(String[] args) {
        System.out.println("Processo Seletivo.");
        imprimirSelecionados();
        selecaoCandidatos();
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
                System.out.println("Tentativa " + tentativasRealizadas + " para contato com " + candidato);
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA.");
        else
            System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS: " + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n: " + indice + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;

        ArrayList<String> candidatosAprovados = new ArrayList<>();

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (SALARIO_BASE >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosAprovados.add(candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

        if (candidatosSelecionados < 5) {
            System.out.println("Não foi possível selecionar todos os candidatos necessários.");
        }

        System.out.println("\nCandidatos selecionados:");
        for (String aprovado : candidatosAprovados) {
            System.out.println("- " + aprovado);
            entrandoEmContato(aprovado);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        if (SALARIO_BASE > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (SALARIO_BASE == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
