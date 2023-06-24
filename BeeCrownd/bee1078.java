package BeeCrownd;

import java.util.Scanner;

public class bee1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i +" x "+number+" = "+(number * i));
        }

        scanner.close();
    }
}
