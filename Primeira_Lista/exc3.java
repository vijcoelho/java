package Primeira_Lista;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque seu nome e em seguida a idade");
        String nome = scanner.next();
        int idade = scanner.nextInt();

        String resultado = (idade>=18) ? "pode dirigir" : "não pode dirigir";
        System.out.println(nome+" "+ resultado);

        scanner.close();
    }
}
