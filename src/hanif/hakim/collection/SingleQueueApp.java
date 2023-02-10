package hanif.hakim.collection;

import hanif.hakim.collection.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());

        System.out.println(queue.offer("Hanif"));
        System.out.println(queue.offer("Fauzi"));
        System.out.println(queue.offer("Hakim"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
