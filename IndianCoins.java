import java.util.*;
import java.util.Arrays;

public class IndianCoins {
    public static void main(String args[]) {
        // Integer is used because we want to sort in reverse using comparator.
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>(); // use to store coins we will use.
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]); // add coins used in ans ArrayList.
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total minimum coins used are: " + countOfCoins);

        // to check which coins we took:
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
