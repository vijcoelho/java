package JAVA_EXC;

import java.util.Scanner;

public class exc51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a number(string): ");
        String str = scanner.nextLine();
        
        try {
            int num = Integer.parseInt(str);
            System.out.println("The integer value is: " + num);
        } catch (NumberFormatException e){
            System.out.println("Only number!");
        }
        scanner.close();
    }
}
