import java.util.*;

//time complexity=O(26), if we used strings instead then it will be O(26*n^2).
public class StringBuilderDemo {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
