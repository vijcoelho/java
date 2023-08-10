package TP2;

import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque seu nome: ");
        String nome = scanner.next();
        System.out.print("Coloque sua idade: ");
        int idade =  scanner.nextInt();

        if (idade<16) {
            System.out.println(nome+ " não pode votar e não pode ter habilitação.");
        } else if (idade>=16 && idade<18) {
            System.out.println(nome+ " pode votar, mas não pode ter habilitação.");
        } else if (idade>=18 && idade<70) {
            System.out.println(nome+" pode ter habilitação, mas não pode votar.");
        } else {
            System.out.println(nome+" pode ter habilitação e pode votar.");
        }

        scanner.close();
    }
}
