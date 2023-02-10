package hanif.hakim.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Indonesia", "Jakarta");
        map.put("England", "London");
        map.put("Germany", "Berlin");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s2 + "Is Capital City of : " + s);
            }
        });
    }
}
