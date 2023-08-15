package BeeCrowd;

import java.util.Scanner;

public class bee1179 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int []par=new int[5];
        int []impar=new int[5];

        for(int i=0; i<5; i++) {
            int num=scanner.nextInt();
            if(num%2==0) {
                par[i]=num;
            }
            else {
                impar[i]=num;
            }
        }
        for(int i=0; i<par.length; i++) {
            if(par[i]!=0) {
                System.out.println("PAR:["+i+"]"+"="+par[i]);
            }
        }
        for(int i=0; i<impar.length; i++) {
            if(impar[i]!=0) {
                System.out.println("IMPAR:["+i+"]"+"="+impar[i]);
            }
        }
        scanner.close();
    }
}
