import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Its a leap year!");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Its a leap Year!");
        } else {
            System.out.println("Its not a leap year...");
        }
        // OR the code can also be written in this way:-
        int typeYear = sc.nextInt();
        boolean x = (typeYear % 4) == 0;
        boolean y = (typeYear % 100) != 0;
        boolean z = ((typeYear % 100 == 0) && (typeYear % 400 == 0));
        if (x && (y || z)) {
            System.out.println(typeYear + " Its a leap year");
        } else {
            System.out.println(typeYear + "Its not a leap year...");
        }
    }
}
