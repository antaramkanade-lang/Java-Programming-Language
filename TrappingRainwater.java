import java.util.*;

public class TrappingRainwater {
    // Time complexity=O(n) because it goes till the no in height.
    public static int trappedRainwater(int height[]) {
        // max of left boundary array, use auxiliary array.
        if (height.length <= 2) {
            return 0;
        }
        int maxLeft[] = new int[height.length];
        maxLeft[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }
        // max of right boundary array, use auxiliary array.
        int maxRight[] = new int[height.length];
        maxRight[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("The trapped water is: " + trappedRainwater(height));
    }
}
