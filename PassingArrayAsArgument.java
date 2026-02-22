import java.util.*;

public class PassingArrayAsArgument {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            // Add 1 mark to all marks from starting.
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 67, 89, 75 };
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
