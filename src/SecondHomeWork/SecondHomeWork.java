package SecondHomeWork;

import java.util.Scanner;

public class SecondHomeWork {
    public static void main(String[] args) {
        String str = "I love Beer!!!";

        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается с '!!!': " + endsWithExclamation);

        boolean startsWithILike = str.startsWith("I love");
        System.out.println("Начинается на 'I like': " + startsWithILike);

        boolean containsJava = str.contains("Beer");
        System.out.println("Содержит 'Beer': " + containsJava);

        int positionOfJava = str.indexOf("Beer");
        System.out.println("Позиция подстроки 'Beer': " + positionOfJava);

        String replacedString = str.replace("a", "o");
        System.out.println("Заменить все символы “а” на “о”.: " + replacedString);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка к верхнему регистру: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка к нижнему регистру: " + lowerCaseStr);

    }
}


