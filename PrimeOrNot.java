import java.util.*;

public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 2) {
            System.out.println("Its a prime number.");
        } else {
            /*
             * In this for loop instead of writing i<=num-1, we have to write:
             * i<=Math.sqrt(num), its the root of num because it saves time for executing
             * large numbers. Under root n requires less time than num-1 for execution
             */
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Here n is multiple of i and i is not 1 or num so not prime no.
                }
            }
            if (isPrime == true) {
                System.out.println("Its a prime number.");
            } else {
                System.out.println("Its not a prime number.");
            }

        }
    }
}
