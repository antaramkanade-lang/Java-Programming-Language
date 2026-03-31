import java.util.*;

public class IntersectionOfTwoLinkedLists {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Get length of list
    public static int getLength(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Find intersection
    public static Node getIntersection(Node headA, Node headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        Node a = headA;
        Node b = headB;

        // Align both lists
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                a = a.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                b = b.next;
            }
        }

        // Traverse together
        while (a != null && b != null) {
            if (a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }

        return null;
    }

    public static void main(String[] args) {

        // List A: 4 -> 5 -> 6 -> 7
        Node a1 = new Node(4);
        Node a2 = new Node(5);
        Node a3 = new Node(6);
        Node a4 = new Node(7);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        Node headA = a1;

        // List B: 1 -> 2 -> 3 -> 6 -> 7
        Node b1 = new Node(1);
        Node b2 = new Node(2);
        Node b3 = new Node(3);

        b1.next = b2;
        b2.next = b3;

        // Intersection at node 6
        b3.next = a3;

        Node headB = b1;

        // Call function
        Node ans = getIntersection(headA, headB);

        // Print result
        if (ans != null) {
            System.out.println(ans.data); // Output: 6
        } else {
            System.out.println("No intersection");
        }
    }
}