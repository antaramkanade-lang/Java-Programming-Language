import java.util.*;

public class AccessModifiers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Antara";
        myAcc.setPassword("abcd");
        System.out.println(myAcc.username);
        // System.out.println(myAcc.password); this will give error after execution
        // because password has private access modifier and so we cannot print it we can
        // only change it within class.
    }
}

class BankAccount {
    public String username;
    private String password; // now as we made this pass private so we cannot access it directly in the main.

    // for accessing the password in main method above:

    public void setPassword(String pwd) {
        password = pwd;
    }
}
