package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//FileReader Problem 2: Count the Occurrence of a Word in a File Using FileReader
public class Problem_2 {
    public static void main(String[] args) {
        //Initialize a target string

        System.out.print("Give a target string: ");
        String targetString = new Scanner(System.in).next();
        StringBuilder sb = new StringBuilder();


        //path of the file
        String path = "C:/Users/himan/Desktop/week3/day4/FileReader/texts.txt";

        //Initialize the buffer reader using try with resources
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            while(bufferedReader.ready()) sb.append(bufferedReader.readLine()).append(' ');
        }catch(IOException e){
            e.printStackTrace();
        }

        //counts the frequency of the target string
        int count = countFrequency(sb.toString().trim(), targetString);

        System.out.println("Frequency of " + targetString + " is: " + count);
        System.out.println(sb);

    }

    static int countFrequency(String s, String target){

        //split the string into multiple strings if one or more space(s) are found
        String[] strings = s.split("\s+");
        int count = 0;

        for(String string : strings){
            if(string.startsWith(target) && string.length() == target.length()) count++;
            else if(string.startsWith(target) && string.length() > target.length()){

                if(string.charAt(target.length()) < 97 || string.charAt(target.length()) > 122) count++;
            }
        }

        return count;
    }
}



