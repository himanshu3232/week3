import java.util.Arrays;

public class InsertionSortEmployeeIDs {
    // Method to perform Insertion Sort on an array of employee IDs
    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;
        
        // Traverse from the second element to the last element
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i]; // Pick the current element
            int j = i - 1;
            
            // Shift elements that are greater than key to one position ahead
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j = j - 1;
            }
            
            // Insert the picked element at the correct position
            employeeIDs[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Array of employee IDs to be sorted
        int[] employeeIDs = {103, 201, 145, 98, 176, 120, 109};
        
        // Print original array
        System.out.println("Original Employee IDs: " + Arrays.toString(employeeIDs));
        
        // Sort the array using Insertion Sort
        insertionSort(employeeIDs);
        
        // Print sorted array
        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
    }
}
