import java.util.*;

public class MonotonicArrayList {
    public static boolean checkMonotonic(ArrayList<Integer> list) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                decreasing = false;
            }
            if (list.get(i) < list.get(i - 1)) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(checkMonotonic(list));
    }
}