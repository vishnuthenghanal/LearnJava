package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*  ORGANISATION    : TCS
    QUESTION        : Find the occurrence of a letter in string*/
public class OccurrenceOfNumberInList {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(1, 2, 4, 1, 2, 5, 6, 7, 8, 5, 1, 2, 5, 6, 9, 7, 10, 5, 1, 7, 8, 4, 1);
        Map<Integer, Long> nosCountMap
                = nos.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        nosCountMap.entrySet().forEach(no -> System.out.println("NO : " + no.getKey() + " COUNT : " + no.getValue()));

    }
}
