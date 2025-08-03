import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (add elements)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);

        // Peek (front element)
        System.out.println("Front element: " + queue.peek());

        // Dequeue (remove element)
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after removal: " + queue);

        // Check if empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

