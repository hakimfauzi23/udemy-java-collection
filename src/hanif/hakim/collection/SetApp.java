package hanif.hakim.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        /**
         * Set is one collection in java
         * Not like `List` , in Set the data cannot be duplicate
         * so all the data in the Set is unique.
         *
         * There are two kind of set (HashSet and LinkedHashSet)
         * The diff between them is data in LinkedHashSet is sorted.
         */
//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Hanif");
        names.add("Fauzi");
        names.add("Hakim");
        names.add("Hanif");
        names.add("Fauzi");
        names.add("Hakim");

        for (var name :
                names) {
            System.out.println(name);
        }
    }
}
