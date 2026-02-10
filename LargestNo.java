import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class LargestNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of a is:");
        int a = sc.nextInt();
        System.out.println("The value of b is:");
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println("a is greater then b:" + a);
        } else {
            System.out.println("b is greater than a:" + b);
        }
    }
}
