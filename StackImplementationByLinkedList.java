import java.util.LinkedList;

public class StackImplementationByLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null; // return true is list is empty otherwise false.
        }

        // push:
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop:
        public static int pop() {
            if (isEmpty()) {// If list is empty then there is nothing to remove.
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek:
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) { // It works till the stack gets empty.
            System.out.println(s.peek());
            s.pop();
        }
    }
}