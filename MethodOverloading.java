import java.util.*;

public class MethodOverloading {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 9));
        System.out.println(calc.sum(3.5f, 9.2f));
        System.out.println(calc.sum(2, 6, 9));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
