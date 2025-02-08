package org.capgemini.problem_2;

import org.capgemini.problem_1.Data;

public class Main {
    public static void main(String[] args) {

        //Mock a data array
        Data[] data = new Data[10_000];

        //Initialize array elements
        for (int i = 0; i < data.length; i++) {
            data[i] = new Data((long)i, "Name " + i);
        }

        //keep track of start time
        long startTime = System.nanoTime();

        //Use bubble sort
        CompareSortingAlgos.bubbleSort(data);

        //keep track of end time
        long endTime = System.nanoTime();

        System.out.println("Time taken by Bubble sort: " + (endTime - startTime));


        //keep track of start time
        startTime = System.nanoTime();

        //Use bubble sort
        CompareSortingAlgos.mergeSort(data, 0, data.length-1);

        //keep track of end time
        endTime = System.nanoTime();

        System.out.println("Time taken by Merge sort: " + (endTime - startTime));

        //keep track of start time
        startTime = System.nanoTime();

        //Use bubble sort
        CompareSortingAlgos.quickSort(data, 0, data.length-1);

        //keep track of end time
        endTime = System.nanoTime();

        System.out.println("Time taken by Quick sort: " + (endTime - startTime));
    }
}
