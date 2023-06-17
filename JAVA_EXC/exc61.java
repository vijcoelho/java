package JAVA_EXC;

import java.util.Scanner;

public class exc61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        reverseWord(word);
        scanner.close();
    }

    public static void reverseWord(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
