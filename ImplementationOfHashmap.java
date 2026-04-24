import java.util.*;

public class ImplementationOfHashmap {
    // T.C=O(1).
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n: total no. of nodes
        private int N;
        // private int arr[]; this syntax is used here:
        private LinkedList<Node> buckets[]; // N: no. of buckets, here linkedList is stored in array.

        @SuppressWarnings("unchecked") // this is used because we have directly used linkedList in front of bucket so
                                       // java will not run and will give a warning, so to run the code we used this.
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; // new bucket of 4 indexes is created.
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();// new linked list formed to store values.
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode(); // hashCode converts a value into another form.
            return Math.abs(hc) % N; // Math.abs is an absolute value that converts -ve in +ve value.
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        // rehashing:
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // nodes= add in bucket:
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInLL(key, bi); // check if key already present.
            if (di != -1) { // if key already exists then update node.
                Node node = buckets[bi].get(di);
                node.value = value;
            } else { // if key doesn't exist and putting in 1st time then create new node.
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) { // 2.0 is a threshold value.
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInLL(key, bi); // check if key already present.
            if (di != -1) { // if key already exists:
                return true;
            } else { // if key doesn't exist:
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInLL(key, bi); // check if key already present.
            if (di != -1) { // if key already exists then update node.
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else { // if key doesn't exist and putting in 1st time then create new node.
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInLL(key, bi); // check if key already present.
            if (di != -1) { // if key already exists then update node.
                Node node = buckets[bi].get(di);
                return node.value;
            } else { // if key doesn't exist and putting in 1st time then create new node.
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0; // true
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("China", 150);
        hm.put("India", 100);
        hm.put("us", 130);
        hm.put("Indonesia", 50);
        hm.put("japan", 180);
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println(hm.get("India"));// get value of india.
        System.out.println(hm.remove("India"));// remove india
        System.out.println(hm.get("India"));// it will return null for india.
    }
}
