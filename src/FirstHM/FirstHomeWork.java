package FirstHM;

import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        String s = stringBuilder.reverse().toString();

        if (str.equals(s)) {
            System.out.println("Это палиндром.");

        } else System.out.println("Это не палиндром.");

    }
}

