package Segunda_Lista;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        for(int i=num-1; i>=0; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
