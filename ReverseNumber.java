import java.util.*;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        while (num > 0) {
            int lastDigit = num % 10; // This is used to take the last digit of any number.
            System.out.print(lastDigit);
            num = num / 10; // This is used to remove the last digit of any number.
        }
        System.out.println();
    }
}
/*
 * If we want to store the reverse of any number directly in the code then:-
 * int n=108999;
 * int rev=0;
 * while(n>0) {
 * int lastDigit=n%10;
 * rev=(rev*10)+lastDigit;
 * n=n/10;
 * }
 * System.out.println(rev);
 */
