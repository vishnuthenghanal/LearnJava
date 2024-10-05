package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindLargestSumFromArray {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        List<Integer> integers = Arrays.asList(numbers);

        List<Integer> subInt = integers.subList(1,4);
        System.out.println("");

        HashMap<String, Integer> sumHashMap = new HashMap<>();
        sumHashMap.put("largestSum", 0);

        for (int i = 0; i < subInt.size(); i++) {
            Integer no = subInt.get(i);
            for (int j = i + 1; j < subInt.size(); j++) {
                int sum = no + subInt.get(j);
                System.out.println(sum);
                Integer sunInHashMap = sumHashMap.get("largestSum");
                if (sunInHashMap < sum) {
                    sumHashMap.put("largestSum", sum);
                }
            }
        }
        System.out.println("LARGEST SUM " + sumHashMap.get("largestSum"));

    }
}
