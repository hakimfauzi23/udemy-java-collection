package hanif.hakim.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Hanif");
        map.put(Level.PREMIUM, "Hakim");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }

    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }
}
