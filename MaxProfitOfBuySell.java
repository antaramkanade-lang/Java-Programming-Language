import java.util.*;

public class MaxProfitOfBuySell {
    // Time complexity=O(n)
    public static int buySell(int prices[]) {
        int maxProfit = 0;
        int minbuyPrice = Integer.MAX_VALUE;
        for (int sell = 0; sell < prices.length; sell++) {
            minbuyPrice = Math.min(minbuyPrice, prices[sell]);
            int profit = prices[sell] - minbuyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("The max profit is: " + buySell(prices));
    }
}
