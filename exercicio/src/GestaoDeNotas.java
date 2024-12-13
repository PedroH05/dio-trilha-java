import java.util.Locale;
import java.util.Scanner;

public class GestaoDeNotas {

    static int quantidadeDeMaterias;
    static String nome;
    static String disciplinas = ""; // Variável para armazenar os nomes das disciplinas
    static double somaNotas = 0; // Soma das notas para calcular a média

    public static void main(String[] args) {
        gravarNomes();
        gravarQuantidadeDeMaterias();
        nomeMateriasEGravarNotas();

        System.out.println("\n--- RELATÓRIO DO ALUNO ---");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Quantidade de matérias: " + quantidadeDeMaterias);
        System.out.println("Disciplinas cursadas:");
        System.out.println(disciplinas);

        double media = somaNotas / quantidadeDeMaterias;
        System.out.println("\nMédia Geral: " + media);

        if (media >= 7) {
            System.out.println("SITUAÇÃO FINAL: APROVADO");
        } else if (media >= 5) {
            System.out.println("SITUAÇÃO FINAL: RECUPERAÇÃO");
        } else {
            System.out.println("SITUAÇÃO FINAL: REPROVADO");
        }
    }

    static void gravarNomes() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();
    }

    static void gravarQuantidadeDeMaterias() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantas disciplinas você cursou? ");
        quantidadeDeMaterias = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número
    }

    static void nomeMateriasEGravarNotas() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 1; i <= quantidadeDeMaterias; i++) {
            System.out.println("Digite o nome da disciplina " + i + ": ");
            String disciplina = scanner.nextLine();
            disciplinas += i + " - " + disciplina + "\n";

            System.out.println("Digite a nota da disciplina " + disciplina + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;

            scanner.nextLine(); // Consumir a quebra de linha após o número
        }
    }
}
