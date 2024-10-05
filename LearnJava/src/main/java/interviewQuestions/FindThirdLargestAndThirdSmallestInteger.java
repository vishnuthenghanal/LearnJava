package interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindThirdLargestAndThirdSmallestInteger {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(4, 5, 1, 8, 7, 9);

        Integer [] intArray = {4, 5, 1, 8, 7, 9};

        Integer thirdLargest = nos.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        Integer thirdSmlest = nos.stream().sorted().skip(2).findFirst().get();
        System.out.println(thirdLargest);
        System.out.println(thirdSmlest);

        Integer thirdLargest1 = Arrays.stream(intArray).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        Integer thirdSmlest2 = Arrays.stream(intArray).sorted().skip(2).findFirst().get();
        System.out.println(thirdLargest1);
        System.out.println(thirdSmlest2);
    }
}
