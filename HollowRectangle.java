import java.util.*;

public class HollowRectangle {
    public static void hollowRec(int toRows, int toCol) {
        for (int i = 1; i <= toRows; i++) {
            for (int j = 1; j <= toCol; j++) {
                if (i == 1 || i == toRows || j == 1 || j == toCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollowRec(4, 5);
    }
}
