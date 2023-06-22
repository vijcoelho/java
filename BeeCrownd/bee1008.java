package BeeCrownd;

import java.util.Locale;
import java.util.Scanner;

public class bee1008 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double paid = scanner.nextDouble();

        double total = hours * paid;

        System.out.println("Number = "+ number);
        System.out.println(String.format("Salary = U$ %.2f", total));

        scanner.close();
    }
}