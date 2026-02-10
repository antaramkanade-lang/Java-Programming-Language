import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        System.out.println("Enter the Operator:");
        char operator = sc.next().charAt(0); // Here I used next() so it will print the whole string and
                                             // charAt(0) so that it will print the character instead of string.
        switch (operator) {
            case '+':
                System.out.println("Addition of a,b & c is:" + (a + b));
                break;
            case '-':
                System.out.println("Subtraction of a,b & c is:" + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of a,b & c is:" + (a * b));
                break;
            case '/':
                System.out.println("Division of a,b & c is:" + (a / b));
                break;
            case '%':
                System.out.println("Remainder of a,b & c is:" + (a % b));
                break;
            default:
                System.out.println("Wrong Operator");
        }
    }
}
