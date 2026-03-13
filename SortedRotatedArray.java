import java.util.*;

//find the target in the sorted but rotated array.
public class SortedRotatedArray {
    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // mid on L1:
        if (arr[si] <= arr[mid]) {
            // case a:left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
                // case b:right
            } else {
                return search(arr, target, mid + 1, ei);
            }
            // mid on L2:
        } else {
            // case c:left
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
                // case d: right
            } else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
