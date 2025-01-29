package Problem_1;

import java.util.*;

public class ZeroSumSubArrays {

    public static void findZeroSumSubArrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0; // collective sum

        // Add base case: Sum 0 at index -1
        map.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum was seen before, all subarrays from previous occurrences to 'i' sum to zero
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Zero-sum subarray: [" + (start + 1) + ", " + i + "]");
                }
            }

            // Store index of current collective sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {

        //Example array
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        System.out.println("Zero-Sum Subarrays:");
        findZeroSumSubArrays(arr);
    }
}
