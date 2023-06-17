package JAVA_EXC;

import java.util.Scanner;

public class exc62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = scanner.nextInt();
        System.out.print("Input the second number : ");
        int b = scanner.nextInt();
        System.out.print("Input the third number : ");
        int c = scanner.nextInt();

        Boolean resultado = validar(a,b,c);
        System.out.print(resultado);
    
        scanner.close();
    }

    public static Boolean validar(int a, int b, int c) {
        int Ra = a % 20;
        int Rb = b % 20;
        int Rc = c % 20;

        return Ra == Rb || Ra == Rc || Rb == Rc;
    }
}
