import java.util.*;

public class SumOfSubarrays {
    public static void sumSubarrays(int numbers[]) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i; j < numbers.length; j++) {
                sum = sum + numbers[j];
                System.out.println("Subarray sum: " + sum);
                totalSum += sum;

                if (sum < minSum) {
                    minSum = sum;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("The minimum sum: " + minSum);
        System.out.println("The maximum sum: " + maxSum);
        System.out.println("The totalSum is: " + totalSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        sumSubarrays(numbers);
    }
}
