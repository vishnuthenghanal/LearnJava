package InterviewQuestionsPart2;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*  ORGANISATION    : GO DIGIT
    QUESTION        : Find the occurrence of a letter in string*/
public class OccurrenceOfLetterFromStringNissan {
    public static void main(String[] args) {
        String s = "today is thursday";
        char[] s1 = s.toCharArray();

        Stream.of(s1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

    }
}

