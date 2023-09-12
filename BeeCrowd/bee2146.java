package BeeCrowd;

import java.util.Scanner;

public class bee2146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] x = new int [4];

        for (int i = 0; i < 4; i++) {
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < x.length; i++) {
            x[i] -= 1;           
        }

        for (int i : x) {
            System.out.println(i);
        }

        scanner.close();
    }
}