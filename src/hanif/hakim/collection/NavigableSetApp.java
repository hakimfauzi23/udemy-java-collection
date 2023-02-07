package hanif.hakim.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();

        names.addAll(Set.of("Hanif", "Joni", "Joko", "Jack","Abel", "Brian", "Cole"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> jack = names.tailSet("Jack",true);

        System.out.println(jack);
//        for (var name :
//                names) {
//            System.out.println(name);
//        }

        //
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Add New Element"); // ERROR
    }
}
