package BeeCrowd;

import java.util.Scanner;

public class bee1175 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int []vetor=new int[20];
        int num;

        for(int i=0; i<20; i++) {
            num=scanner.nextInt();
            vetor[i] = num;
        }
        for(int i=0; i<10; i++) {
            int aux=vetor[i];
            vetor[i]=vetor[19-i];
            vetor[19-i]=aux;
        }
        for(int i=0; i<20; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
        scanner.close();
    }
}
