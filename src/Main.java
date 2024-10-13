import Methods.Methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arraysString = new String[]{"Кошка" ,"Капибара","Бражник"};
        int[] arrayInt = new int[]{1,2,3};
        char[] arrayChar = new char[]{'a','b','c'};
        System.out.println(Methods.square(2));
        System.out.println(Methods.printFullName("Марк", "Цукерберг"));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arraysString)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arrayInt)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arrayChar)));

    }
}
