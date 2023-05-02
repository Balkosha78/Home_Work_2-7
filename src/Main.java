import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums1);
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task2(nums2);
        List<String> words = new ArrayList<>(List.of("word1", "word1", "word2", "word2", "word3", "word3"));
        task3(words);

        task4(words);

    }
    public static void task1(List<Integer> numbers){
        System.out.println("Task 1 ");
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    public static void task2(List<Integer> numbers){
        System.out.println(" Task 2 ");
        Collection.sort(numbers);

        for (Integer number : numbers){
            if (number % 2 == 0){
                System.out.print(number + " ");
            }
        }
    }
    public static void task3(List<String> words){
        System.out.println(" Task 3 ");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        System.out.print();
    }
    public static void task4(List<String> words){
        System.out.println(" Task 4 ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words){
            if (map.containsKey(word)) {
                Integer count = map.get(word);
                map.put(word, count + 1);
            }else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }

}