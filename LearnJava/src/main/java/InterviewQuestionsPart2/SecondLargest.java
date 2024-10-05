package InterviewQuestionsPart2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondLargest {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 7, 8, 3, 9, 8, 6, 10, 9};

        Arrays.stream(numbers)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(data -> data.getValue() == 1).map(data -> data.getKey()).sorted(Comparator.reverseOrder()).skip(1).findFirst();

        Integer secondLargestNo
                = Arrays.stream(numbers).sorted(Comparator.reverseOrder() ).distinct().skip(1).findFirst().get();
        System.out.println("The second largest number is: " + secondLargestNo);


        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargest);
    }

    public static Integer findSecondLargest(Integer[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }/* else if (num != largest && num > secondLargest) {
                secondLargest = num;
            }*/
        }
        return secondLargest;
       /* if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secondLargest;
        }*/
    }
}
