import java.util.*;

public class Heaps {
    // Insert in heap:
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(log n)
            // add at the last index:
            arr.add(data);

            int x = arr.size() - 1; // x is index of child.
            int par = (x - 1) / 2; // its a parent index.
            while (arr.get(x) < arr.get(par)) {
                // swap: O(log n)
                int temp = arr.get(x); // Store child in temp.
                arr.set(x, arr.get(par)); // Store parent in child.
                arr.set(par, temp); // Store child in parent.

                x = par;
                par = (x - 1) / 2;
            }
        }

        // get min in heap:
        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if (minIdx != i) { // If we have another min index instead of i:
                // swap:
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // step 1:swap first and last node:
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2:delete last node:
            arr.remove(arr.size() - 1);

            // step 3: heapify:
            heapify(0); // index of i or root.
            return data;
        }

        // checks if heap is empty or not:
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {
        // It is also called heap sort- as it sorts the heap data.
        Heap h = new Heap();// here we can also use pq as priority queue instead of h.Both works same
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        } // we got output in ascending sorted form as we have to take minimum first.
          // If we want for max it we just give an o/p as in descending sorted form.
    }
}
