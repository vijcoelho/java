package BeeCrownd;

import java.util.Locale;
import java.util.Scanner;

public class bee1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        double n1 = scanner.nextDouble();  
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
        System.out.println(String.format("Media: %.1f",media));

        if (media > 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9 ) {
            System.out.println("Aluno em exame.");
            
            double nota_exame = scanner.nextDouble();
            System.out.println("Nota do exame: " +nota_exame);
            double mediafinal = (media + nota_exame) / 2;

            if (mediafinal >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + mediafinal);

            } else {
                System.out.println("Aluno reprovado.");
            }
        
        } else {
            System.out.println("Aluno reprovado.");
        }
        scanner.close();
    }
}
