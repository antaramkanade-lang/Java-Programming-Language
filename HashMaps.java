import java.util.HashMap;

public class HashMaps {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        // insert:used to store key value pairs- O(1):
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        System.out.println(hm); // It wil give o/p in an unordered form.

        // get: O(1):
        int population = hm.get("India"); // it will give a value for this key i.e 100
        System.out.println(population);
        // if we try to get a value that is not stored the it will return null:
        System.out.println(hm.get("Indonesia"));

        // containsKey:used to check if key is present or not:O(1):
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Indonesia")); // false

        // remove:O(1):
        System.out.println(hm.remove("china"));// it will return its value first
        System.out.println(hm);// and then print the hashMap by removing it.

        // size:
        System.out.println(hm.size());// size is 2 after removing china

        // is Empty():used to check if hashMap is empty or not:
        // hm.clear(); -used to clear the whole hashMap
        System.out.println(hm.isEmpty());
    }
}
