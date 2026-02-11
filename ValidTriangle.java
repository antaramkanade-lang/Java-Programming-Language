import java.util.*;

public class ValidTriangle {
    // A triangle has its two sides always greater than the third.
    // The addition of its three angles should be strictly equal to 180 degree.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a = sc.nextInt();
        System.out.println("Enter second side: ");
        int b = sc.nextInt();
        System.out.println("Enter third side: ");
        int c = sc.nextInt();
        System.out.println("Enter first angle: ");
        int A = sc.nextInt();
        System.out.println("Enter second angle: ");
        int B = sc.nextInt();
        System.out.println("Enter third angle: ");
        int C = sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0 || A <= 0 || B <= 0 || C <= 0) {
            System.out.println("Invalid Triangle");
        }
        boolean validSides = (a + b > c && b + c > a && c + a > b);
        boolean validAngles = (A + B + C == 180);

        if (validSides && validAngles) {
            System.out.println("Valid Triangle");
        } else if (!validSides && !validAngles) {
            System.out.println("Invalid Triangle");
        } else if (!validSides) {
            System.out.println("Invalid Triangle (Sides wrong)");
        } else {
            System.out.println("Invalid Triangle (Angles wrong)");
        }
    }
}
