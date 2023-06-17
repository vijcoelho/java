package JAVA_EXC;

import java.util.Scanner;

public class exc49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        int a = verificar(num);
        System.out.print(a);
        scanner.close();
    }

    private static int verificar(int num) {
        if (num % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
