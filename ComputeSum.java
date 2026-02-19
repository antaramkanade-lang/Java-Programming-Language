import java.util.*;

public class ComputeSum {
    public static int sumDigits(int n) {
        int sumofDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumofDigits += lastDigit;
            n /= 10;
        }
        return sumofDigits;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("The sum of digits is:" + sumDigits(n));
    }
}
