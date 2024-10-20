package SecondHM;

import java.util.Arrays;

public class MethodsSH {

    public static void usingCopy(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] *= 2;
        }

        System.out.println("Работаем с копией массива: " + Arrays.toString(copyArray));
    }

    public static void usingOriginal(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }

        System.out.println("Работаем с исходным массивом: " + Arrays.toString(array));
    }
}

