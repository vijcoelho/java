import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Bem Vindo à Primeira Calculadora em Java");
        System.out.println("Digite o primeiro número e em seguida o segundo:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Opções:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("Escolha uma opção:");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            int soma = num1 + num2;
            System.out.println("Soma: " + soma);
        } else if (opcao == 2) {
            int sub = num1 - num2;
            System.out.println("Subtração: " + sub);
        } else if (opcao == 3) {
            if (num2 == 0) {
                System.out.println("Não é possível dividir por zero");
            } else {
                int div = num1 / num2;
                System.out.println("Divisão: " + div);
            }
        } else if (opcao == 4) {
            int multi = num1 * num2;
            System.out.println("Multiplicação: " + multi);
        } else {
            System.out.println("Escolha uma das opções válidas");
        }
    }
}