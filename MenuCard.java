import java.util.*;

public class MenuCard {
    public static int menu(String items[], String key) {
        for (int i = 0; i < items.length; i++) {
            // when we use strings then .equals() is used to check if two objects are same.
            if (items[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String items[] = { "samosa", "idli", "kachori", "dosa", "vadapaav", "tea", "coffee" };
        System.out.println("Enter the item you want to eat...");
        String key = sc.next();
        int index = menu(items, key);
        if (index == -1) {
            System.out.println("That item is not available!");
        } else {
            System.out.println("Your order is confirmed: Item is at the index = " + index);
        }
    }
}
