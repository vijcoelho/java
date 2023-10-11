package Estudos;

import java.util.Scanner;

public class BuscaBinaria {

    public static boolean buscaBinaria(int vetor[], int num) {
        int esq = 0;
        int dir = vetor.length - 1;

        while (esq <= dir) {
            int meio = (esq + dir) / 2;

            if (vetor[meio] == num) {
                return true;
            } else if (vetor[meio] < num) {
                esq = meio + 1;
            } else {
                dir = meio - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = {1, 3, 5, 7, 9, 11, 13};
        int num = scanner.nextInt();

        boolean encontrado = buscaBinaria(vetor, num);

        if (encontrado) {
            System.out.println(num + " foi encontrado no vetor.");
        } else {
            System.out.println(num + " não foi encontrado no vetor.");
        }
        
        scanner.close();
    }
}
