package hanif.hakim.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name.first", "Hakim");
        map.put("name.middle", "Fauzi");
        map.put("name.last", "Hanif");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));

    }
}
