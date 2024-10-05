package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxValueFromList {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(15, 45, 1, 2, 3, 4, 7, 8);

        Integer max = nos.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(max);
    }
}
