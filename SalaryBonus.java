import java.util.*;

public class SalaryBonus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary :");
        int salary = sc.nextInt();
        double bonus;
        if (salary <= 50000) {
            bonus = (salary * 0.10);
            System.out.println("Bonus is 10% :" + bonus);
        } else if (salary <= 100000) {
            bonus = (salary * 0.05);
            System.out.println("Bonus is 5% :" + bonus);
        } else {
            bonus = (salary * 0.02);
            System.out.println("Bonus is 2% :" + bonus);
        }
    }
}
