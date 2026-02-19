import java.util.*;

public class DecimalToBinary {
    public static void decToBin(int n) {
        int myNum = n;
        int binNum = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("The binary of " + myNum + " is " + binNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal no.: ");
        int n = sc.nextInt();
        decToBin(n);

    }
}
