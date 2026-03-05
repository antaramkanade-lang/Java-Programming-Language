public class SwapWithoutThirdVariable {

    public static void swap(int x, int y) {
        System.out.println("Before Swapping: " + "x = " + x + " and " + " y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After Swapping: " + "x = " + x + " and " + " y = " + y);
    }

    public static void main(String args[]) {
        swap(3, 4);
    }
}

// OR
/*
 * public class SwapWithoutThirdVariable {
 *
 * public static void swap(int a, int b) {
 * a = a + b;
 * b = a - b;
 * a = a - b;
 *
 * System.out.println("a = " + a);
 * System.out.println("b = " + b);
 * }
 *
 * public static void main(String args[]) {
 * swap(3, 9);
 * }
 * }
 */