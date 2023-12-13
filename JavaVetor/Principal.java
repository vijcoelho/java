package JavaVetor;

import java.util.Scanner;

class Principal {
    public static void main(String[] args) {
    
        int[] vetor = new int[10];
        int quantElementos = 0;

        vetor[0] = 10;
        vetor[1] = 14;
        vetor[2] = 16;
        quantElementos = 3;

        Scanner scanner = new Scanner(System.in);

        for (int i = quantElementos; i < vetor.length && i < quantElementos + 3; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
            quantElementos++;
        }
        System.out.println();

        System.out.println("vetor:");
        for (int i = 0; i < quantElementos; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        int index = 0;
        int soma = 0;
        
        while(index < quantElementos) {
            vetor[index] += soma;
            index++;
        }
        System.out.println("Soma: "+ soma);
        System.out.println();

        int maior = vetor[0];
        
        for(int i = quantElementos; i < quantElementos + 2; i++) {
            if(maior < vetor[i + 1]) {
                maior = vetor[i];
            }
        }
        System.out.println("Maior elemento: ");
    }
}
