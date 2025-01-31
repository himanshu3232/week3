import java.util.Arrays;

public class BubbleSortMarks {
    // Method to perform Bubble Sort on an array of student marks
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        
        // Outer loop to traverse through the entire array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop to compare adjacent elements and swap if needed
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true; // Mark swap as true
                }
            }
            
            // If no elements were swapped in the inner loop, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Array of student marks to be sorted
        int[] studentMarks = {85, 67, 95, 42, 76, 88, 53};
        
        // Print original array
        System.out.println("Original Marks: " + Arrays.toString(studentMarks));
        
        // Sort the array using Bubble Sort
        bubbleSort(studentMarks);
        
        // Print sorted array
        System.out.println("Sorted Marks: " + Arrays.toString(studentMarks));
    }
}
