import java.util.*;

public class ProfitLoss {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost price: ");
        double costPrice = sc.nextDouble();

        System.out.println("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice <= 0 || costPrice <= 0) {
            System.out.println("Invalid price values");
            return;
        }

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100;

            System.out.println("PROFIT is: " + profit);
            System.out.println("PROFIT % is: " + profitPercent);

        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100;

            System.out.println("LOSS is: " + loss);
            System.out.println("LOSS % is: " + lossPercent);

        } else {
            System.out.println("No PROFIT No LOSS");
        }
    }
}
