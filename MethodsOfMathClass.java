import java.util.*;

public class MethodsOfMathClass {
    public static double findMin(double a, double b) {
        return Math.min(a, b);
    }

    public static double findMax(double num1, double num2) {
        return Math.max(num1, num2);

    }

    public static double findsqrt(double num) {
        return Math.sqrt(num);
    }

    public static double findPower(double n, double m) {
        return Math.pow(n, m);
    }

    // There is no built in method in java for finding average.
    public static double findAvg(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // Absolute removes the negative sign of any number.
    public static double findAbsolute(double number) {
        return Math.abs(number);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("The minimum no. is: " + findMin(a, b));

        System.out.println("Enter 1st num: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd num: ");
        double num2 = sc.nextDouble();
        System.out.println("The maximum no. is: " + findMax(num1, num2));

        System.out.println("Enter num: ");
        double num = sc.nextDouble();
        System.out.println("The square root of the number is: " + findsqrt(num));

        System.out.println("Enter n: ");
        double n = sc.nextDouble();
        System.out.println("Enter m: ");
        double m = sc.nextDouble();
        System.out.println("The power is: " + findPower(n, m));

        System.out.println("Enter n1: ");
        double n1 = sc.nextDouble();
        System.out.println("Enter n2: ");
        double n2 = sc.nextDouble();
        System.out.println("The average is: " + findAvg(n1, n2));

        System.out.println("Enter number: ");
        double number = sc.nextDouble();
        System.out.println("The absolute valus of number is: " + findAbsolute(number));

    }
}
