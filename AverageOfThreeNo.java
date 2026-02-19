import java.util.*;

public class AverageOfThreeNo {
    public static double Average(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        System.out.println("The average of three numbers is: " + avg);
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        Average(a, b, c);
    }
}
