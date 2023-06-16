import java.util.Scanner;
import java.util.Random;

public class Adivinha {
    public static void main(String[] args) {
        System.out.print("\nBem vindo ao Adivinha em JAVA.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        int contador = 0;
        while (contador < 3){
        contador ++;
        System.out.print("\nSeu Chute: ");
        int num = scanner.nextInt();
        if (num == randomNumber) {
            System.out.println("\nAcertou o número secreto");
            break;
        }
        else if (num > randomNumber) {
            System.out.println("Número escolhido é maior que o sorteado");
        }
        else {
            System.out.println("Número escolhido é menor que o sorteado");
        }
        }
    scanner.close();
    }
}