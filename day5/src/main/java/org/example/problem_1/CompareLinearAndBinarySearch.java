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
    Optional<Data> getDataByLinearSearch(Long id){
        for (Data datum : data) {
            if (datum.id.equals(id)) return Optional.of(datum);
        }

        return Optional.empty();
    }

    //Get Data By Binary Search
    Optional<Data> getDataByBinarySearch(Long id){

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
}

//Data class to mock real data
class Data{
    Long id;
    String name;

    Data(Long id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Id is : " + id + " , Name is : " + name;
    }
}
