package org.capgemini.problem_5;

public class Main {
    public static void main(String[] args) {
        int size = 40;

        long startTime = System.nanoTime();
        System.out.println(CompareFibonacciApproaches.iterativeApproach(size));
        long endTime = System.nanoTime();

        System.out.println("Time taken by Iterative Approach: " + (endTime-startTime));

        startTime = System.nanoTime();
        System.out.println(CompareFibonacciApproaches.recursiveApproach(size));
        endTime = System.nanoTime();

        System.out.println("Time taken by Recursive Approach: " + (endTime-startTime));
    }
}
