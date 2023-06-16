package JAVA_EXC;

import java.util.Scanner;

public class exc32 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer:");
        int number1 = scanner.nextInt();
        
        System.out.print("Input second integer:");
        int number2 = scanner.nextInt();        
        
        comparation(number1, number2);
        
        scanner.close();
    }

    public static void comparation(int number1, int number2) {
        if (number1 != number2) {
            System.out.println(number1 + " != " + number2);
        }
        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        }
        if (number1 <= number2) {
            System.out.println(number1 + " <= " + number2);
        }
        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        }
        if (number1 >= number2) {
            System.out.println(number1 + " >= " + number2);
        }
        if (number1 == number2) {
            System.out.println(number1 + " == " + number2);
        }
    }          
}
