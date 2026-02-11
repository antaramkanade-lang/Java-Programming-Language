import java.util.*;

public class CharacterType {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPERCASE");
        } else if (ch >= 'a' && ch <= 'b') {
            System.out.println("LOWERCASE");
        } else if (ch >= '1' && ch <= '9') { // It print every number as digit as it stores the first digit of even
                                             // bigger no. from starting '1' to '9'.
            System.out.println("DIGIT");
        } else {
            System.out.println("Its a special Character!");
        }
    }
}
