import java.util.*;

//Write True for even and false otherwise using int argument in method.
public class EvenOrNot {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
