package SecondHM;

import java.util.Arrays;

import static SecondHM.MethodsSH.usingCopy;
import static SecondHM.MethodsSH.usingOriginal;


public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        usingCopy(array);

        usingOriginal(array);
    }
}
