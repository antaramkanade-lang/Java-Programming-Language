import java.util.*;

//We have to add 1 to an integer which is through 2's compliment and it becomes negative.
public class AddOneToInteger {
    public static void Add(int n) {
        // here n+1 means -(~n) adding one to integer.
        int result = -(~n);
        System.out.println(result);
    }

    public static void main(String args[]) {
        Add(5);
    }
}
