package Exc_Classes;

import java.util.Scanner;

class Banco {
    private String nome;
    private int saldo;
    private int num_conta;
    private Scanner scanner;

    public Banco() {
        this.scanner = new Scanner(System.in);
    }

    public void informacoes() {
        clearScreen();
        System.out.println("\tColoque as seguintes informações para acessar sua conta.");
        System.out.print("\tNúmero da Conta: ");
        num_conta = scanner.nextInt();
        System.out.print("\tNome: ");
        nome = scanner.next();
    }

    public void extrato() {
        clearScreen();
        System.out.println("\tNúmero da Conta: " + num_conta);
        System.out.println("\tSaldo: " + saldo);
        pressioneEnter();
    }

    public void deposito() {
        clearScreen();
        System.out.print("\tInforme o quanto deseja depositar: ");
        int deposito = scanner.nextInt();
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("\tDepósito realizado com sucesso!");
        } else {
            System.out.println("\tValor de depósito inválido.");
        }
        pressioneEnter();
    }

    public void saque() {
        clearScreen();
        System.out.print("\tColoque o quanto deseja sacar: ");
        int quantidade = scanner.nextInt();
        if (quantidade <= saldo && quantidade > 0) {
            saldo -= quantidade;
            System.out.println("\tSaque realizado com sucesso!");
        } else {
            System.out.println("\tValor de saque inválido ou saldo insuficiente.");
        }
        pressioneEnter();
    }

    public void menu() {
        clearScreen();
        System.out.println("\tBem-vindo ao Banco");
        System.out.println("\t1 - Entrar");
        System.out.println("\t2 - Deposito");
        System.out.println("\t3 - Saque");
        System.out.println("\t4 - Extrato");
        System.out.println("\t5 - Sair");
        System.out.print("\tSelecione o que deseja realizar: ");
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void pressioneEnter() {
        System.out.print("\nPressione Enter para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }
}

public class classeContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            banco.menu();
            int pergunta = scanner.nextInt();

            if (pergunta == 1) {
                banco.informacoes();
            } else if (pergunta == 2) {
                banco.deposito();
            } else if (pergunta == 3) {
                banco.saque();
            } else if (pergunta == 4) {
                banco.extrato();
            } else if (pergunta == 5) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
