import java.util.*;

public class BitwiseOperatorCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        System.out.println("Its Bitwise AND is: " + andResult);
        System.out.println("Its Bitwise OR is: " + orResult);
        System.out.println("Its Bitwise XOR is: " + xorResult);
    }
}
