import java.util.*;

public class PrintNumbers {
    public static void main(String args[]) {
        int counter = 1;
        while (counter <= 20) {
            System.out.println(counter);
            counter++;
        }

        // Now take number as input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
