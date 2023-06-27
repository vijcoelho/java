package BeeCrowd;

import java.util.Locale;
import java.util.Scanner;

public class bee1043 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } 
        else {
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", area);
        }

        scanner.close();
    }
}

