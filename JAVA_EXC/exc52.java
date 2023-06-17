package JAVA_EXC;

import java.util.Scanner;

public class exc52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int n1 = scanner.nextInt();
        System.out.print("Input the first number : ");
        int n2 = scanner.nextInt();
        System.out.print("Input the first number : ");
        int n3 = scanner.nextInt();

        boolean ehvalido = validar(n1, n2, n3);
        System.out.print("The result is: "+ ehvalido);

        scanner.close();
    }

    public static boolean validar(int n1, int n2, int n3) {
        return (n1 + n2 == n3);
    }
}
