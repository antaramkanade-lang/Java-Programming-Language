import java.util.*;

//Absolute Difference is the distance between two numbers.
//Ex=If two numbers are 2 and 9 there dist between them is 7.
public class AbsoluteDifference {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int dist;
        if (a > b) {
            dist = a - b; // Instead we can also write Math.abs() to calc absolute difference.
        } else {
            dist = b - a;
        }
        System.out.println("The distance between a and b is:" + dist);
    }
}
