import java.util.*;

public class LengthOfStringByRecursion {
    public static int count(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return count(str.substring(1)) + 1;
    }

    public static void main(String args[]) {
        String str = "antara";
        System.out.println(count(str));
    }
}
