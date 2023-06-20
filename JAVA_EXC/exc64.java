package JAVA_EXC;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exc64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Only accepts two integer values between 25 and 75");
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        boolean result = hasCommonDigit(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static boolean hasCommonDigit(int num1, int num2) {
        Set<Integer> digitsSet = new HashSet<>();

        while (num1 > 0) {
            digitsSet.add(num1 % 10);
            num1 /= 10;
        }

        while (num2 > 0) {
            if (digitsSet.contains(num2 % 10)) {
                return true;
            }
            num2 /= 10;
        }

        return false;
    }
}