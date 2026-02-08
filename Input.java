import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // Use to print a single word till the space.
        System.out.println(input);

        String name = sc.nextLine(); // Use to print the whole line or sentences with the spaces.
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);
    }
}
