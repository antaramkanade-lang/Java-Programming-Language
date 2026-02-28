import java.util.*;
import java.util.Arrays;

//Find the majority element in the array which is greater than n/2 length of array.
//This is the brute force approach:-
public class MajorityElement {
    // time complexity=O(n^2).
    public static int majorityEleBrute(int nums[]) {
        for (int val = 0; val < nums.length; val++) {
            int freq = 0;
            for (int el = 0; el < nums.length; el++) {
                if (nums[el] == nums[val]) {
                    freq++;
                }
            }
            if (freq > nums.length / 2) {
                return nums[val];
            }
        }
        return -1;
    }

    // time complexity= O(nlogn).
    public static int majorityEleSorted(int nums[]) {
        // Sort array:
        Arrays.sort(nums);

        int freq = 1, ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                freq++;
            } else {
                freq = 1;
                ans = nums[i];
            }

            if (freq > nums.length / 2) {
                return ans;
            }
        }
        return -1;
    }

    // time complexity=O(n).
    public static int majorityEleMooresAlgo(int nums[]) {
        int freq = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority element by brute force is: " + majorityEleBrute(nums));
        System.out.println("Majority element by optimized or sorted method is: " + majorityEleSorted(nums));
        System.out.println("Majority element by moore's voting algorithm is: " + majorityEleMooresAlgo(nums));
    }
}
