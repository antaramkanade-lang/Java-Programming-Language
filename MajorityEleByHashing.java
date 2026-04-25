import java.util.*;

//print the element which appears more than n/3 times.
public class MajorityEleByHashing {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 }; // 1 appeared more than n/3 times in arr.
        HashMap<Integer, Integer> map = new HashMap<>();// Both num and freq are of Integer type.
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            // we can do this above process in one line: after for loop add this:
            // map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            // getOrDefault gives a default value if key doesn't exits otherwise returns
            // key's freq and update it. Here default value is 0, we can set that value.
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}
