package org.capgemini.problem_6;

import org.capgemini.problem_1.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Compares array, hashSet and TreeSet performance
public class CompareArrayHashSetAndTreeSet {

    //Declare and initialize data structures
    private static final Data[] data = new Data[10_000];
    private static final Set<Data> hashSet = new HashSet<>();
    private static final Set<Data> treeSet = new TreeSet<>((a,b) -> (int)(a.id - b.id));

    //Input data using static block
    static {
        for (int i = 0; i < data.length; i++) {
            data[i] = new Data((long)i, "Name is " + i);
            hashSet.add(data[i]);
            treeSet.add(data[i]);
        }
    }

    //main method
    public static void main(String[] args) {

        //Mock required data
        Data requiredData = new Data(5000L, "Name is " + 5000);

        //Search using array
        long startTime = System.nanoTime();
        System.out.println(searchUsingArray(requiredData));
        long endTime = System.nanoTime();

        //Show difference
        System.out.println("Time taken by array: " + (endTime-startTime));

        //Search using TreeSet
        startTime = System.nanoTime();
        System.out.println(searchUsingHashSet(requiredData));
        endTime = System.nanoTime();

        //Show difference
        System.out.println("Time taken by hash set: " + (endTime-startTime));


        //Search using HashSet
        startTime = System.nanoTime();
        System.out.println(searchUsingTreeSet(requiredData));
        endTime = System.nanoTime();

        //Show difference
        System.out.println("Time taken by tree set: " + (endTime-startTime));


    }

    public static boolean searchUsingArray(Data requiredData){

        //iterate through array
        for(Data data : CompareArrayHashSetAndTreeSet.data){
            if(requiredData.id.equals(data.id)) return true;
        }

        return false;
    }

    public static boolean searchUsingTreeSet(Data requiredData){
        return CompareArrayHashSetAndTreeSet.treeSet.contains(requiredData);
    }

    public static boolean searchUsingHashSet(Data requiredData){
        return CompareArrayHashSetAndTreeSet.hashSet.contains(requiredData);
    }
}
