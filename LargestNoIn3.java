import java.util.*;

public class LargestNoIn3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of a:");
        int a = sc.nextInt();
        System.out.println("The value of b:");
        int b = sc.nextInt();
        System.out.println("The value of c:");
        int c = sc.nextInt();
        if ((a >= b) && (a >= c)) {
            System.out.println("a is the largest no.");
        } else if ((b >= a) && (b >= c)) {
            System.out.println("b is the largest no.");
        } else {
            System.out.println("c is the largest no.");
        }
    }
}
