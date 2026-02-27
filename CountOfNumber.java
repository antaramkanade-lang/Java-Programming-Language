import java.util.*;

public class CountOfNumber {
    // check how many times 7 occurred is an array.
    public static void main(String args[]) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int countof7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    countof7++;
                }
            }
        }
        System.out.println("Number of times 7 occurred is: " + countof7);
    }
}
