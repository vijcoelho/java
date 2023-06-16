package JAVA_EXC;

import java.util.Scanner;

public class exc37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = scanner.nextLine();

        inverter(str);

        scanner.close();
    }
    public static void inverter(String str) {
        for (int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
