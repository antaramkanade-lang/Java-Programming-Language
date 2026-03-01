import java.util.*;

//here we have to print the largest string in lexicographic order, it means the string which has largest letter in the beginning is considered as largest string.
//So here mango has 'm' in the starting so it is larger than 'a' and 'b' so largest string will be mango.
//time complexity=O(x*N).
public class LargestString {
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("Lexicographically largest fruit is: " + largest);
    }
}
