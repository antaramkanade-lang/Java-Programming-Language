import java.util.*;

public class ContinueStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println("Skips the current iteration");
                continue;
            }
            System.out.println("num :" + num);
        } while (true);
    }
}
