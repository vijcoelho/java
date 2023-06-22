package BeeCrownd;

import java.util.Scanner;

public class bee1065 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int par = 0;
        
        for (int i = 0; i < 5; i ++) {
            a = scanner.nextInt();
            if (a % 2 == 0) {
                par ++;
            }
        }
        
        System.out.println(par +" valores pares");
        scanner.close();
    }
}