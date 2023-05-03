import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("word1", "word1", "word2", "word2", "word3", "word3"));
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }
    public static void task1(){
        System.out.println("Task 1 ");
        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void task2(){
        System.out.println(" Task 2 ");
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;

        for (int num : nums){
            if (num % 2 == 0 && num != prevNum){
                System.out.print(num);
                prevNum = num;
            }
        }
    }
    public static void task3(){
        System.out.println(" Task 3 ");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
    //System.out.println();
    public static void task4(){
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