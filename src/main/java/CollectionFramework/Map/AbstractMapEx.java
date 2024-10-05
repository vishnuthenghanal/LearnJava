package CollectionFramework.Map;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Set;

public class AbstractMapEx {
    public static void main(String[] args) {
        AbstractMap<String, Integer> abstractMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            abstractMap.put(String.valueOf((i + 1)), i + 1);
        }

        abstractMap.put(null, 11);
        abstractMap.put(null, 12);
        abstractMap.put(null, null);
        abstractMap.put("null", null);
        Set<String> keys = abstractMap.keySet();
        System.out.println("\n");
        for(String key: keys){
             Integer value = abstractMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        //REMOVE
        abstractMap.remove("2");
        System.out.println("\nAFTER REMOVAL");
        for(String key: keys){
            Integer value = abstractMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }


    }
}
