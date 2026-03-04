import java.util.*;

public class ClearIBits {
    public static int clear(int n, int i) {
        int bitMask = (~0) << i;
        return (n & bitMask);
    }

    public static void main(String args[]) {
        System.out.println(clear(15, 2));
    }
}
