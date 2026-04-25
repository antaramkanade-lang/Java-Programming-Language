import java.util.*;

public class IterateOnHashSets {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("indiia");
        cities.add("noida");
        cities.add("bengluru");
        cities.add("delhi");
        // a. Using Iterator:
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // b. Using Enhanced for loop:
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
