import java.util.*;
import java.util.Arrays; //this is used due to sort was getting a red underline.
//here time complexity is O(n log n).
//without using sorting we will get T.C=O(n).

public class ActivitySelectionWithGreedyApproach {
    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 }; // here end is sorted.

        // But if end is not sorted then use 2D Array:
        int activities[][] = new int[start.length][3]; // here 3 is used due to we want 3 columns.
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // for index.
            activities[i][1] = start[i]; // for start elements.
            activities[i][2] = end[i]; // for end elements.
        }
        // lambda function- short form for comparator,2D array sorting by comparator.
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // here 2 is used because we want to sort end.

        // end time basis sorted:
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity- we should take,has short time covered.We take more activities:
        maxAct = 1;
        ans.add(activities[0][0]); // for index.
        int lastEnd = activities[0][2]; // for end.
        for (int i = 0; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity select:
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("maximum activities: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
