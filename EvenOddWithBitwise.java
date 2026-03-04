import java.util.*;

public class EvenOddWithBitwise {
    public static void evenOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String args[]) {
        evenOdd(5);
        evenOdd(14);
        evenOdd(2);
    }
}
