import java.util.*;

// Parameters are the inputs of the functions. num1 and num2 are i/p.
public class SumWithParameters {
    public static int calculateSum(int num1, int num2) {// Parameters & Formal Parameters.(Definition)
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);// Arguments or Actual Parameters.(call)
        System.out.println("sum is :" + sum);
    }
}
