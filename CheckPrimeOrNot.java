import java.util.*;

public class CheckPrimeOrNot {
    public static boolean isPrime(int n) {
        // Corner case for 2:-
        if (n == 2) {
            return true;
        }
        // In optimized method for prime numbers we use i<Math.sqrt(n) instead of n-1.
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        boolean num = isPrime(n);
        System.out.println(num);
    }
}
