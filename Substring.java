import java.util.*;

//print a substring:-
public class Substring {
    // si=starting index, ei=ending index.
    public static String printSubstring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.println(printSubstring(str, 0, 5)); // It prints from index 0 to 4.

        // There is a builtin method to print a substring:-
        System.out.println(str.substring(0, 8));
    }
}
