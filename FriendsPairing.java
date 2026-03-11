import java.util.*;

public class FriendsPairing {
    public static int pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choice:single
        int fnm1 = pairing(n - 1);

        // pair:
        int fnm2 = pairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // total ways:
        int totWays = fnm1 + pairWays;
        return totWays;

        // or we can also write the code as:
        // return pairing(n-1) + (n-1)*pairing(n-2);
    }

    public static void main(String args[]) {
        System.out.println(pairing(3));
    }
}
