import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String args[]) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("pune");
        lhs.add("mumbai");
        System.out.println(lhs); // it will be printed in the same order as i/p's order.
        lhs.remove("delhi");
        System.out.println(lhs);
    }
}
