import java.util.TreeMap;

public class TreeMaps {
    public static void main(String args[]) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("China", 150);
        tm.put("India", 100);
        tm.put("us", 130);
        tm.put("Indonesia", 50);
        tm.put("japan", 180);
        System.out.println(tm);
        // The o/p will be in sorted form according to keys, sorted by letters.
    }
}
