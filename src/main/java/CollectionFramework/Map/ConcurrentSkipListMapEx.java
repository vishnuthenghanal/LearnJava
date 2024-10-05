package CollectionFramework.Map;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapEx {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> concurrentSkipListMap = new ConcurrentSkipListMap<>();
        for (int i = 0; i < 50; i++) {
            concurrentSkipListMap.put(String.valueOf((i + 1)), i + 1);

        }
        concurrentSkipListMap.put("null", 25);
        concurrentSkipListMap.put("22", null);

        for (Map.Entry<String, Integer> entry : concurrentSkipListMap.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = "  + entry.getValue());
        }

       /* Iterator<ConcurrentSkipListMap
                .Entry<String, Integer>> iterator
                = concurrentSkipListMap.entrySet().iterator();

       while (iterator.hasNext()) {
            ConcurrentSkipListMap.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = "  + entry.getValue());
        }*/
    }
}
