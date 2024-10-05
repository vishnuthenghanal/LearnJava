package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*  ORGANISATION    :
    QUESTION        : Find the occurrence of a letter in string*/
public class OccurrenceOfLetterInString {
    public static void main(String[] args) {
        String name = "apple";
        name.split("");
        Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .forEach(data-> System.out.println("Letter :" + data.getKey() + " Count : " + data.getValue()));
        System.out.println("");
    }
}
