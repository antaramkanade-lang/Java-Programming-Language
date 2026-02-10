import java.util.*;

public class OddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of num is:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + ":" + "This value is Even");
        } else {
            System.out.println(num + ":" + "This value is Odd");
        }
    }
}
