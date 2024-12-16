public class FirstHM {
    public static void main(String[] args) {
        System.out.println(divide(2, 4));
        System.out.println(divide(5, 2));
    }

    public static double divide(int numerator, int denominator) {
        try {
            if (denominator == 0) {
                throw new ArithmeticException("Деление на ноль.");
            }
            return (double) numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());

        }
        return 0;
    }
}