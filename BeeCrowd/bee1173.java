package BeeCrowd;

import java.util.Scanner;

public class bee1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        int[] vetor = new int[10];

        System.out.print("Digite um valor: ");
        valor = scanner.nextInt();

        vetor[0] = valor;

        for (int i = 1; i < 10; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }

        System.out.print("Vetor N[10]: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
