package Segunda_Lista;

import java.util.Scanner;

public class exc4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int soma=0;
        for(int i=0; i<=num; i++) {
            if(i%2==0){
                soma+=i;
            }
        }
        System.out.println(soma);
        scanner.close();
    }
}
