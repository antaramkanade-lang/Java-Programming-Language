import java.util.*;

public class BinaryToDecimal {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10; // To take the last digit every time of a binary number.
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow)); // power of 2.

            pow++;
            binNum = binNum / 10; // To remove the last digit after done.

        }
        System.out.println("The decimal of " + myNum + " is " + decNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int binNum = sc.nextInt();
        binToDec(binNum);
    }
}
