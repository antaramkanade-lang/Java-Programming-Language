import java.util.*;

public class ReverseArray {
    // time complexity=O(n)
    // Space complexity=O(1) : No extra space taken here
    // variables always take constant space i.e O(1)
    // If O(2) space is taken then its also taken as O(n)
    public static void reverse(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 3, 4, 5, 6, 7, 8 };
        reverse(numbers);
        System.out.println("Reversed array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
