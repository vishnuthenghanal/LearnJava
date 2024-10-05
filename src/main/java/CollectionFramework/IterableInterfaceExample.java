package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IterableInterfaceExample {
    public static void main(String[] args) {
        Collection<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        Iterator iterator = l.iterator();
        while (iterator.hasNext()) {
            int item = (Integer) iterator.next();
            if (item % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("");
    }


}

interface MyIterableInterface extends Iterable {

}
