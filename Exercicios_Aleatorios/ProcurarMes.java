package Exercicios_Aleatorios;

import java.util.Scanner;

public class ProcurarMes {
    public static void main(String[] args) {
        String[] mes = new String [12];
        
        mes[0] = "Janeiro";
        mes[1] = "Fevereiro";
        mes[2] = "Março";
        mes[3] = "Abril";
        mes[4] = "Maio";
        mes[5] = "Junho";
        mes[6] = "Julho";
        mes[7] = "Agosto";
        mes[8] = "Setembro";
        mes[9] = "Outubro";
        mes[10] = "Novembro";
        mes[11] = "Dezembro";

        Scanner scanner = new Scanner(System.in);
        int pergunta = scanner.nextInt();

        if (pergunta >= 1 && pergunta <= 12) {
            String nomeDoMes = mes[pergunta - 1];
            System.out.println(nomeDoMes);
        } else {
            System.out.println("Mes invalido");
        }
        scanner.close();
    }
}
