package hanif.hakim.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        /**
         * Deque is like Queue, implement FIFO but also Implement LIFO (Last In First Out)
         * Or like Stack Data structure.
         */

        /* Stack use pollLast */
        stack.offerLast("Jack");
        stack.offerLast("Queen");
        stack.offerLast("Diamond");
        stack.offerLast("Spade");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("------------------------");

        /* Queue use pollFirst */
        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Jack");
        queue.offerLast("Queen");
        queue.offerLast("Diamond");
        queue.offerLast("Spade");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());


    }
}
