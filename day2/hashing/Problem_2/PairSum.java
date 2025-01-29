package Problem_2;

import java.util.*;

public class PairSum {

    public static void hasPairSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int needed = target - num;

            if (set.contains(needed)) {
                System.out.println("Pair found: (" + needed + ", " + num + ")");
                return;
            }

            set.add(num);
        }

        System.out.println("No pair found.");
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        hasPairSum(arr, target);
    }
}
