package hanif.hakim.collection;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        /**
         * Iterable is parent interface for all collection in java (except Map)
         * Iterable, and collection that implement it support for-each loop
         */
        Iterable<String> names = List.of("Hanif", "Fauzi", "Erens");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
