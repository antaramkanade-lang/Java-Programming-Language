import java.util.*;

// Time Complexity =O(log n).
public class OptimizedPowerPrinting {
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        // when n is even:
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // when n is odd:
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        System.out.println(optimizedPower(2, 10));
    }
}
