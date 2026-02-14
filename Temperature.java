import java.util.*;

public class Temperature {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = sc.nextInt();
        if (temp < 0) {
            System.out.println("Freezing");
        } else if (temp >= 0 && temp <= 20) {
            System.out.println("Cold");
        } else if (temp > 20 && temp <= 35) {
            System.out.println("Normal");
        } else {
            System.out.println("Hot");
        }
    }
}
