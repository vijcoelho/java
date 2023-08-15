package BeeCrowd;

import java.util.Scanner;

public class bee1165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

        scanner.close();
    }
}
