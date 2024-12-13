import java.util.Locale;
import java.util.Scanner;

public class Notas {

    static double primeiraNota;
    static double segundaNota;
    static double terceiraNota;
    static double resultadoMedia;

    public static void main(String[] args) {

        guardarNotas();
        calcularNotas();
    
        System.out.println("NOTAS: ");
        System.out.println("1 - " + primeiraNota);
        System.out.println("2 - " + segundaNota);
        System.out.println("3 - " + terceiraNota);
        System.out.println("MEDIA FINAL: " + resultadoMedia);
        System.out.println("SITUACAO FINAL: " + vereficarSePassou()); 
    }

    static void guardarNotas() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua primeira nota: ");
        primeiraNota = scanner.nextDouble(); 
        System.out.println("Digite sua segunda nota: ");
        segundaNota = scanner.nextDouble(); 

        System.out.println("Digite sua terceira nota: ");
        terceiraNota = scanner.nextDouble(); 
    }

    static void calcularNotas() {

        resultadoMedia = (primeiraNota + segundaNota + terceiraNota) / 3; 
    }

    static String vereficarSePassou() {
        if (resultadoMedia >= 7) { 
            return "APROVADO";
        } else if (resultadoMedia >= 4) { 
            return "RECUPERAÇÃO"; 
        } else { // Reprovado
            return "REPROVADO";
        }
    }
}
