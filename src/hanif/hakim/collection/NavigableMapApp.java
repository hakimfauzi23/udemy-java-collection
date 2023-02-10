package hanif.hakim.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Hanif", "Hanif");
        map.put("Fauzi", "Fauzi");
        map.put("Hakim", "Hakim");

        for (var key :
                map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Hakim"));
        System.out.println("-------------------");
        System.out.println(map.higherKey("Hakim"));
        System.out.println("-------------------");

        // Descending map
        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key :
                mapDesc.keySet()) {
            System.out.println(key);
        }

        // Create Immutable NavigableMap
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);
    }
}
