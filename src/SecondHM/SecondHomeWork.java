package SecondHM;

import java.util.Scanner;

public class SecondHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean Palindrome = true;

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                Palindrome = false;
                break;
            }
        }

        if (Palindrome) {
            System.out.println("Это палиндром.");
        } else {
            System.out.println("Это не палиндром.");
        }
    }
}




