import java.util.*;

public class TernaryOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The number is:");
        int num = sc.nextInt();
        String type = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("The number is: " + type);

        // Check if the student will pass or fail.
        System.out.println("The marks are:");
        int marks = sc.nextInt();
        String reportCard = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println("The student is: " + reportCard);
    }
}
