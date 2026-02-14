import java.util.*;

public class ATM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount you want to withdraw: ");
        int amount = sc.nextInt();
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Enter the balance in your account: ");
        int balance = sc.nextInt();
        if (balance > amount) {
            System.out.println("You can Withdraw money");
        } else if (balance == amount) {
            System.out.println("You can withdraw but account balance will be 0");
        } else {
            System.out.println("You cannot withdraw money");
        }
    }
}
