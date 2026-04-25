import java.util.HashSet;

public class HashSets {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);
        // o/p:[1,2,4] it will not take last 2 and 1 as they are duplicates.
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        if (set.contains(2)) {
            System.out.println("2 is in set");
        }
        if (set.contains(3)) { // this will not be printed as it is not in set.
            System.out.println("3 is in set");
        }
    }
}
