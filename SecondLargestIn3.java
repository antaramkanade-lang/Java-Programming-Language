import java.util.*;

public class SecondLargestIn3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c :");
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("All are equal");
        } else if (a == b || a == c) {
            System.out.println("Second largest is a :" + a);
        } else if (b == c) {
            System.out.println("Second largest is b: " + b);
        } else if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println("Second largest is: " + a);
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println("Second largest is: " + b);
        } else {
            System.out.println("Second largest is: " + c);
        }
    }
}
