package BeeCrowd;

import java.util.Scanner;

public class bee1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float number;
        int bigger = 0;

        for(int i = 0; i <= 5; i++){
            number = scanner.nextFloat();
            if (number > 0) {
            bigger ++;
            }
        }
            
        System.out.print(bigger + " valores positivos");

        scanner.close();
    }
}
