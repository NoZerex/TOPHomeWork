import java.util.HashMap;
import java.util.LinkedHashMap;

public class SecondHM {
    public static void main(String[] args) {
        HashMap<Integer, String> originalMap = new LinkedHashMap<>();
        originalMap.put(1, "C");
        originalMap.put(2, "B");
        originalMap.put(3, "A");
        System.out.println(reverseMap(originalMap));

    }

    public static HashMap<String, Integer> reverseMap(HashMap<Integer, String> originalMap) {
        HashMap<String, Integer> reversedMap = new LinkedHashMap<>();
        for (HashMap.Entry<Integer, String> entry : originalMap.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return reversedMap;
    }
}
