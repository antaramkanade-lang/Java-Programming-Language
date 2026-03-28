import java.util.*;

//Optimized= 2 pointer approach=O(n).
public class AdvancedPairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1; // pivot or breaking point.
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i = 1)) { // for breaking point.
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            // case 1:
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2:
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
                // case 3:
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list, 5));
    }
}
