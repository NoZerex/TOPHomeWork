import Methods.Methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrays = new String[]{"Капибара","Кошка","Бражник"};
        System.out.println(Methods.square(2));
        System.out.println(Methods.printFullName("Марк", "Цукерберг"));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arrays)));
    }
}
