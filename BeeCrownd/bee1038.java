package BeeCrownd;

import java.util.Scanner;

public class bee1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CODIGO     ESPECIFICAÇAO     PREÇO");
        System.out.println("1         Cachorro-quente    R$ 4.00");
        System.out.println("2         X-Salada           R$ 4.50");
        System.out.println("3         X-Bacon            R$ 5.00");
        System.out.println("4         Torrada Simples    R$ 2.00");
        System.out.println("5         Refrigerante       R$ 1.00");
        System.out.println("0         Sair do programa   ========");

        
        double total = 0;
        while (true) { 
            int opcao = scanner.nextInt();  
            if (opcao == 1) {
                total = total + 4;
            } if (opcao == 2) {
                total = total + 4.50;
            } if (opcao == 3) {
                total = total + 5.00;
            } if (opcao == 4) {
                total = total + 2;
            } if (opcao == 5) {
                total = total + 1;               
            } if (opcao == 0) {
                System.out.println(String.format("Total: R$ %.2f",total));
                break;
            }      
        }
        scanner.close();
    }
}
