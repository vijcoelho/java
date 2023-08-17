package BeeCrowd;

import java.util.Scanner;

public class bee1101 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite o valor de M: ");
            int m=scanner.nextInt();
            
            System.out.print("Digite o valor de N: ");
            int n=scanner.nextInt();
            
            if (m<=0 || n<=0) {
                break;
            }
            int start = Math.min(m, n);
            int end = Math.max(m, n);
            
            int sequenceSum = 0;
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
                sequenceSum += i;
            }
            System.out.println("\nSoma dos inteiros consecutivos: "+sequenceSum+"\n");
        }
        scanner.close();
    }
}
