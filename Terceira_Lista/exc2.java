package Terceira_Lista;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Coloque um número para ver ser fatorial: ");
        int num=scanner.nextInt();
        int fatorial=1;
        System.out.print("Coloque 1 para fazer no for loop ou 2 para fazer no while: ");
        int pergunta=scanner.nextInt();

        if (pergunta==1) {
            for (int i=1; i<=num; i++) {
                fatorial*=i;
            }
            System.out.println(fatorial);
        } 
        else if (pergunta==2) {
            int i=1;
            while (i<=num) {
                fatorial*=i;
                i++;
            }
            System.out.println(fatorial);
        } 
        else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
