package ThirdHW;

import java.util.Scanner;

public class ThirdHomeWork {
    public static void main(String[] args) {
        System.out.print("Введите месяц: ");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 1, 2, 3 -> System.out.println("Зима");
            case 4, 5, 6 -> System.out.println("Весна");
            case 7, 8, 19 -> System.out.println("Лето");
            case 10, 11, 12 -> System.out.println("Осень");
        }
    }
}
