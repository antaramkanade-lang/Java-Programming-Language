import java.util.*;

public class SwapNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        // This is used to swap numbers without using int temp=a; a=b; b=temp;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
