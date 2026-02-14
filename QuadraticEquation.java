import java.util.*;

public class QuadraticEquation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();
        if (a == 0) {
            System.out.println("This is not a quadratic Equation.");
            return;
        }
        int D = b * b - 4 * a * c;
        if (D > 0) {
            System.out.println("D is : " + D + " = Equation is Real and Distinct");
        } else if (D == 0) {
            System.out.println("D is : " + D + " = Equation is Real and Equal");
        } else {
            System.out.println("D is : " + D + " = Equation is Imaginary");
        }
    }
}
