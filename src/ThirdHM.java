import java.util.Arrays;

public class ThirdHM {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;
        int[] result = findClosestNumbers(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findClosestNumbers(int[] numbers, int target) {
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < target && number > closestSmaller) {
                closestSmaller = number;
            }
            if (number > target && number < closestLarger) {
                closestLarger = number;
            }
        }

        return new int[]{closestSmaller, closestLarger};
    }
}
