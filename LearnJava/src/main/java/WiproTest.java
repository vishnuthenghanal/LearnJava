import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WiproTest {
    public static void main(String[] args) {
        /*List<Integer> intList = Arrays.asList(10,12,2,5,3,1,9);

        List<Integer> reversed = intList.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list;
                        }));



        List<Integer> reversed = intList.stream()
                .collect(Collectors.toList());
        Collections.reverse(intList);
        Integer result
                = intList.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(result);*/


    }
}

class A1 {
    int A = 10;
    public int getA(){
        return A;
    }
}
class B1 extends A1 {
    int A = 20;
    public int getA(){ return A; }
}
class C {
    public static void main(String[] args) {
        A1 ob = new B1();
        System.out.println(ob.getA());
        System.out.println(ob.A);
    }
}
