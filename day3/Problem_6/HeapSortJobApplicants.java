import java.util.Arrays;

public class HeapSortJobApplicants {
    // Method to perform Heap Sort on an array of salary demands
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (largest element) to the end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            
            // Call heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Method to heapify a subtree rooted at node i
    public static void heapify(int[] salaries, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // Check if right child is larger than largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;
            
            // Recursively heapify the affected subtree
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        // Array of salary demands to be sorted
        int[] salaryDemands = {45000, 60000, 35000, 50000, 70000, 40000};
        
        // Print original array
        System.out.println("Original Salary Demands: " + Arrays.toString(salaryDemands));
        
        // Sort the array using Heap Sort
        heapSort(salaryDemands);
        
        // Print sorted array
        System.out.println("Sorted Salary Demands: " + Arrays.toString(salaryDemands));
    }
}
