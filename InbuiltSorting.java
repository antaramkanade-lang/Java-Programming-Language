import java.util.Arrays;

public class InbuiltSorting {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 2, 1, 3 };
        Arrays.sort(arr);
        printArr(arr);
    }
}
