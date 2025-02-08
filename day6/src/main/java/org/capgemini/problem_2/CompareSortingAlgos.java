package org.capgemini.problem_2;


import org.capgemini.problem_1.Data;

//Compares sorting algorithms Bubble Sort (O(N²)),
// Merge Sort (O(N log N)), and Quick Sort (O(N log N)).
public class CompareSortingAlgos {


    //Bubble sort
    public static void bubbleSort(Data[] datas){
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas.length; j++) {

                //if lower index value is greater than higher index value then swap
                if(datas[i].id > datas[j].id){
                    swap(datas, i, j);
                }
            }
        }
    }

    //Merge sort
    public static void mergeSort(Data[] arr, int left, int right) {

        //Divide the array
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            //Merge sorted arrays
            merge(arr, left, mid, right);
        }
    }

    //Merges two sorted arrays
    private static void merge(Data[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Data[] leftArray = new Data[n1];
        Data[] rightArray = new Data[n2];

        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].id <= rightArray[j].id) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    //Quick sort
    public static void quickSort(Data[] arr, int low, int high) {

        //Divide array
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(Data[] arr, int low, int high) {
        Data pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].id <= pivot.id) { // Compare based on id
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); // Move pivot to correct position
        return i + 1;
    }

    //Swapping
    private static void swap(Data[] arr, int i, int j) {
        Data temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
