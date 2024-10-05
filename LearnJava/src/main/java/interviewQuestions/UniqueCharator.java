package interviewQuestions;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharator {
    public static void main(String[] args) {
        String str = "aabbcddeefghhhh";
        //char[] charArray = str.toCharArray();
        String[] strArray = str.split("");

        Arrays.stream(strArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey()).forEach(System.out::println);

    }
}
