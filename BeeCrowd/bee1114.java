package BeeCrowd;

import java.util.Scanner;

public class bee1114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int senha = scanner.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        
        scanner.close();
    }
}
