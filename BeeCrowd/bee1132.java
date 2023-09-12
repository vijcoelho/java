package BeeCrowd;

import java.util.Scanner;

public class bee1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = 0;

        for(int i = x; i <= y; i++) {
            if(i % 13 != 0) {
                z += i;
            }
        }
        System.out.println(z);
        scanner.close();
    }
}