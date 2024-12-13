package SecondHM;

import java.util.*;

public class SecondHM {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Дмитрий", "Олег", "Иван", "Сергей");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        System.out.println("Список в обратном порядке (анонимный класс): " + names);


        List<String> names2 = Arrays.asList( "Мария", "Иван", "Елена");
        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Список в обратном порядке (лямбда-выражение): " + names2);
    }
}