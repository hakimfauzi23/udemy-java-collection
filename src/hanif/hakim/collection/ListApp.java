package hanif.hakim.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        /**
         * There are two List ArrayList and LinkedList
         * List implements all Collection Method (add, remove, get, set);
         * Before ArrayList and LinkedList has different cycle
         * There are some advantages and disadvantages,here's the recap
         * add => LinkedList is faster than ArrayList (LinkedList don't have floating capacity)
         * get => ArrayList is faster than LinkedList (ArrayList get data with indexing)
         * set => ArrayList is faster than LinkedList (ArrayList will be faster to find the data with index)
         * remove => LinkedList is faster than ArrayList (ArrayList will always reposition the data)
         */
        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();

        strings.add("Dog");
        strings.add("Sheep");
        strings.add("Cat");

        strings.set(0, "Bird");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value :
                strings) {
            System.out.println(value);
        }
    }
}
