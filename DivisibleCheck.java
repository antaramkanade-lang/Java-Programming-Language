import java.util.*;

public class DivisibleCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) { // Here it checks the no. is divisible by both 3 & 5.
            System.out.println("Yes the number is divisible by both 3 and 5!");
        } else {
            System.out.println("The number is not divisible.");
        }
    }
}
