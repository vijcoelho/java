package BeeCrowd;

import java.util.Locale;
import java.util.Scanner;

public class bee1178 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in).useLocale(Locale.US);


        double []vetor=new double[10];
        double num=scanner.nextDouble();
        vetor[0]=num;

        for(int i=1; i<10; i++){
            vetor[i]=vetor[i-1]/2;
        }
        for(int i=0; i<10; i++){
            System.out.println(vetor[i]);
        }
        scanner.close();
    }
}
