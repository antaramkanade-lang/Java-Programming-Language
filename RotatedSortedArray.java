import java.util.*;

//find the target is at which index:
//Time complexity=O(log n). Because we are not scanning element by element till n.
public class RotatedSortedArray {
    public static int findIndex(int nums[], int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // check for left half sorted:
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // check for right half sorted:
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 5, 6, 7, 0, 1, 2, 3, 4 };
        int target = 7;
        System.out.println("Target is at an index: " + findIndex(nums, target));
    }
}
