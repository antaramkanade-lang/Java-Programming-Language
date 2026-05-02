import java.util.*;

public class ZeroOneKnapsack {
    // Using Recursion: O(2^n)
    public static int knapsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        // n-1 because n is length of array and 1st item is on 0th index.
        if (wt[n - 1] <= W) {// Valid
            // include:
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            // exclude:
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2); // check which one has max value then return it.
        } else { // not valid
            return knapsack(val, wt, W, n - 1);
        }
    }

    // Using Memoization: O(n*W).
    public static int knapsack2(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        // n-1 because n is length of array and 1st item is on 0th index.
        if (wt[n - 1] <= W) {// Valid
            // include:
            int ans1 = val[n - 1] + knapsack2(val, wt, W - wt[n - 1], n - 1, dp);
            // exclude:
            int ans2 = knapsack2(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2); // check which one has max value then return it.
            return dp[n][W];
        } else { // not valid
            dp[n][W] = knapsack2(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    // Using Tabulation:
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int knapsack3(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) { // 0th col
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // 0th row
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1]; // value of ith item
                int w = wt[i - 1]; // wt of ith item
                if (w <= j) { // valid:
                    // include:
                    int incProfit = v + dp[i - 1][j - w];
                    // exclude:
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // invalid:
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp); // to print the table.
        return dp[n][W];
    }

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("max value using recursion: " + knapsack(val, wt, W, val.length));
        System.out.println("max value using memoization: " + knapsack2(val, wt, W, val.length, dp));
        System.out.println("max value using tabulation: " + knapsack3(val, wt, W));
    }
}
