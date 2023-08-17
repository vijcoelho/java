package Terceira_Lista;

import java.util.*;

public class exc5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int soma=0;
        int media=0;
        for(int i=0; i<10; i++) {
            int num=scanner.nextInt();
            soma+=num;
            media=soma/10;
        }
        System.out.println(media);
        scanner.close();
    }
}
