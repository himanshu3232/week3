package org.capgemini.problem_4;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Compares file reader and input stream reader
public class CompareFileReaderAndInputStreamReader {
    //Path of the file
    private static final String path = "src/main/java/org/capgemini/problem_4/text.txt";

    public static void main(String[] args){
        //Try with resources
        try(FileReader fileReader = new FileReader(path)){

            //Keep startTime
            long startTime = System.nanoTime();

            while(fileReader.ready()){
                fileReader.read();
            }

            long endTime = System.nanoTime();

            //Print time taken
            System.out.println("Time taken by File reader: " + (endTime-startTime));

        }catch (IOException e){
            e.printStackTrace();
        }

        //Try with resources
        try(InputStreamReader fileReader = new InputStreamReader(new FileInputStream(path))){

            //Keep startTime
            long startTime = System.nanoTime();

            while(fileReader.ready()){
                fileReader.read();
            }

            long endTime = System.nanoTime();

            //Print time taken
            System.out.println("Time taken by Input stream reader: " + (endTime-startTime));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
