// Fiz o 7 e o 8 junto na pasta do 6

package Terceira_Lista;

import java.util.*;

public class exc6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int numRandom=random.nextInt(100)+1;
        int tentativas=0;

        while (tentativas < 5) {
            tentativas ++;
            
            System.out.print("Chute um número de 1 a 100: ");
            int chance=scanner.nextInt();
            
            if (acerto(chance, numRandom)) {
                System.out.println("Você acertou o número.");
                break;
            } 
            else {
                if (chance>numRandom) {
                    System.out.println("Seu chute foi maior que o número secreto");
                }    
                else {
                    System.out.println("Seu chute foi menor que o número secreto");
                }
            if(tentativas >=  5) {
                System.out.println("Acabou as tentativas");
            }
        }
    }
    scanner.close();
}

    static boolean acerto(int chance, int numRandom) {
        return chance==numRandom;
    }
}
