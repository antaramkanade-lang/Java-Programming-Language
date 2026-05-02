import java.util.*;

public class ClimbingStairs {
    // Using Recursion: O(2^n).
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    // Using Memoization: O(n).
    public static int countWays2(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) { // already Calculated
            return ways[n];
        }
        ways[n] = countWays2(n - 1, ways) + countWays2(n - 2, ways);
        return ways[n];
    }

    // Using Tabulation: O(n).
    public static int countWays3(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        // tabulation loop:
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5; // n=3:- 3 ways + n=4:- 5 ways -> total 8 ways
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println("Using recursion: " + countWays(n));
        System.out.println("Using Memoization: " + countWays2(n, ways));
        System.out.println("Using Tabulation: " + countWays3(n));
    }
}
