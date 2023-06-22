package BeeCrownd;

import java.util.Locale;
import java.util.Scanner;

public class bee1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //Faz com que o (.) se torne o separador decimal igual dos US

        double r = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * (r * r);

        System.out.println(String.format("A = %.4f", area));

        scanner.close();
    }
}
