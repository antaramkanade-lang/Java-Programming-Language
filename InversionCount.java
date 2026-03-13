import java.util.*;

public class InversionCount {
    public static int count(int arr[]) {
        int invCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    // with merge sort:
    public static int mergeSort(int arr[], int si, int ei) {
        int invCount = 0;
        if (si < ei) {
            int mid = (si + ei) / 2;
            invCount += mergeSort(arr, si, mid);
            invCount += mergeSort(arr, mid + 1, ei);
            invCount += merge(arr, si, mid, ei);
        }
        return invCount;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        int invCount = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(count(arr));
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }
}
