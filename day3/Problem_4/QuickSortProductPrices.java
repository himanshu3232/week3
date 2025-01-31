import java.util.Arrays;

public class QuickSortProductPrices {
    // Method to perform Quick Sort on an array of product prices
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(prices, low, high);
            
            // Recursively sort elements before and after the pivot
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Choosing the last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // Swap elements
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap pivot element to its correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        // Array of product prices to be sorted
        int[] productPrices = {500, 150, 700, 200, 400, 100};
        
        // Print original array
        System.out.println("Original Product Prices: " + Arrays.toString(productPrices));
        
        // Sort the array using Quick Sort
        quickSort(productPrices, 0, productPrices.length - 1);
        
        // Print sorted array
        System.out.println("Sorted Product Prices: " + Arrays.toString(productPrices));
    }
}
