package JAVA_EXC;
import java.util.Scanner;
public class exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        int numberOne = scanner.nextInt();
        System.out.print("Input second number:");
        int numberTwo = scanner.nextInt();
        int produto = numberOne * numberTwo;
        System.out.println(numberOne + " x " + numberTwo + " = " + produto);
        scanner.close();
    }
}
