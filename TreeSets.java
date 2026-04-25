import java.util.TreeSet;

public class TreeSets {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("mumbai");
        ts.add("delhi");
        ts.add("noida");
        System.out.println(ts);
        // it gets printed in the sorted ascending order.
    }
}
