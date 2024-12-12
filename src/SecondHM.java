import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class SecondHM {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        LinkedHashSet<String> result = (LinkedHashSet<String>) getOrderedUniqueElements(words);
       System.out.println(result);
    }

    public static Set<String> getOrderedUniqueElements (String[] strings){
        Set<String> uniqueWords = new LinkedHashSet<>();
        Collections.addAll(uniqueWords, strings);
        return uniqueWords;
    }
}

