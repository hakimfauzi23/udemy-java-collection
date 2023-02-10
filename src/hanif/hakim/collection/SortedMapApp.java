package hanif.hakim.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // descending sort
            }
        };
        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Hanif", "Hanif");
        sortedMap.put("Liam", "Liam");
        sortedMap.put("Ali", "Ali");
        sortedMap.put("Joni", "Joni");

        for (var key :
                sortedMap.keySet()) {
            System.out.println(key);
        }

        // Immutable SortedMap
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

//        immutable.put("Halan","Halan"); // Will Cause Error!
    }
}
