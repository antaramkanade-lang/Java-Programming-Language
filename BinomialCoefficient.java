import java.util.*;

public class BinomialCoefficient {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binoCoeff = fact_n / (fact_r * fact_nmr);
        return binoCoeff;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        int bin = binoCoeff(n, r);
        System.out.println(bin);
    }

}
