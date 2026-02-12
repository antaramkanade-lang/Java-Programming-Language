import java.util.*;

public class DiscountLogic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase amount :");
        int purchase = sc.nextInt();
        double discount = 0;
        if (purchase >= 5000) {
            discount = purchase * 0.20;
            System.out.println("The discount is 20% :" + discount);
        } else if (purchase >= 2000) {
            discount = purchase * 0.10;
            System.out.println("Discount is 10% :" + discount);
        } else {
            System.out.println("OOPS!! No Discount!");
        }
        double finalAmount = (purchase - discount);
        System.out.println("Your final amount to pay is :" + finalAmount);
    }
}
