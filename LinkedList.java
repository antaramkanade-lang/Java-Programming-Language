import java.util.*;

public class LinkedList {
    // We created single node here.
    public static class Node {// Here another class is created as Node.
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // here null is used because we only made one Node.
        }
    }

    // storing head and tail nodes:
    public static Node head;
    public static Node tail;
    public static int size; // to check size of list it is initially 0 in java.

    // Methods:- here we will create methods to add,remove,print or search elements
    // instead of writing directly in main method:
    public void addFirst(int data) {
        // step 1=create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2= make newNode next=head
        newNode.next = head; // this will link.

        // step 3= make head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // i=index-1 ; temp=prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; // no valid value is returned.
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // for prev we need a loop. i=size-2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // For searching a key using iteration.
    public int itrSearch(int key) { // O(n).
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found:
        return -1;
    }

    // Find key using recursion. Time and space = O(n).
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() { // O(n).
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size:
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // removeFirst
            return;
        }
        // in other cases: sz-n;
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        // this will delete the node automatically as we are deleting the link of prev
        // node to the deleting node and linking it to the further node of deleted node.
        prev.next = prev.next.next;
        return;
    }

    // Check if number is PALINDROME:
    public Node findMid(Node head) { // helper
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 step.
            fast = fast.next.next; // +2 steps.
        }
        return slow; // slow is my middle node ie. midNode.
    }

    public boolean checkPalindrome() {
        // base case:
        if (head == null || head.next == null) {
            return true;
        }
        // Step 1: find mid:
        Node midNode = findMid(head);

        // Step 2: reverse 2nd half:
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // Step 3: Check if right half and left half equal or not:
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            // otherwise update values:
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(4, 5); // inserted 9 at index 2.
        ll.print();
        System.out.println("size is: " + ll.size);
        // ll.removeFirst(); // First node is removed.
        // ll.print();
        // ll.removeLast(); // Last node is also removed.
        // ll.print();
        // System.out.println("size is: " + ll.size); // size is decreased to 3.
        System.out.println(ll.itrSearch(3)); // key found return index.
        System.out.println(ll.itrSearch(10));// key not found = return -1.
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(15));
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(3); // 3rd node from end is deleted.
        ll.print();
        /*
         * Check for palindrome:
         * ll.addLast(1);
         * ll.addLast(2);
         * ll.addLast(2);
         * ll.addLast(1);
         * ll.print();
         * System.out.println(ll.checkPalindrome());
         */
    }
}
