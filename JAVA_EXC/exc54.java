package JAVA_EXC;

import java.util.Scanner;

public class exc54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = scanner.nextInt();
        System.out.print("Input the second number : ");
        int b = scanner.nextInt();
        System.out.print("Input the third number : ");
        int c = scanner.nextInt();

        Boolean validar = ehvalido(a,b,c);
        System.out.println("The result is: "+validar);
        scanner.close();
    }
    
    public static Boolean ehvalido(int a, int b, int c) {
        int div_a = a % 10;
        int div_b = b % 10;
        int div_c = c % 10;

        return div_a == div_b || div_a == div_c || div_b == div_c;
    }
}
