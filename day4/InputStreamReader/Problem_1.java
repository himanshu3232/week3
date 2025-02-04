package InputStreamReader;

import java.io.*;

//InputStreamReader Problem 1: Convert Byte Stream to Character Stream Using InputStreamReader
public class Problem_1 {
    public static void main(String[] args) {
        String path = "";

        //Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.

        //Create a FileInputStream object to read the binary data from the file.
        try(FileInputStream fileInputStream = new FileInputStream(path);

            //Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            //Use a BufferedReader to read characters efficiently from the InputStreamReader.
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader))
        {
            //Read the file line by line and print the characters to the console.
            System.out.println(bufferedReader.readLine());

        }catch (IOException e){
            //Handle any encoding exceptions as needed.
            e.printStackTrace();
        }
    }
}








