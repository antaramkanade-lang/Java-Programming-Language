import java.util.*;

//time complexity=O(n log n)
//space complexity=O(n)
public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // for left part
        mergeSort(arr, mid + 1, ei); // for right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // creating temporary array
        // [ei-si+1]={0,3} and{4,6} so 6-0=6, 6+1=7 so total element are 7 thats why +1.
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left sorted part
        int j = mid + 1; // iterator for right sorted part
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements of 1st sorted part:
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover elements of 2nd sorted part:
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array:
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
