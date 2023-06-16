package JAVA_EXC;

import java.util.Scanner;

public class exc21 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = scanner.nextInt();

        String octal = convertToOctal(decimal);

        System.out.println("Octal number is: " + octal);
        
        scanner.close();
    }

    public static String convertToOctal(int decimal) {
        StringBuilder sb = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 8;
            sb.insert(0, remainder);
            decimal /= 8;
        }

        return sb.toString();
    }
}
