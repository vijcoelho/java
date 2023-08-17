package Terceira_Lista;

import java.util.*;

public class exc4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer>vetor=new ArrayList<Integer>();

        int num=scanner.nextInt();
        vetor.add(0);
        vetor.add(1);

        while(vetor.size() < num) {
            int tamanho=vetor.size();
            int proximoNum=vetor.get(tamanho-1)+vetor.get(tamanho-2);
            vetor.add(proximoNum);
        }
        for(int i: vetor) {
            System.out.print(i+" ");
        }
        scanner.close();
    }
}
