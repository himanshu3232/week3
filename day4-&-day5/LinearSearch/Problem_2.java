package LinearSearch;

import java.util.*;

public class Problem_2 {

    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog",
                "Java programming is fun",
                "Linear search is simple but inefficient",
                "Data structures and algorithms are important"
        };

        String word = "Java";
        String result = searchSentenceContainingWord(sentences, word);
        System.out.println("Sentence containing '" + word + "': " + result);
    }

    // Method to search for the first sentence containing a specific word
    private static String searchSentenceContainingWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the first matching sentence
            }
        }
        return "Not Found"; // Return "Not Found" if no match is found
    }
}
