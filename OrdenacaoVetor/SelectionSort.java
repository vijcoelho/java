package OrdenacaoVetor;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = {3,5,1,2,4};

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

        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
