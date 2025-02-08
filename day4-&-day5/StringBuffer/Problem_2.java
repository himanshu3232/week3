package StringBuffer;

import java.util.Arrays;

//StringBuffer Problem 2: Compare StringBuffer with StringBuilder for String Concatenation
public class Problem_2 {
    public static void main(String[] args) {
        //Initialize two StringBuffer and StringBuilder objects.
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        //array with a million elements
        String[] arr = new String[1000000];

        //fill the array
        Arrays.fill(arr, "abc");

        //store the results
        long timeTakenByStringBuffer = concatenateStringsAndCalculateTime(stringBuffer, arr);
        long timeTakenByStringBuilder = concatenateStringsAndCalculateTime(stringBuilder,arr);

        System.out.println("Time taken by string builder: " + timeTakenByStringBuilder);

        System.out.println("Time taken by string buffer: " + timeTakenByStringBuffer);


    }

    static long concatenateStringsAndCalculateTime(StringBuffer stringBuffer, String[] arr){

        //take start time
        long startTime = System.nanoTime();
        for(String s : arr){
            stringBuffer.append(s);
        }

        //take end time
        long endTime = System.nanoTime();

        //return the difference
        return Math.abs(startTime-endTime);
    }

    static long concatenateStringsAndCalculateTime(StringBuilder stringBuilder, String[] arr){

        //take start time
        long startTime = System.nanoTime();
        for(String s : arr){
            stringBuilder.append(s);
        }

        //take end time
        long endTime = System.nanoTime();

        //return the difference
        return Math.abs(startTime-endTime);
    }
}

