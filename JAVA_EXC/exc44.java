package JAVA_EXC;

import java.util.Scanner;

public class exc44 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        String n = scanner.nextLine();

        juntar(n);
        scanner.close();
    }

    public static void juntar(String n) {
        System.out.print(n+ " + "+ n+n + " + " + n+n+n);
    }
}
