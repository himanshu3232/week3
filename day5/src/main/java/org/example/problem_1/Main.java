package org.example.problem_1;

import java.util.Arrays;
import java.util.Optional;

//Main class
public class Main {
    //Main method
    public static void main(String[] args) {

        //make object
        CompareLinearAndBinarySearch compareLinearAndBinarySearch = new CompareLinearAndBinarySearch();

        //start time to check performance
        long startTime = System.nanoTime();

        //Linear search of data object using unique id
        Optional<CompareLinearAndBinarySearch.Data> resultantData = compareLinearAndBinarySearch
                .getDataByLinearSearch(5_00_000L);

        //end time to check performance
        long endTime = System.nanoTime();

        //print resultant data
        System.out.println(resultantData.orElse(null));
        System.out.println("Time taken to calculate using linear search : " + (endTime-startTime));

        //Sort data array for binary search
        Arrays.sort(compareLinearAndBinarySearch.data, (a,b) -> (int)(a.id - b.id));

        //start time to check performance
        startTime = System.nanoTime();

        //Binary search of data object using unique id
        CompareLinearAndBinarySearch.Data resultantData2 = compareLinearAndBinarySearch
                .getDataByBinarySearch(5_00_000L).orElse(null);

        //end time to check performance
        endTime = System.nanoTime();

        //print resultant data
        System.out.println(resultantData2);
        System.out.println("Time taken to calculate using binary search : " + (endTime-startTime));
    }
}
