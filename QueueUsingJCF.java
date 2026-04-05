import java.util.*;

public class QueueUsingJCF {
    public static void main(String args[]) {
        // Queue is an instance so it cannot create its own object.
        // It done by only Linked List and ArrayDeque.
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
