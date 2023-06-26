package BeeCrowd;

import java.util.Scanner;

public class bee1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] number =  new int [2];

        for(int i = 0; i < 2; i++) {
            number[i] = scanner.nextInt();
        }

        if (number[0] < number[1]) {
            System.out.println("Crescente");
        } else {
            System.out.println("Decrescente");
        }
            scanner.close();
    }
}
