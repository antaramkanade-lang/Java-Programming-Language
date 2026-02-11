import java.util.*;

public class Days {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day (1-7):");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Its MONDAY!");
                break;
            case 2:
                System.out.println("Its TUESDAY!");
                break;
            case 3:
                System.out.println("Its WEDNESDAY!");
                break;
            case 4:
                System.out.println("Its THURSDAY!");
                break;
            case 5:
                System.out.println("Its FRIDAY!");
                break;
            case 6:
                System.out.println("Its SATURDAY!");
                break;
            case 7:
                System.out.println("Its SUNDAY!");
                break;
            default:
                System.out.println("There is no such day....");
        }
    }
}
