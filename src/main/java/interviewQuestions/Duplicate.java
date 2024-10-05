package interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate {


    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(12, 10, 8, 7, 4, 3, 10, 8, 6);

        Predicate<Integer> integerPredicate = (no) -> no <=5;


        Function<Integer, Integer> doubleIntegerFunction = x -> x -1 ;

        Integer reduce = input.stream().filter(integerPredicate).map(doubleIntegerFunction). reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        //mapToInt().        mapToDouble(Integer::doubleValue).su collect(Collectors.toList()).forEach(System.out::println);


        /*Optional<Integer> max = input.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).sorted().max(Integer::compareTo);

        Integer sorted = input.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(max.get());*/
    }
}
