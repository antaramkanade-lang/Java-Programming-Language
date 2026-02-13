import java.util.*;

public class WhileLoop {
    public static void main(String args[]) {
        int i = 0;
        while (i < 100) { // There is infinite loop which runs unstoppable.
                          // Just write true in the condition. Like while(true){}
            System.out.println("Hello World !");
            i++;
        }
        System.out.println("Printed hello world 100 times.");
    }
}
