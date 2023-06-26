package BeeCrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class bee1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        int number = 0;
        int position = 0;

        for (int i = 1; i < 101; i++) {
            System.out.print("Numero posicao " + i + " : ");
            number = scanner.nextInt();
            vetor.add(number);
            if (number > vetor.get(position)) {
                position = i - 1;
            }
        }

        int bigNumber = vetor.get(position);

        System.out.println("O maior numero é " + bigNumber);
        System.out.println("A posição do maior numero é " + (position + 1));

        scanner.close();
    }
}
