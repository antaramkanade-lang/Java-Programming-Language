import java.util.*;

public class ValidVoter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 0 || age > 120) {
            System.out.println("Invalid age to vote ");
        } else if (age >= 18) {
            System.out.println("You can vote ");
        } else {
            System.out.println("You cannot Vote");
        }
    }
}
