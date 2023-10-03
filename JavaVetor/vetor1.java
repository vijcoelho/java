package JavaVetor;

public class vetor1 {
    public static void main(String[] args) {
        int []vetor = new int[10];
        int valor = 1;

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = valor;
            valor += 2;
            System.out.println(vetor[i]);
        }
        
    }
}
