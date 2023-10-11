package Estudos;

import java.util.Scanner;

public class BuscaLinear {
    
    public static boolean buscaLinear(int vetor[], int num) {
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = {1,4,7,3,9,12};
        int num = scanner.nextInt();

        boolean encontrado = buscaLinear(vetor, num);

        if(encontrado) {
            System.out.println(num + " foi encontrado");
        } else {
            System.out.println(num + " nao foi encontrado");
        }

        scanner.close();
    }
}

