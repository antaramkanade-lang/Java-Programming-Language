import java.util.*;

public class MajorityElementWithMergeSort {
    public static int majorityEle(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
                if (count > nums.length / 2) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    // using merge sort:
    public static int majorityEle(int nums[], int si, int ei) {

        if (si == ei) {
            return nums[si];
        }

        int mid = si + (ei - si) / 2;

        int left = majorityEle(nums, si, mid);
        int right = majorityEle(nums, mid + 1, ei);

        if (left == right) {
            return left;
        }

        int leftCount = count(nums, left, si, ei);
        int rightCount = count(nums, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int count(int nums[], int num, int si, int ei) {
        int count = 0;

        for (int i = si; i <= ei; i++) {
            if (nums[i] == num) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityEle(nums));
        System.out.println(majorityEle(nums, 0, nums.length - 1));
    }
}
