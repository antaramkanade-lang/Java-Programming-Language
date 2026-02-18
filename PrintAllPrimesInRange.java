import java.util.*;

public class PrintAllPrimesInRange {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // It will print all the prime numbers in the given range from 2 to any number
    // given by user.
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the the prime numbers till the range: ");
        int n = sc.nextInt();
        primesInRange(n);
    }
}