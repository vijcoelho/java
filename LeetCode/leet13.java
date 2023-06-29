package LeetCode;

import java.util.Scanner;
import java.util.HashMap;

public class leet13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String romanNumeral = scanner.next();
        int integerValue = romanToInteger(romanNumeral);
        System.out.println("O número inteiro correspondente é: " + integerValue);

        scanner.close();
    }

    public static int romanToInteger(String romanNumeral) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(romanNumeral.charAt(i));

            if (currentValue >= previousValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }
}
