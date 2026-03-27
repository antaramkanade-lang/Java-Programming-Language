import java.util.*;

//Time complexity=O(n)
public class FindMaxElement {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        // or we can also write in single line:
        // max=Math.max(max,list.get(i));
        System.out.println("maximum element is: " + max);
    }
}
