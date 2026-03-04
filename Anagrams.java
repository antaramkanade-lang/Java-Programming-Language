import java.util.*;

//time complexity=O(n log n).
public class Anagrams {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = sc.next();
        System.out.println("Enter string 2: ");
        String str2 = sc.next();
        if (isAnagram(str1, str2)) {
            System.out.println("Strings are Anagrams.");
        } else {
            System.out.println("Strings are not Anagrams.");
        }
    }
}
