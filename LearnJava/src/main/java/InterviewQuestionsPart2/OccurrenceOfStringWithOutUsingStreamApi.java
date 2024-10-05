package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurrenceOfStringWithOutUsingStreamApi {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "apple", "grape", "apple");

        //SOLUTION - 1
        Map<String, Integer> stringCountMap = new HashMap<>();
        for (String str : stringList) {
            stringCountMap.put(str, stringCountMap.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : stringCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String[] strArray = {"apple", "banana", "orange", "apple", "grape", "apple"};
        Map<String, Integer> countMap = new HashMap<>();

        //SOLUTION - 2
        for(String s : strArray){
            String key = s;
            if (countMap.containsKey(key)) {
                countMap.put(s, countMap.get(s) + 1);
            } else {
                countMap.put(s, 1);
            }
        }
    }
}
