package hanif.hakim.collection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("DataLast");
        stack.push("DataBetween");
        stack.push("DataFirst");

        // If data is empty will throw an exception.
        for (var value = stack.pop(); value != null; value = stack.pop()) {
            System.out.println(value);
        }
    }
}
