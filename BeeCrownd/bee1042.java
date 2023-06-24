package BeeCrownd;

import java.util.Arrays;
import java.util.Scanner;

public class bee1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três valores inteiros:");
        int[] valores = new int[3];
        
        for (int i = 0; i < 3; i++) {
            valores[i] = scanner.nextInt();
        }
        int[] valoresOriginais = Arrays.copyOf(valores, valores.length); //Arrays.copyOf() é um método da classe 
                                                                         //java.util.Arrays em Java,  
                                                                         //que permite criar uma cópia de um array
        Arrays.sort(valores);                                            //existente com um tamanho especificado.
        System.out.println("Valores em ordem crescente:");
        for (int i = 0; i < 3; i++) {
            System.out.println(valores[i]);
        }

        System.out.println();
        System.out.println("Valores na sequência original:");
        for (int i = 0; i < 3; i++) {
            System.out.println(valoresOriginais[i]);
        }

        scanner.close();
    }
}