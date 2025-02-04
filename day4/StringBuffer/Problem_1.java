package StringBuffer;

import java.util.Scanner;

//StringBuffer Problem 1: Concatenate Strings Efficiently Using StringBuffer
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take string array size from the user
        System.out.print("Give array size: ");
        int size = sc.nextInt();

        //define the string array
        String[] strings = new String[size];

        //take inputs from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Give input string: ");
            strings[i] = sc.next();
        }

        //store the result
        String result = concatenateStrings(strings);

        System.out.println(result);

        sc.close();
    }

    static String concatenateStrings(String[] strings){
        StringBuffer stringBuffer = new StringBuffer();

        //iterate through strings and append
        for(String s : strings){
            stringBuffer.append(s);
        }

        //return as a string
        return stringBuffer.toString();
    }
}


