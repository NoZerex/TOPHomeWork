import Methods.Methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arraysString = new String[]{"Кошка", "Капибара", "Бражник"};
        Integer[] arrayInt = new Integer[]{1, 2, 3};
        Character[] arrayChar = new Character[]{'a', 'b', 'c'};
        System.out.println(Methods.square(2));
        System.out.println(Methods.printFullName("Марк", "Цукерберг"));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arraysString)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arrayInt)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arrayChar)));

    }
}
