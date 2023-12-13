public class Testes {
    public static void main(String[] args) {
        
        int vetor[] = {1,2,3,4,5,6,77,8,9};
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println(maior);
    }
}
