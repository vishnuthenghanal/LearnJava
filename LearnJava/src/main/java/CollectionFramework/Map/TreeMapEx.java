package CollectionFramework.Map;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("zero", 0);
        treeMap.put("three", 3);
        treeMap.put("one", 1);
        treeMap.put("four", 4);
        treeMap.put("two", 2);
        treeMap.put("", null);
        treeMap.put("22", null);


        // FROM ABSTRACT_MAP
        //AbstractMap<String, Integer> treeMap = new TreeMap<>();

        // FROM SORTED_MAP
        //SortedMap<String, Integer> treeMap = new TreeMap<>();

        // FROM NAVIGABLE_MAP
        //NavigableMap<String, Integer> treeMap = new TreeMap<>();
        /*for (int i = 0; i < 50; i++) {
            treeMap.put(String.valueOf((i + 1)), i + 1);
        }*/
        Set<String> keys = treeMap.keySet();
        System.out.println("\n");
        for(String key: keys){
            Integer value = treeMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println("FLOOR ENTRY");
        Map.Entry<String, Integer> entry = treeMap.ceilingEntry("three");
        System.out.println("");

    }
}
