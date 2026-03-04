import java.util.*;

public class UpdateithBit {
    public static int set(int n, int i) {
        int bitMask = 1 << i;
        return ((n | bitMask));
    }

    public static int clear(int n, int i) {
        int bitMask = ~(1 << i);
        return ((n & bitMask));
    }

    public static int update(int n, int i, int newBit) {
        if (newBit == 0) {
            return clear(n, i);
        } else {
            return set(n, i);
        }

        // Another method for update is:
        // n=clear(n,i);
        // int bitMask=new<<i;
        // return (n|bitMask);
    }

    public static void main(String args[]) {
        System.out.println(update(10, 2, 1));
    }
}
