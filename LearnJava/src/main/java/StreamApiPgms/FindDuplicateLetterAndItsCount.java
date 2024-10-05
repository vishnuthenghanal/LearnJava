package StreamApiPgms;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Capgemny
public class FindDuplicateLetterAndItsCount {
    public static void main(String[] args) {

        String str = "Great responsibility";


        char[] charArray = str.toCharArray();

        String stringWithOutSpace = str.replaceAll("\s", "");
        String[] split = stringWithOutSpace.split("");

        Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .forEach(data -> System.out.println("Letter : " + data.getKey() + " Count : " + data.getValue()));


    }
}
