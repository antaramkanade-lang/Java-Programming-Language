import java.util.*;

public class CheckListIsPalindrome {
    public static boolean isPalindrome(LinkedList<Character> list) {
        // using built in Linked list to solve this problem:
        ArrayList<Character> arr = new ArrayList<>(list);
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            if (!arr.get(left).equals(arr.get(right))) {
                return false;
            }
            // update:
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('B');
        list.add('A');
        System.out.println(isPalindrome(list));
    }
}
