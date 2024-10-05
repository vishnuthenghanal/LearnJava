package CollectionFramework.Iterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class IterableInterface {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(10, 11, 12, 15, 4, 2, 3, 7, 1);

        //nos.forEach(no -> System.out.println(no));

        Iterator<Integer> iterator = nos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Spliterator<Integer> spliterator = nos.spliterator();
        spliterator.forEachRemaining(no -> System.out.println(no));
    }
}
