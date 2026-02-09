import java.util.*;

public class Operators {
    public static void main(String args[]) {
        // Arithmetic Operators:-
        int a = 20;
        int b = 10;
        System.out.println("Sum is:" + (a + b));
        System.out.println("Subtraction is:" + (a - b));
        System.out.println("multiplication is:" + (a * b));
        System.out.println("modulo or remainder is:" + (a % b));

        // Unary Operators:- these are the ex of pre and post increment same thing
        // happens with decrement Operators also.
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        int l = 10;
        int k = l++;
        System.out.println(l);
        System.out.println(k);

        // Relational Operators:-
        int A = 10;
        int B = 20;
        System.out.println((A == B));
        System.out.println((A != B));
        System.out.println((A > B));
        System.out.println((A < B));
        System.out.println((A >= B));
        System.out.println((A <= B));

        // Logical Operators:-
        System.out.println((3 > 2) && (4 > 3));// It gives true when both the statements are true.
        System.out.println((3 > 2) || (2 > 5));// It gives true when even one statement is true.
        System.out.println(!(1 > 7));// It converts the statement from true to false and false to true.

        // Assignment Operators:- =, += , -= , *= , /= , %=
        int num = 10;
        // num=num+20
        num += 20;
        System.out.println(num);
    }
}
