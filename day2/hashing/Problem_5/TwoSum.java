package Problem_5;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // Method to find the indices of the two numbers that add up to the target sum
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();  // Map to store number and its index

        for (int i = 0; i < nums.length; i++) {
            int num2 = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(num2)) {
                // Return the indices of the two numbers that add up to the target
                return new int[] { map.get(num2), i };
            }

            // If complement doesn't exist, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array (could also throw an exception if needed)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
