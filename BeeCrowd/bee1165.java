package BeeCrowd;

import java.util.Scanner;

public class bee1165 {
public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            int num = scanner.nextInt();
            if (num % num == 0 && num % 1 == 0) {
                System.out.println(num + " Não é primo");
            }
            else {
                System.out.println(num + " É primo");
            }
        }
    }
}