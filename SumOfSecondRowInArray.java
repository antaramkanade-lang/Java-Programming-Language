import java.util.*;

public class SumOfSecondRowInArray {
    public static void main(String args[]) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = 0;
        // sum of second row.
        for (int j = 0; j < nums[0].length; j++) {
            // here [1] is used because it shows that row is fixed but column is changing.
            sum += nums[1][j];
        }
        System.out.println("Sum is : " + sum);
    }
}
