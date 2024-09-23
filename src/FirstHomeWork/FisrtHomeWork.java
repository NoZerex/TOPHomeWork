package FirstHomeWork;

import java.util.Random;

public class FisrtHomeWork {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(9) + 1;
        int[] arr = new int[randomNum];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            sum += arr[i];
        }

        sum = sum / arr.length;

        System.out.print("среднее арифметическое чисел: " + sum);

    }
}

