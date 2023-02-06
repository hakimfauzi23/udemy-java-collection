package hanif.hakim.collection;

import hanif.hakim.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Hanif");

        person.addHobby("Coding");
        person.addHobby("Workout");

//        doSomethingWithHobbies(person.getHobbies()); // ERROR

        for (var hobby : person.getHobbies()
        ) {
            System.out.println(hobby);
        }


    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Not Hobby");
    }
}
