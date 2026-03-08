import java.util.*;

public class Recursion {
    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int m) {
        if (m == 10) {
            System.out.println(m);
            return;
        }
        System.out.print(m + " ");
        printIncreasing(m + 1);
    }
    // or for increasing order:
    // if(n==1) Syso=n and return;
    // printIncreasing(n-1);
    // Syso(n+" ");

    public static void main(String args[]) {
        int n = 10;
        int m = 1;
        printDecreasing(n);
        printIncreasing(m);
    }
}
