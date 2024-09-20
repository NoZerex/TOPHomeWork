package ThirdHomeWork;

import java.util.Scanner;

public class ThirdHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int middle = str.length() / 2;

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(middle - 1, middle + 1));

        } else System.out.println("Число нечётное");
    }
}
