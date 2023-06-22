package BeeCrownd;

import java.util.Scanner;

public class bee1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            number = scanner.nextInt();
            if (number % 2 == 0) {
                par++;
            } if (number < 0) {
                negativo++;
            } if (number > 0) {
                positivo++;
            } if (number % 2 != 0) {
                impar++;
            }
        }

        System.out.println(par +" valor(es) par(es)");
        System.out.println(impar +" valor(es) impar(es)");
        System.out.println(positivo +" valor(es)positivo(s)");
        System.out.println(negativo +" valor(es) negativo(s)");

        scanner.close();
    }
}
