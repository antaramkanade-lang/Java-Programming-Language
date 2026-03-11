import java.util.*;

public class BinaryStrings {
    public static void printBinStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (lastPlace == 0) {
            printBinStrings(n - 1, 0, str + "0");
            printBinStrings(n - 1, 1, str + "1");
        } else {
            printBinStrings(n - 1, 0, str + "0");
        }
        // or we can also write code as:
        // printBinStrings(n-1,0,str+"0");
        // if(lastPlace==0) {
        // printBinStrings(n-1,1,str+"1");
        // }
    }

    public static void main(String args[]) {
        printBinStrings(4, 0, "");
    }
}
