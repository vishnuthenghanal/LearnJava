package CollectionFramework.Map;

import java.util.*;

public class DictionaryEx {
    public static void main(String[] args) {
        Dictionary<String, Integer> dictionary = new Hashtable<>();
        for (int i = 0; i < 50; i++) {
            dictionary.put(String.valueOf((i + 1)), i + 1);
        }


        /*Object putVal = dictionary.put("2", 33);

        System.out.println("BEFORE REMOVE");
        for (Map.Entry<String, Integer> entry : ((Hashtable<String, Integer>) dictionary).entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        Object val = dictionary.remove("3");
        System.out.println("AFTER REMOVE");
        for (Map.Entry<String, Integer> entry : ((Hashtable<String, Integer>) dictionary).entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }*/


        Enumeration<String> keys = dictionary.keys();
        Iterator iterator = keys.asIterator();

        while (iterator.hasNext()){
            Object key = iterator.next();
            Integer value = dictionary.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }


       /* while (keys.hasMoreElements()){
            String key = keys.nextElement();
            Integer value = dictionary.get(key);
        }*/

    }
}
