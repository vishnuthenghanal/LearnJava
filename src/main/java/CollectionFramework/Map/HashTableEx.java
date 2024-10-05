package CollectionFramework.Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < 20; i++) {
            hashtable.put(String.valueOf((i + 1)), i + 1);
        }
        Enumeration<String> keys = hashtable.keys();
        Iterator iterator = keys.asIterator();

        while (iterator.hasNext()){
            Object key = iterator.next();
            Integer value = hashtable.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }
}
