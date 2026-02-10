import java.util.*;

public class IfElseStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The age is:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can drive,vote etc");
        } else {
            System.out.println("You are not an adult!");
        }
    }
}
