package JAVA_EXC;
import java.util.Scanner;
public class exc19 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input a decimal number:");
        int num = scanner.nextInt();

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary number is: "+ binary);

        scanner.close();
    }
}
