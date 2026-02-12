import java.util.*;

public class NumberSignAndParityCombo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Zero is Even but not Positive or negative");
        } else if (num % 2 == 0 && num > 0) {
            System.out.println("Positive Even");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("Negative Even");
        } else if (num % 2 != 0 && num > 0) {
            System.out.println("Positive Odd");
        } else {
            System.out.println("Negative Odd");
        }
    }
}
