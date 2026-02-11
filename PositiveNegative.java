import java.util.*;

public class PositiveNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        // This statement shows that num greater than 0 are +ve
        // but lesser than 0 are -ve and if 0 Than print 0.
        String checkNo = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println("So the number is : " + checkNo); // We can also write this problem in if-else.
    }
}
