import java.util.*;

//time complexity=O(n*n!).
public class Permutation {
    public static void findPermutation(String str, String ans) {
        // base case:
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i); // Store current character in it.
            // "abcde":-"ab"+"de"="abde"...c is removed:-
            // For storing new substring we have to remove the one which has already been
            // placed at index
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(NewStr, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutation(str, "");
    }
}
