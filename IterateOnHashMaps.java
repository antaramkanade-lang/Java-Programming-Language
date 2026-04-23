import java.util.*;

public class IterateOnHashMaps {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("China", 150);
        hm.put("India", 100);
        hm.put("us", 130);
        hm.put("Indonesia", 50);
        hm.put("japan", 180);
        // Iterate:
        // hm.entrySet():use to return whole pairs of key value instead of giving just
        // keys.
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key=" + k + ", value= " + hm.get(k));// if we don't use entrySet then we have to write for keys and values differently.
        }
    }
}
