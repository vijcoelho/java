package Terceira_Lista;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // 2346 % 10 = 6 pega o ultimo digito
        // Veja ainda que, para desconsiderar o último dígito de um número, basta dividi-lo por 10
        // 2346 / 10 = 234

        int num=scanner.nextInt();
        
        int i=funcao(num);
        System.out.println(i);

        scanner.close();
    }
    public static int funcao(int num) {
        int ultimo_num=num%10;
        int primeiro_num=num/10;
        int soma=ultimo_num+primeiro_num;
        return soma;
    }
}
