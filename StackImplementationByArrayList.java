import java.util.ArrayList;

//Implement stack using Array Lists:
public class StackImplementationByArrayList {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() { // It checks if the list is empty or not.
            return list.size() == 0;
        }

        // push:
        public static void push(int data) {
            list.add(data);
        }

        // pop:
        public static int pop() {
            if (isEmpty()) { // If the stack is empty then give -1.
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek:
        public static int peek() {
            if (isEmpty()) { // If the stack is empty then give -1.
                return -1;
            }
            return list.get(list.size() - 1);
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
