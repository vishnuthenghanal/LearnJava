package StreamApiPgms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddSumUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 11, 45, 25, 1, 2, 3, 5, 7, 8, 9);

        Integer oddSum = numbers.stream().filter(num-> num%2 != 0).mapToInt(Integer::intValue).sum();

        numbers.stream().filter(num -> num % 2 != 0).reduce(0, (a, b) -> a + b);

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfOddNumbers = Arrays.stream(numbers1)
                .filter(n -> n % 2 != 0) // Filter out even numbers
                .sum();

        Function<Integer, Integer> sum = x -> x * 2;

        numbers.stream().map(sum).collect(Collectors.toList());
    }
}
