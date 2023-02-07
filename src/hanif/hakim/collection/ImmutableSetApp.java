package hanif.hakim.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        /**
         * Same with List, Set can be immutable
         * So it will not be modified (add, remove)
         */
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Hakim");

        Set<String> mutable = new HashSet<>();
        mutable.add("Hanif");
        mutable.add("Fauzi");

        // Make mutable set to immutable one.
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Hakim", "Fauzi");

//        set.add("Joni"); // ERROR
//        set.remove("Fauzi"); // ERROR
//        immutable.remove("Fauzi"); // ERROR

    }
}
