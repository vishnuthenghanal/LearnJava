package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOfNumbersInList {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(15, 45, 1, 2, 3, 4, 7, 8);
        Integer reduceSum = nos.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        double sum = nos.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
