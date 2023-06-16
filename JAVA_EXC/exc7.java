package JAVA_EXC;
import java.util.Scanner;
public class exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number:");
        int n = scanner.nextInt();
        for (int i = 0; i < 11; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
    
}
