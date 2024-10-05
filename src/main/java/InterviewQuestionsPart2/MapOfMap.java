package InterviewQuestionsPart2;

import java.util.HashMap;
import java.util.Map;


/*  ORGANISATION    : TCS - 05-10-2024
    QUESTION        : Iterate the Map*/
public class MapOfMap {
    public static void main(String[] args) {
        Map<String, Map<String, String>> noMap = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("1","1");
        map1.put("1","2");
        map1.put("1","3");
        map1.put("1","4");
        map1.put("1","5");

        Map<String, String> map2 = new HashMap<>();
        map2.put("1","1");
        map2.put("1","2");
        map2.put("1","3");
        map2.put("1","4");
        map2.put("1","5");

        noMap.put("one", map1);
        noMap.put("two", map2);


        noMap.entrySet().stream().map(stringMapEntry -> stringMapEntry.getValue())
                .forEach(data -> data.entrySet().forEach(data1-> System.out.println(data1.getValue())));


        for(Map.Entry<String, Map<String, String>> entry : noMap.entrySet()){
            Map<String, String> map = entry.getValue();
            map.get("one");
            map.entrySet().stream().forEach(data -> System.out.println(data.getValue()));
        }

        System.out.println("");
    }
}
