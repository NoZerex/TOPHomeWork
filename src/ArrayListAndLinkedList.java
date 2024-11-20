import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {

    public static void ElementOperation(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println(list.getClass().getSimpleName() + " Время: " + duration + " мс");
    }


    public static void RandomElementOperation(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int index = random.nextInt(list.size());
            list.get(index);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println(list.getClass().getSimpleName() + " Время: " + duration + " мс");

    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        ElementOperation(arrayList);
        ElementOperation(linkedList);
        RandomElementOperation(arrayList);
        RandomElementOperation(linkedList);
    }
}
