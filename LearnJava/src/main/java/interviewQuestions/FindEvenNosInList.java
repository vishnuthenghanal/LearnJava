package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEvenNosInList {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double sum = nos.stream().filter((no) -> no % 2 == 0).mapToDouble(Integer::doubleValue).sum();
        System.out.println(sum);


        String str ="apple";
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().forEach(entry -> System.out.println(entry.getKey() +" - "+entry.getValue()) );
    }
}
