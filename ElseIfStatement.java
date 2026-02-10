import java.util.*;

public class ElseIfStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The age is:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an Adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not Adult");
        }
    }
}
