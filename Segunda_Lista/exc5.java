package Segunda_Lista;

import java.util.Scanner;

public class exc5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int divisores=0;
        for(int i=1; i<=num-1; i++) {
            if(i%3==0){
                divisores++;
            }
        }
        System.out.println(divisores);
        scanner.close();
    }
}
