package ThirdHM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdHM {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");
        List<String> result = words.stream()
                .map(String::toUpperCase)
                .filter(word -> word.length() > 4)
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());

        System.out.println("Результат: " + result);
    }
}