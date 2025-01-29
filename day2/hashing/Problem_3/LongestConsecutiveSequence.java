package Problem_3;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {

        //Store values in a set for quick look-up
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        //result
        int longestStreak = 0;

        //Logic: if prev sequence exists better not to start from there
        //if the next num does not exist, streak ends there
        for (int num : set) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr));
    }
}
