package JAVA_EXC;

import java.util.Scanner;

public class exc53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the first number : ");
        int a = scanner.nextInt();
        System.out.print("Input the second number : ");
        int b = scanner.nextInt();
        System.out.print("Input the third number : ");
        int c = scanner.nextInt();

        Boolean v = validarNumero(a ,b ,c);
        System.out.println("The result is: " + v);
        scanner.close();
    }

    public static Boolean validarNumero(int a , int b, int c) {
        if (a < b && b < c) {
            return true;
        } else {
            return false;
        }
    }
}
