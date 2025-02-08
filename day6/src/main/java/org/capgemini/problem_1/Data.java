package org.capgemini.problem_1;

import java.util.Objects;

//Data class to mock real data
public class Data{
    public Long id;
    public String name;

    public Data(Long id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Id is : " + id + " , Name is : " + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Data data = (Data) obj;
        return data.id.equals(this.id);
    }
}
