import java.util.*;

//Time complexity= O(n) because only single loop is used
public class KadanesSum {
    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("The max sum is: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(numbers);
    }
}

/*
 * This condition is for when all the numbers in the array are negative and we
 * want the smallest -ve value instead of 0:-
 *
 * int maxSum = Integer.MIN_VALUE;
 * int currSum = 0;
 *
 * for (int i = 0; i < numbers.length; i++) {
 * currSum = Math.max(numbers[i], currSum + numbers[i]);
 * maxSum = Math.max(currSum, maxSum);
 * }
 * System.out.println("The max sum is: " + maxSum);
 */
