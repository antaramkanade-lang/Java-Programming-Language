import java.util.LinkedList;

public class LinkedListInJCF { // LL in java collection framework(JCF).
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        // here we dont need to write code for this methods from scratch they are
        // inbuilt in java.
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
