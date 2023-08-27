package Lista_Classe_CTC;

import java.util.Scanner;

class Calculadora {

    public void Operacoes(int num, int num2) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001b[2J\u001b[H");
        System.out.print("Escolha sua operacao (+,-,/ ou x): ");
        String pergunta = scanner.next();
        switch (pergunta) {
            case "+":
                int soma = num + num2;
                System.out.println(num+" + "+ num2 +" = "+ soma);
                break;
            case "-":
                int sub = num - num2;
                System.out.println(num+" - "+ num2 +" = "+sub);
                break;
            case "/":
                int div = num / num2;
                System.out.println(num+" / "+ num2 +" = "+ div);
                break;
            case "x":
                int mult = num * num2;
                System.out.println(num+" x "+ num2 +" = "+ mult);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        System.out.print("\u001b[2J\u001b[H");
        System.out.print("Valor do primeiro número: ");
        int num = scanner.nextInt();
        System.out.print("Valor do segundo número: ");
        int num2 = scanner.nextInt();
        
        calculadora.Operacoes(num, num2);
        scanner.close();
    }
}
