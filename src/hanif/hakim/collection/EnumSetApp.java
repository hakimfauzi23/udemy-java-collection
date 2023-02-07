package hanif.hakim.collection;

import java.util.EnumSet;

public class EnumSetApp {

    public static void main(String[] args) {
        /**
         * EnumSet is collection that contain enum in it.
         * it's rarely used, because Enum itself already has method to print element.
         */
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

        for (var gender :
                genders) {
            System.out.println(gender);
        }

    }

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }
}
