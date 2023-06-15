package JAVA_EXC;
import java.util.Scanner;
public class exc18 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first binary number:");
        String num = scanner.nextLine();

        System.out.println("Input the second binary number:");
        String num2 = scanner.nextLine();

        int decimal1 = Integer.parseInt(num ,2);
        int decimal2 = Integer.parseInt(num2 ,2);
        int prodDeci = decimal1 * decimal2;
        String binaryProd = Integer.toBinaryString(prodDeci);

        System.out.println("Product of two binary numbers: "+ binaryProd);

        scanner.close();
    }
}
