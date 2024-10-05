package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class SetRetainAllMethodEx {
    public static void main(String[] args) {
        try {

            // Creating object of Set
            Set<Integer> arrset1 = new HashSet<>();

            // Populating arrset1
            arrset1.add(1);
            arrset1.add(2);
            arrset1.add(3);
            arrset1.add(4);
            arrset1.add(5);

            // print arrset1
            System.out.println("Set before retainAll() operation : " + arrset1);

            // Creating another object of  Set
            Set<Integer> arrset2 = new HashSet<Integer>();
            arrset2.add(1);
            arrset2.add(2);
            arrset2.add(3);

            // print arrset2
            System.out.println("Collection Elements to be retained : " + arrset2);

            // Removing elements from arrset
            // specified in arrset2
            // using retainAll() method
            arrset1.retainAll(arrset2);

            // print arrset1
            System.out.println("Set after retainAll() operation : " + arrset1);
        }

        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
