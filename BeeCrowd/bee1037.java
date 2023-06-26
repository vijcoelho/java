package BeeCrowd;

import java.util.Locale;
import java.util.Scanner;

public class bee1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double numero = scanner.nextDouble();

        resultado(numero);
        scanner.close();
    }

    public static void resultado(double numero) {
        if (numero > 0.00 && numero == 0.00) {
            System.out.println("Intervalo [0,25]");
        } else if (numero > 25.00 && numero < 50.01) {
            System.out.println("Intervalo (25,50]");
        } else if (numero > 50.00 && numero < 75.01) {
            System.out.println("Intervalo (50,75]");
        } else if (numero > 75.00 && numero < 100.01) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }
    }
}