package FirstHM;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        CustomMutableClass mutableObject = new CustomMutableClass(10);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        ImmutableClass immutableObject = new ImmutableClass("Тест", numbers, mutableObject);

        mutableObject.setValue(20);

        numbers.add(4);

        System.out.println("Неизменяемое имя: " + immutableObject.getName());
        System.out.println("Неизменяемые числа: " + immutableObject.getNumbers());
        System.out.println("Изменяемое значение: " + immutableObject.getMutableObject().getValue());

        Map<ImmutableClass, String> map = new HashMap<>();
        map.put(immutableObject, "Некое значение");

        System.out.println("Map значение: " + map.get(immutableObject));
    }
}