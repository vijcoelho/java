package BeeCrownd;

import java.util.Locale;
import java.util.Scanner;

public class bee1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        float number;
        int positive = 0;
        float sum = 0;

        for (int i = 0; i < 6; i++) {
            number = scanner.nextFloat();
            if (number > 0) {
                positive++;
                sum += number;
            }
        }

        System.out.println(positive + " valores positivos");

        if (positive > 0) {
            float media = sum / positive;
            System.out.printf("%.1f%n", media);
        }

        scanner.close();
    }
}