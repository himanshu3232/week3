package StringBuilder;

import java.util.*;

//StringBuilder Problem 2: Remove Duplicates from a String Using StringBuilder
public class Problem_2 {
    public static void main(String[] args) {

        //Take input from user and store it
        System.out.print("Give input string: ");
        String s = new Scanner(System.in).next();

        //store result and print it
        String result = removeDuplicates(s);
        System.out.println(result);
    }

    static String removeDuplicates(String s){

        //Initialize a set and a stringbuilder
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        //iterate over the char array
        for(char c : s.toCharArray()){
            if(!set.contains(c)) sb.append(c);
            set.add(c);
        }

        //convert stringbuilder to string
        return sb.toString();
    }
}


