package BeeCrowd;

import java.util.Scanner;

public class bee1154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIdades = 0;
        int quantidadeIndividuos = 0;

        while (true) {
            System.out.print("Digite a idade (ou um valor negativo para encerrar): ");
            int idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            totalIdades += idade;
            quantidadeIndividuos++;
        }

        if (quantidadeIndividuos > 0) {
            double mediaIdades = (double) totalIdades / quantidadeIndividuos;
            System.out.println(String.format("A idade média é: %.2f",mediaIdades));
        } else {
            System.out.println("Nenhum dado foi fornecido.");
        }

        scanner.close();
    }
}