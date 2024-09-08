import java.util.Random;

public class SecondHomeWork {
    public static void main(String[] args) {
        long bigNumber = 2147483648L;
        int overflowedInt = (int) bigNumber; // Переполнение типа long до int

        System.out.println("Длинное число: " + bigNumber);
        System.out.println("переполненый int: " + overflowedInt);

        Random rand = new Random();

        int firstInt = rand.nextInt(65, 123);
        int secondInt = rand.nextInt(65, 123);
        int thirdInt = rand.nextInt(65, 123);
        int fourthInt = rand.nextInt(65, 123);
        char firstChar = (char) firstInt;
        char secondChar = (char) secondInt;
        char thirdChar = (char) thirdInt;
        char fourthChar = (char) fourthInt;

        System.out.println("Символы: " + firstChar + secondChar + thirdChar + fourthChar);
    }
}
