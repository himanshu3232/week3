import java.util.Arrays;

public class SelectionSortExamScores {
    // Method to perform Selection Sort on an array of exam scores
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum
            
            // Find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Array of exam scores to be sorted
        int[] examScores = {78, 92, 88, 67, 85, 90, 76};
        
        // Print original array
        System.out.println("Original Exam Scores: " + Arrays.toString(examScores));
        
        // Sort the array using Selection Sort
        selectionSort(examScores);
        
        // Print sorted array
        System.out.println("Sorted Exam Scores: " + Arrays.toString(examScores));
    }
}
