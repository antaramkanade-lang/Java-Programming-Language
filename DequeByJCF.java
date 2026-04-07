import java.util.*;

public class DequeByJCF {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2); //2,1
        deque.addLast(3); //2,1,3
        deque.addLast(4); //2,1,3,4
        System.out.println(deque);
        deque.removeLast(); //2,1,3
        System.out.println(deque);

        System.out.println("first element:  " + deque.getFirst()); //2
        System.out.println("Last element: " + deque.getLast()); //3
    }
}
