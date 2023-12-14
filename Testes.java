public class Testes {
    public static void main(String[] args) {
        
        int vetor[] = {9,5,2,3,1,4,7,6,10};
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("Maior: "+ maior);

        for(int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
