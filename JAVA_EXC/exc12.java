package JAVA_EXC;
import java.util.Scanner;
public class exc12 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b){
            if (a > c) {
                System.out.println(a);
            }
        }
        if (b > a){
            if (b > c){
                System.out.println(b);
            }
        }
        if (c > b){
            if (c > a){
                System.out.println(c);
            }
        }
        scanner.close();
    }
}
