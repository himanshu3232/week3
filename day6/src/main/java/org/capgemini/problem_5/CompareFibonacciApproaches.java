package org.capgemini.problem_5;

//Compares iterative and recursive approaches
public class CompareFibonacciApproaches {

    //recursive approach
    public static int recursiveApproach(int n) throws IllegalArgumentException{

        //Throw exception if argument is negative
        if(n < 0) throw new IllegalArgumentException("Negative numbers not allowed");

        if(n == 0 || n == 1) return n;

        return recursiveApproach(n-1) + recursiveApproach(n-2);
    }

    //Iterative approach
    public static int iterativeApproach(int n) throws IllegalArgumentException{
        if(n < 0) throw new IllegalArgumentException("Negative numbers not allowed");

        if(n == 0 || n == 1) return n;

        int result = 1;
        int prev = 1;
        int prev_prev = 0;
        n --;


        while(n > 0){

            //since curr = prev + prev_of_prev
            result = prev_prev + prev;
            prev_prev = prev;
            prev = result;
            n--;
        }

        return result;
    }
}
