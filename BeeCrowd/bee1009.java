package BeeCrowd;

import java.util.Locale;
import java.util.Scanner;

public class bee1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double salary = scanner.nextDouble();
        double percent = scanner.nextDouble();

        double total = salary + (percent * 0.15);

        System.out.println(String.format("Total  = R$ %.2f",total));

        scanner.close();
    }
}
