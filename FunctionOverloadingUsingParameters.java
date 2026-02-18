import java.util.*;

public class FunctionOverloadingUsingParameters {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(sum(3, 8));
        System.out.println(sum(5, 4, 9));
    }
}
// In Function Overloading we have to take different parameters for same
// function names and return types are same but that does not matter.
