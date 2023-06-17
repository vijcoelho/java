package JAVA_EXC;

import java.util.Scanner;

public class exc59 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a String: ");
        String inputString = scanner.nextLine();

        String lowercaseString = convertToLowercase(inputString);

        System.out.println("Converted String: " + lowercaseString);
    
        scanner.close();
    }

    public static String convertToLowercase(String inputString) {
        return inputString.toLowerCase();
    }
}