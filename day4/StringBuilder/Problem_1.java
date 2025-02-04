package StringBuilder;

//StringBuilder Problem 1: Reverse a String Using StringBuilder
public class Problem_1 {
    public static void main(String[] args) {
        //Create a string object
        String s = new String("hello");

        //store the returned string in a variable
        String reverse = reverseString(new StringBuilder(s));

        //show the output
        System.out.println(reverse);
    }

    //method that takes a stringbuilder, reverses it and returns a string
    static String reverseString(StringBuilder sb){

        //reverse and convert to string
        return sb.reverse().toString();
    }
}
