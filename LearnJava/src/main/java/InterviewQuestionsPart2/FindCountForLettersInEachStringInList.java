package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCountForLettersInEachStringInList {
    public static void main(String[] args) {
        List<String> stringList1 = Arrays.asList("gpay", "paytm", "ppay", "gpay");
        stringList1.stream().distinct().collect(Collectors.toMap(Function.identity(),
                s -> s.length())).entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));



        stringList1.stream().collect(Collectors.toMap(Function.identity(), s -> s.length())).entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
