package BeeCrownd;

import java.util.Scanner;

public class bee1052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] mes = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        System.out.print("Coloque o numero do mes e ele aparecera por extenso: ");
        int escolha = scanner.nextInt();
        String mesEscolhido = mes[escolha - 1];
        
        System.out.println(mesEscolhido);
        scanner.close();
    }
}
