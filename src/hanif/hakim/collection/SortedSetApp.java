package hanif.hakim.collection;

import hanif.hakim.collection.data.Person;
import hanif.hakim.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Hanif"));
        people.add(new Person("Rafli"));
        people.add(new Person("Julios"));

        for (var person :
                people) {
            System.out.println(person.getName());
        }

        // Make SortedSet immutable.
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);

    }
}
