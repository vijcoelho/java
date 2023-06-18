package JavaVetor;

import java.util.Scanner;

public class exc3VETOR {
    public static void main(String [] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Notas digitadas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }
        double media = soma / 4;

        System.out.println("Média: " + media);

        scanner.close();
    }
}
