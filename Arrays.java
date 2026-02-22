import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
        // update marks of chemistry:-
        marks[2] = 100;
        System.out.println("Updated marks of chemistry: " + marks[2]);
        // Find percentage:-Remove the updated marks[2] or take one from two of them.
        int percentage = (marks[1] + marks[2] + marks[3]) / 3;
        System.out.println("Percentage is: " + percentage + "%");
    }
}
