package InterviewQuestionsPart2;

import java.util.Arrays;
import java.util.List;

/*  ORGANISATION    : GO DIGIT
    QUESTION        : Find the Even numbers from the list*/
public class FindEvenNosFromListOfList {
    public static void main(String[] args) {

        List<Integer> int1 = Arrays.asList(1, 2, 3);
        List<Integer> int2 = Arrays.asList(4, 5, 6);
        List<Integer> int3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> intList = Arrays.asList(int1, int2, int3);
        //Double sum = intList.stream().flatMap(no -> no.stream()).filter(no->no%2==0).mapToDouble(x->x).sum();
        Integer sum1 = intList.stream().flatMap(no -> no.stream()).filter(no -> no % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println("" + sum1);





    }
}
