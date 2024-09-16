package FirstHomeWork;

import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        System.out.print("Введите возраст: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("Вам нужно идти в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Вам нужно посещать в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Вам нужно учиться в университете");
        } else if (age > 24) {
            System.out.println("Вам пора идти на работу");
        } else {
            System.out.println("Введён Неверный  возраст");
        }
    }
}
