package Segunda_Lista;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Coloque um numero para ver sua tabuada: ");
        int num=scanner.nextInt();

        for(int i=0; i<11; i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        scanner.close();
    }
}


