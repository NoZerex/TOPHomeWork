package FirstHomeWork;

import java.util.Scanner;

public class FisrtHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int countSmallLetters = 0;
        int countCapitalLetters = 0;
        int countNumbers0to4 = 0;
        int countNumbers5to9 = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    countSmallLetters++;
                } else {
                    countCapitalLetters++;
                }
            } else if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                if (num >= 0 && num <= 4) {
                    countNumbers0to4++;
                } else if (num >= 5 && num <= 9) {
                    countNumbers5to9++;
                }
            }
        }

        System.out.println("Маленьких букв: " + countSmallLetters);
        System.out.println("Больших букв: " + countCapitalLetters);
        System.out.println("Цифр от 0 до 4: " + countNumbers0to4);
        System.out.println("Цифр от 5 до 9: " + countNumbers5to9);
    }
}

