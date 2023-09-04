package Lista_Classe_CTC;

import java.util.Scanner;

class Calculadora {
    
    private int num;
    private int num2;
    private int pergunta;
    private Scanner scanner;

    public Calculadora() {
        scanner = new Scanner(System.in);
    }

    public void chooseNumber() {
        System.out.println("\u001b[2J\u001b[H");
        System.out.print("PRIMEIRO NUMERO: ");
        num = scanner.nextInt();
        System.out.print("SEGUNDO NUMERO: ");
        num2 = scanner.nextInt();
    }

    public void soma() {
        System.out.println(num + num2);
    } 

    public void subtracao() {
        System.out.println(num - num2);
    }

    public void multi() {
        System.out.println(num * num2);
    }

    public void div() {
        System.out.println(num / num2);
    }

    public void contas() {
        System.out.println("\u001b[2J\u001b[H");
        System.out.println("1- SOMA | 2- SUB | 3- MULTI | 4- DIVISAO");
        System.out.print("ESCOLHA A CONTA DESEJADA: ");
        pergunta = scanner.nextInt();
        switch (pergunta) {
            case 1:
                System.out.println("\u001b[2J\u001b[H");
                System.out.print("SOMA: " );
                soma();
                break;

            case 2:
                System.out.println("\u001b[2J\u001b[H");
                System.out.print("SUBTRACAO: ");
                subtracao();
                break;

            case 3:
                System.out.println("\u001b[2J\u001b[H");
                System.out.print("MULTIPLICACAO: ");
                multi();
                break;

            case 4:
                System.out.println("\u001b[2J\u001b[H");
                System.out.print("DIVISAO: ");
                div();
                break;

            default:
                System.out.println("Escolha inválida!");
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.chooseNumber();
        calculadora.contas();
    }
}
