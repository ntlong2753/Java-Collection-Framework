package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Katarina", 23);
        hashMap.put("Garen", 26);
        hashMap.put("Kennen", 24);
        hashMap.put("Kayle", 25);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Garen", 26);
        linkedHashMap.put("Kayle", 25);
        linkedHashMap.put("Kennen", 24);
        linkedHashMap.put("Katarina", 23);
        System.out.println("\nThe age for " + "Kayle is " + linkedHashMap.get("Kayle"));

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("\nDisplay entries in ascending order of key");
        System.out.println(treeMap);
    }
}
