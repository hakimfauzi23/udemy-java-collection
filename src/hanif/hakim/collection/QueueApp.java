package hanif.hakim.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        /**
         * Queue is one of Collections
         * This collection implement data structure FIFO (First In First Out)
         * It means data that added first will be printed first too!
         */
//        Queue<String> queue = new ArrayDeque<>(10);
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Hakim");
        queue.add("Hanif");
        queue.add("Fauzi");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
