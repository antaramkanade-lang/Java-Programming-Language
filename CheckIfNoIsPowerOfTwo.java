import java.util.*;

public class CheckIfNoIsPowerOfTwo {
    public static boolean powerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(powerofTwo(8));
    }
}
