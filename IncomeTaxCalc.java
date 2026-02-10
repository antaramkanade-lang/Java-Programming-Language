import java.util.*;

public class IncomeTaxCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The income is:");
        int income = sc.nextInt();
        double tax;
        if (income <= 500000) {
            System.out.println("Tax is 0%");
        } else if (income > 500000 && income < 1000000) {
            tax = income * 0.2; // Here as the value of tax is in double so instead of writing double tax;
                                // we can also write (int) in front of the statement as (int)(income*0.2)
            System.out.println("The tax is 20% :" + tax);
        } else {
            tax = income * 0.3;
            System.out.println("The tax is 30% :" + tax);
        }
    }
}
