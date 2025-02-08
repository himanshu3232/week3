package org.capgemini.problem_1;

//Data class to mock real data
public class Data{
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
