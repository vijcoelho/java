package BeeCrowd;

import java.util.Scanner;

public class bee1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int fatorial = 1;
            
        for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
        
        System.out.println(fatorial);
        scanner.close();
    }
}
