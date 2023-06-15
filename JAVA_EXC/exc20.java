package JAVA_EXC;
import java.util.Scanner;

public class exc20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = scanner.nextInt();

        String hexadecimal = convertToHexadecimal(decimal);

        System.out.println("Hexadecimal number is: " + hexadecimal);
        
        scanner.close();
    }   
    
    public static String convertToHexadecimal(int decimal) {
        StringBuilder sb = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexDigit = getHexDigit(remainder);
            sb.insert(0, hexDigit);
            decimal /= 16;
        }

        return sb.toString();
    }

    public static char getHexDigit(int value) {
        if (value >= 0 && value <= 9) {
            return (char) (value + '0');
        } else {
            return (char) (value - 10 + 'A');
        }
    
    }
 
}