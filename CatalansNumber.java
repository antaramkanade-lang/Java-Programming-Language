import java.util.Arrays;

public class CatalansNumber {
    // Using Recursion:
    public static int catalanRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanRec(i) * catalanRec(n - i - 1);
        }
        return ans;
    }

    // Using Memoization:
    public static int catalanMem(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catalanMem(i, dp) * catalanMem(n - i - 1, dp);
        }
        return dp[n] = ans;
    }

    // Using Tabulation: T.C=O(n^2).
    public static int catalanTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 4;
        // for rec:
        System.out.println(catalanRec(n));
        // For memoization:
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1); // It will fill -1 on every index of an array.
        System.out.println(catalanMem(n, dp));
        // For tab:
        System.out.println(catalanTab(n));
    }
}
