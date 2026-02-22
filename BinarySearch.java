import java.util.*;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 1, 4, 5, 6, 7, 10, 13, 17, 19, 20 };
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("Key Not found!");
        } else {
            System.out.println("Key is at an index: " + index);
        }
    }
}
