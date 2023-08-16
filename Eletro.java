import java.util.Locale;
import java.util.Scanner;

public class Eletro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("O que quer calcular: V, R ou I?");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("V")) {
            double r = scanner.nextDouble();
            double i = scanner.nextDouble();
            double v = r * i;
            System.out.println("O valor da tensão (V) é: " + v);
        }
        else if (resposta.equalsIgnoreCase("R")) {
            double v = scanner.nextDouble();
            double i = scanner.nextDouble();
            double r = v / i;
            System.out.println("O valor da resistência (R) é: " + r);
        }
        else if (resposta.equalsIgnoreCase("I")) {
            double v = scanner.nextDouble();
            double r = scanner.nextDouble();
            double i = v / r;
            System.out.println("O valor da corrente (I) é: " + i);
        }
        else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
