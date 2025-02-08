package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//FileReader Problem 1: Read a File Line by Line Using FileReader
public class Problem_1 {
    public static void main(String[] args) {
        //specify path of the text file
        String path = new Scanner(System.in).next();

        //try with resources
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){

            //check if the reader can continue reading the file
            while(reader.ready())
                System.out.println(reader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

