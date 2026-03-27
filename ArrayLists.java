import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        // add element: make an arrayList using adding elements in it.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // check the size of array:
        System.out.println(list.size());
        // size is also use to print elements using loops:
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");// get is used to get elements of arraylist.
        }
        System.out.println();

        // we can also add an element in between of array:
        list.add(1, 15);
        System.out.println(list);

        // get element: if we want to find any element.
        int ele = list.get(2);
        System.out.println(ele);

        // remove or delete element:
        list.remove(3); // here element 4 is removed as it was at index 3.
        System.out.println(list);

        // set element at index:replace an element by another present at any index.
        list.set(2, 10); // here 3 was on index 2 which is replaced by 10 now.
        System.out.println(list);

        // contains element: give true or false check if the element is present or not.
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
