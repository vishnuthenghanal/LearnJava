package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionFunctionalInterface {
    public static void main(String[] args) {
        /*Function<String, Integer> stringLengthFunction = s -> s.length();
        String str = "abcd";
        int length = stringLengthFunction.apply(str);
        System.out.println(length);*/

        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(16);
        numbers.add(16);
        numbers.add(18);
        Function<Integer, String> oddOrEven = (num) -> (num % 2 == 0) ? "Even" : "odd";
        numbers.stream()
                .collect(Collectors.toSet()).stream()
                .collect(Collectors.toMap(Function.identity(), oddOrEven))
                .entrySet().stream().filter(num -> num.getValue().equalsIgnoreCase("odd") || num.getValue().equalsIgnoreCase("Even"))
                .forEach(oddorevn -> System.out.println(oddorevn.getKey() + " - " + oddorevn.getValue()));
        System.out.println("");


        /*Map<Integer, String> oddoreven = new HashMap<>();
        for (Integer num : numbers) {
            String res = oddOrEven.apply(num);
            oddoreven.put(num, res);
        }
        oddoreven.entrySet().forEach(oddorevn -> System.out.println(oddorevn.getKey() + "-" + oddorevn.getValue()));*/


    }


}
