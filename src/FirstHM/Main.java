package FirstHM;

import static FirstHM.MethodsFH.*;

class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        fillArray(array);
        printArray(array);
        sumRows(array);
        sumColumns(array);
    }

}
