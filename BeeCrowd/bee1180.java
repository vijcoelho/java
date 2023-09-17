package BeeCrowd;

import java.util.Scanner;

public class bee1180 {;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] x = new int[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        int menorValor = x[0];
        int posicao = 0;
        
        for (int i = 1; i < n; i++) {
            if (x[i] < menorValor) {
                menorValor = x[i];
                posicao = i;
            }
        }
        
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);
        
        scanner.close();
    }
}
