package Primeira_Lista;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Segundo número: ");
        int b = scanner.nextInt();

        int resposta = (a>b) ? a:b;
        System.out.println("Maior número é: "+resposta);

        scanner.close();   
    }
}
