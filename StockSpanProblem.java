import java.util.*;

public class StockSpanProblem {
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        // base case: At 1st day span will be always 1:
        span[0] = 1; // 1st day means 0th index.
        s.push(0);
        // A loop which will calculate span for each day:
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop(); // Remove all small value to get the highest value using peek.
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh; // Formula
            }
            s.push(i);
        }
    }

    public static void main(String args[]) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}