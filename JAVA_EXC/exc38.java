package JAVA_EXC;

import java.util.Scanner;

public class exc38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The string is : ");
        String str = scanner.nextLine();

        count(str);

        scanner.close();
    }
    
    public static void count(String str) {
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isSpaceChar(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("letter: " + letterCount);
        System.out.println("space: " + spaceCount);
        System.out.println("number: " + numberCount);
        System.out.println("other: " + otherCount);
    }
}
