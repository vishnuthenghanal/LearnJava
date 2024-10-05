package CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            linkedHashMap.put(String.valueOf((i + 1)), i + 1);
        }

        linkedHashMap.put(null, 11);
        linkedHashMap.put(null, 12);
        linkedHashMap.put(null, null);
        linkedHashMap.put("null", null);
        Set<String> keys = linkedHashMap.keySet();
        System.out.println("\n");
        for(String key: keys){
            Integer value = linkedHashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        //REMOVE
        linkedHashMap.remove("2");
        System.out.println("\nAFTER REMOVAL");
        for(String key: keys){
            Integer value = linkedHashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
