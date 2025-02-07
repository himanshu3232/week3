package org.example.problem_1;


import java.util.Optional;

//compares linear and binary search
public class CompareLinearAndBinarySearch {

    //array of data
    final Data[] data;

    //Constructor
    public CompareLinearAndBinarySearch(){
        data = new Data[1_000_000];

        //initialize data elements
        for (int i = 0; i < data.length; i++) {
            data[i] = new Data((long)i, "Data " + i);
        }
    }
    //Get Data By Linear Search
    public Optional<Data> getDataByLinearSearch(Long id) throws IllegalArgumentException{

        if(id < 0) throw new IllegalArgumentException("Id is negative");

        for (Data datum : data) {
            if (datum.id.equals(id)) return Optional.of(datum);
        }

        return Optional.empty();
    }

    //Get Data By Binary Search
    public Optional<Data> getDataByBinarySearch(Long id) throws IllegalArgumentException{

        if(id < 0 || id >= Integer.MAX_VALUE) throw new IllegalArgumentException("Id is not acceptable");

        int startIndex = 0;
        int endIndex = data.length-1;

        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex-startIndex)/2;
            if(data[mid].id.equals(id)) return Optional.of(data[mid]);
            else if(data[mid].id > id) endIndex = mid-1;
            else startIndex = mid+1;
        }

        return Optional.empty();
    }


    //Data class to mock real data
    public static class Data{
        public Long id;
        public String name;

        Data(Long id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString(){
            return "Id is : " + id + " , Name is : " + name;
        }
    }

}
