package BeeCrowd;

import java.util.Scanner;

public class bee2413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            int p = t * 4;
            System.out.println(p);
        }

        scanner.close();
    }
}
