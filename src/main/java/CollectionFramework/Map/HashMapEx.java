package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(String.valueOf((i + 1)), i + 1);
        }

        hashMap.put(null, 11);
        hashMap.put(null, 12);
        hashMap.put(null, null);
        hashMap.put("null", null);
        Set<String> keys = hashMap.keySet();
        System.out.println("\n");
        for(String key: keys){
            Integer value = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
