import java.util.*;

//This is the optimized soln for finding the max and min sum.
//Time Complexity=O(n^2) because only two loops used.
public class PrefixSumOfSubarrays {
    public static void sumofSubarrays(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;

        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                if (currSum < minSum) {
                    minSum = currSum;
                }

            }
        }
        System.out.println("The max sum is: " + maxSum);
        System.out.println("The min sum is: " + minSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        sumofSubarrays(numbers);
    }

}
