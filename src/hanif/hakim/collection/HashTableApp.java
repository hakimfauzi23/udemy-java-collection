package hanif.hakim.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("Hanif", "Hanif");
        map.put("Fauzi", "Fauzi");
        map.put("Hakim", "Hakim");

        for (var value :
                map.keySet()) {
            System.out.println(value);
        }

    }
}
