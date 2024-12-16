import java.util.*;

public class FirstHM {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 4};
        HashSet<Integer> result = (HashSet<Integer>) getUniqueElements(numbers);
        System.out.println(result);
    }

    public static Set<Integer> getUniqueElements(int[] number){
     Set<Integer> set = new HashSet<>();
     for (int num : number) {
         set.add(num);
     }
     return set;
    }
}
