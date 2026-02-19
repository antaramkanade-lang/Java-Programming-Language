import java.util.*;

//Palindrome is if the reverse of any number is again the same number.
//ex= reverse of 121 is 121 and 132 is not palindrome.
public class Palindrome {
    public static boolean isPalindrome(int num) {
        int palindrome = num;
        int rev = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            rev = rev * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (num == rev) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
    }

}
