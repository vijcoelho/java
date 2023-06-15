package JAVA_EXC;
import java.util.Scanner;
public class exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int n = scanner.nextInt();
        System.out.println("Input second number:");
        int n2 = scanner.nextInt();
        int soma = n + n2;
        int sub = n - n2;
        int mult = n * n2;
        int div = n / n2;
        int mod = n % n2;
        System.out.println(n + " + " + n2 + " = " + soma);
        System.out.println(n + " - " + n2 + " = " + sub);   
        System.out.println(n + " * " + n2 + " = " + mult);   
        System.out.println(n + " / " + n2 + " = " + div);
        System.out.println(n + " mod " + n2 + " = " + mod);
        scanner.close();    
    }
}
