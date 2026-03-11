import java.util.*;

public class ConvertNumberInString {
    // here we used static because it will store only once in the memory and
    // don't need to store again and again.
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void convert(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        convert(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String args[]) {
        convert(2014);
    }
}