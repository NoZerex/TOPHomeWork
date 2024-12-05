import java.util.HashMap;
import java.util.Map;

public class FIrstHM {
    public static void main(String[] args) {
        String inputString = "java is fun and java is powerful";
        Map<Character, Integer> charCountMap = countCharacterOccurrences(inputString);
        System.out.println("Количество вхождений каждого символа:");
        charCountMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }


    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        return charCountMap;
    }
}