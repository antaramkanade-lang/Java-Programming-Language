import java.util.*;

public class DetectALoopInLL {
    public static class Node { // another class created as node
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // check if a cycle exists or not in a LInked List.
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle does not exists
    }

    // removing a cycle and making it a normal Linked List.
    public static void removeCycle() {
        // 1. Detect a cycle:
        Node slow = head;
        Node fast = head;
        boolean cycle = false; // to track if cycle exists or not.
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // 2. Find meeting point of fast and slow:
        slow = head; // Make slow as head. move it to stat.
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // 3.Remove cycle= last.next=null:
        prev.next = null;
    }

    public static void main(String args[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2 it is a cycle.
        System.out.println(isCycle()); // First it was a cycle so it returned true.
        removeCycle();
        System.out.println(isCycle());// then we removed a cycle so it returned false.
    }
}
