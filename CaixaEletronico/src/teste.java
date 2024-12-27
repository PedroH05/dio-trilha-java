import java.util.Locale;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String op; 

        do {
            System.out.println("Digite sua opcao (T, M, B): ");
            op = scanner.next();

            switch (op) {
                case "T": {
                    System.out.println("5Gb Youtube.");
                    break;
                }
                case "M": {
                    System.out.println("Whats e Instagram ilimitado.");
                    break;
                }
                case "B": {
                    System.out.println("100 minutos de ligação.");
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

            if (op.equals("T") || op.equals("M") || op.equals("B")) {
                break;
            }
        } while (true);

        System.out.println("Fim do programa.");
    }
}
