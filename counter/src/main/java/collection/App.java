package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Count of elements
 */
public class App {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[] {1, 2, 5, 7, 1, 7, 5, 7};
        var intFrequencyMap = getCountOfElements(intArr);
        System.out.println(intFrequencyMap);

        String[] strArr = new String[] {
                "apple", "orange", "banana", "pineapple", "orange", "apricot", "banana", "orange", "apple"};
        var strFrequencyMap = getCountOfElements(strArr);
        System.out.println(strFrequencyMap);
    }

    public static <T> Map<T, Integer> getCountOfElements(T[] array) {
        Map<T, Integer> frequencyMap = new HashMap<>();
        for (T item : array) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }
}
