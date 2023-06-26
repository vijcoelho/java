package BeeCrowd;

import java.util.Scanner;

public class bee1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        for (int i = 0; i < 5; i++) {
            a = scanner.nextInt();

            if (a == 0) {
                System.out.println("NULL");
            } if (a % 2 == 0 && a > 0) {
                 System.out.println("EVEN POSITIVE");
            } if (a % 2 != 0 && a < 0) {
                System.out.println("ODD NEGATIVE");
            }
        }
        scanner.close();
    }
}