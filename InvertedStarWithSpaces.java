import java.util.*;

public class InvertedStarWithSpaces {
    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // For spaces
            for (int s = 1; s <= i - 1; s++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
