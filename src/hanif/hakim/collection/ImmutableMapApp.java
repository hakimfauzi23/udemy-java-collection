package hanif.hakim.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Hanif");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Hanif");

        // #1 To make map immutable
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
//        immutable.put("a", "Joki"); // ERROR

        // #2 To make map immutable
        Map<String, String> map = Map.of(
                "first", "Hanif",
                "middle", "Fauzi",
                "last", "Hakim"
        );
//        map.put("a", "A"); // ERROR
    }
}
