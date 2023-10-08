package OrdenacaoVetor;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = {3,5,1,2,4};

        System.out.print("Vetor desorganizado: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < vetor.length; i++) {
            
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }

        System.out.println("");
        System.out.print("Vetor organizado: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
