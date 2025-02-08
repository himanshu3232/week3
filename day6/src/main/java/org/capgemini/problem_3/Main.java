package org.capgemini.problem_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Initialize String array
        String[] strings = new String[1_000_000];
        Arrays.fill(strings, "abc->");

        //Keep track of start time
        long startTime = System.nanoTime();

        //Result using string class
        String resultUsingString = CompareStringClasses.concatStringsUsingString(strings);

        //Keep track of end time
        long endTime = System.nanoTime();


        //Show difference
        System.out.println("Time taken by String : " + (endTime-startTime));

        //Keep track of start time
        startTime = System.nanoTime();

        //Result using string class
        String resultUsingStringBuilder = CompareStringClasses.concatStringsUsingStringBuilder(strings);

        //Keep track of end time
        endTime = System.nanoTime();


        //Show difference
        System.out.println("Time taken by StringBuilder : " + (endTime-startTime));


        //Keep track of start time
        startTime = System.nanoTime();

        //Result using string class
        String resultUsingStringBuffer = CompareStringClasses.concatStringsUsingStringBuffer(strings);

        //Keep track of end time
        endTime = System.nanoTime();


        //Show difference
        System.out.println("Time taken by StringBuffer : " + (endTime-startTime));

    }
}
