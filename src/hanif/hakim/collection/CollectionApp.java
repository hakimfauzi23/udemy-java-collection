package hanif.hakim.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        /**
         * 'Collection' is parents of all collections in java
         * but there is no direct method implementation from this class
         * the implementation is through the collections (List, Set, and Queue)
         */
        Collection<String> collection = new ArrayList<>();

        System.out.println("ADD TO COLLECTION");
        collection.add("Hanif");
        collection.add("Fauzi");
        collection.add("Hakim");
        collection.addAll(List.of("Hanif1", "Hakim2"));

        for (var value :
                collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE FROM COLLECTION");
        collection.remove("Hanif");
        collection.remove("Hanif1");

        for (var value :
                collection) {
            System.out.println(value);
        }
    }
}
