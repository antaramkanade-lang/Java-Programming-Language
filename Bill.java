import java.util.*;

public class Bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The Amount of pencil is:");
        float pencil = sc.nextFloat();
        System.out.print("The amount of pen is:");
        float pen = sc.nextFloat();
        System.out.print("The amount of eraser is:");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("The Bill is:" + total);

        // Add on 18% gst:
        float newTotal = total + (0.18f * total);
        System.out.println("The Bill with 18% tax:" + newTotal);
        sc.close();
    }
}
