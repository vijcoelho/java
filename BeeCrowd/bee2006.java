package BeeCrowd;

import java.util.Scanner;

public class bee2006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cha = scanner.nextInt();
        int acertos = 0;
        int []competidores = new int [5];

        for (int i = 0; i < 5; i++) {
            competidores[i] = scanner.nextInt();
        }
        for (int i : competidores) {
            if(i == cha) {
                acertos++;
            }
        }
        System.out.println(acertos);
        scanner.close();
    }
}
