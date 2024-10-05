package CollectionFramework.Map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        for (int i = 50; i < 100; i++) {
            concurrentHashMap.put(String.valueOf((i + 1)), i + 1);
        }
        concurrentHashMap.put(null, 25);
        concurrentHashMap.put("22", null);

        for (Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = "  + entry.getValue());
        }

        /*Iterator<Map
                .Entry<String, Integer>> iterator1
                = concurrentHashMap.entrySet().iterator();

        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            System.out.println("Key = " + entry.getKey() + ", Value = "  + entry.getValue());
        }*/
    }
}
