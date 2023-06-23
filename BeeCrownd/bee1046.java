package BeeCrownd;

import java.util.Scanner;

public class bee1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int comeco = scanner.nextInt();
        int fim = scanner.nextInt();

        int tempo;
        if (comeco < fim) {
            tempo = fim - comeco;
        } else { 
            tempo = (24 - comeco) + fim;
        }

        System.out.println(String.format("O JOGO DUROU %s HORA(S)",tempo));
        scanner.close();
    }
}
