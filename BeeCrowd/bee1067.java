package BeeCrowd;

import java.util.Scanner;

public class bee1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int ate = scanner.nextInt();
            if (ate < 0) {
                break;
            }
            int item = 0;
            while (item < ate){
                item++;
                if (item % 2 != 0){ 
                    System.out.print(item + " ");
                }
            }
            break;
        }
        scanner.close();
    }
}
