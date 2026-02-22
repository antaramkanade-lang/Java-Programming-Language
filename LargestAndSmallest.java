import java.util.*;

public class LargestAndSmallest {
    public static int largeSmall(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest no. is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 8, 14 };
        System.out.println("Largest no. is: " + largeSmall(numbers));
    }
}
