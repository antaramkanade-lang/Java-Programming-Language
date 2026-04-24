import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("China", 150);
        lhm.put("India", 100);
        lhm.put("us", 130);
        lhm.put("Indonesia", 50);
        lhm.put("japan", 180);
        System.out.println(lhm);
        // It will give o/p in the same order as i/p is given.
    }
}
