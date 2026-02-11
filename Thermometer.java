import java.util.*;

public class Thermometer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check the temperature:");
        double temp = sc.nextDouble();
        if (temp >= 100 && temp < 300) {
            System.out.println("You have a fever");
        } else if (temp >= 300) {
            System.out.println("You have an extreme fever! Go to Doctor!!!");
        } else {
            System.out.println("You don't have a fever");
        }

    }
}
