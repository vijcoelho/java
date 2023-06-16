package JAVA_EXC;

import java.util.Scanner;

public class exc33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        int sum = computeDigitSum(number);

        System.out.println("The sum of the digits is: " + sum);

        scanner.close();
    }

    public static int computeDigitSum(int number) {
        int sum = 0;

        // Handle negative numbers by converting them to positive
        number = Math.abs(number);

        // Iterate through each digit and add it to the sum
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}