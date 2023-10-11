package Estudos;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {3,5,1,2,4};

        System.out.print("Vetor desorganizado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        for(int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("");
        System.out.print("Vetor organizado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
