import java.util.*;

public class SwitchStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The number is:");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Rabdi");
                break;
            case 3:
                System.out.println("Mango Shake");
                break;
            default:
                System.out.println("Wake up! It was a dream!!");
        }
    }
}
