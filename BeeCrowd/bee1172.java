package BeeCrowd;

import java.util.Scanner;

public class bee1172 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int []vetor=new int[10];
        for(int i=0; i<10; i++){
            int num=scanner.nextInt();
            if(num<=0){
                vetor[i]=1;
            }
            else{
                vetor[i]=num;
            }
        }
        for(int i=0; i<10; i++){
            System.out.println(vetor[i]);
        }
        scanner.close();
    }
}
