import java.util.*;

public class BreakStatement {
    public static void main(String args[]) {
        // Print the numbers till the user enter the multiple of 10. Like 10,20,30..
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the number :");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println("Out of the loop");
                break;
            }
            System.out.println(num);
        } while (true);
    }
}
