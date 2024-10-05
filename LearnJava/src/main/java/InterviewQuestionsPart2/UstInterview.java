package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UstInterview {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("cHeNNai", "muMbai", "deLHI", "muMBai");
        List<String> small = cities.stream().map(str -> str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase()).collect(Collectors.toList());

        System.out.println("");
        //1. Convert each string in camel case , e.g {"Chennai", "Mumbai", "Delhi", "Mumbai"}
        Map<String, Long> collect
                = small.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("");

        //2. Find the occurency of strings , e.g. Chennai-1, Delhi-1, Mumbai-2

        //select * from Employee order by salary desc limit 2, 1;

        cities.stream().map(str -> str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase()).collect(Collectors.toList());

    }
}
