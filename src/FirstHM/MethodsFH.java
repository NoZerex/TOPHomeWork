package FirstHM;

public class MethodsFH {
    public static void fillArray(int[][] array) {
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num;
                num++;
            }
        }
    }

    public static void printArray(int[][] array) {
        System.out.println("Массив:");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void sumRows(int[][] array) {
        System.out.println("Сумма элементов по строкам:");
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("Сумма строки " + (i + 1) + ": " + sum);
        }
    }

    public static void sumColumns(int[][] array) {
        System.out.println("Сумма элементов по столбцам:");
        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (int[] ints : array) {
                sum += ints[j];
            }
            System.out.println("Сумма столбца " + (j + 1) + ": " + sum);
        }
    }
}