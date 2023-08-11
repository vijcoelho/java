package Segunda_Lista;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int soma=0;
        for(int i=0; i<=num; i++) {
            soma+=i;
        }
        System.out.println(soma);
        scanner.close();
    }
}
