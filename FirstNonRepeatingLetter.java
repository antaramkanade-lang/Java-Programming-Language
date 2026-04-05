import java.util.*;

public class FirstNonRepeatingLetter {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; // 'a' to 'z'
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++; // Subtracting two characters give an int value.
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) { // remove ch till then the queue is empty or freq>2.
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
