package ChallangeProblem;

import java.util.*;

public class Problem_1 {

    public static void main(String[] args) {
        int[] numbers = {3, 4, -1, 1};
        int firstMissing = findFirstMissingPositive(numbers);
        System.out.println("First missing positive integer: " + firstMissing);

        Arrays.sort(numbers);
        int target = 1;
        int targetIndex = binarySearch(numbers, target);
        System.out.println("Index of target " + target + ": " + targetIndex);
    }

    // Method to find the first missing positive integer using linear search
    private static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];

        for (int num : arr) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }

    // Method to find the index of a target number using binary search
    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
