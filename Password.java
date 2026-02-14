import java.util.*;

public class Password {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String pass = sc.next();
        boolean hasDigit = false;
        boolean hasUppercase = false;
        for (int i = 0; i < pass.length(); i++) { // here i<pass.length() because string goes from 0 to n-1.
            char ch = pass.charAt(i);
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            }
        }
        if (pass.length() >= 8 && hasDigit && hasUppercase) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}
