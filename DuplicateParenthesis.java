import java.util.*;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // for closing bracket:
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplicate exists
                } else {
                    s.pop();// duplicate does not exist
                }
            } else {
                // for opening:
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // Its a valid string:
        String str = "((a+b))";// true- duplicate exists
        String str2 = "(a-b)"; // false- duplicate does not exist
        System.out.println(isDuplicate(str));
    }
}
