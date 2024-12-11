
import java.util.Locale;
import java.util.Scanner;

public class banco {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu numero: ");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Numero: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Nome do cliente: " + nome + " " + sobrenome);
        System.out.println("Saldo: " + saldo);

    }
}
