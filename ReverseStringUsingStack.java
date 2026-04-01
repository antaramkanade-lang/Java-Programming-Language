import java.util.*;

public class ReverseStringUsingStack {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        // make a string builder to store the remove characters:
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr); // append means add in front.
        }
        return result.toString(); // toString is used to store the data of string builder in string.
    }

    public static void main(String args[]) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
