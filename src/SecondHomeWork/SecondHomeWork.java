package SecondHomeWork;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class SecondHomeWork {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(9) + 1;
        double[] arr = new double[randomNum];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble(100);
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        BigDecimal minValue = new BigDecimal(min);
        BigDecimal maxValue = new BigDecimal(max);

        minValue = minValue.setScale(2, RoundingMode.HALF_DOWN);
        maxValue = maxValue.setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("Наименьшее число: " + minValue);
        System.out.println("Наибольшее число: " + maxValue);
    }
}
