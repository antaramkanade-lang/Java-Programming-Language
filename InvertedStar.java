import java.util.*;

public class InvertedStar {
    public static void main(String args[]) {
        for (int line = 4; line >= 1; line--) {
            for (int star = line; star >= 1; star--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Or we can also print inverted star in another way:-
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}