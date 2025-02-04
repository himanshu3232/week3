package InputStreamReader;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_2 {

    public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        compareFileReaderAndInputStreamReader("largefile.txt"); // Change the file path as needed
    }

    // Method to compare StringBuilder and StringBuffer performance
    private static void compareStringBuilderAndBuffer() {
        String text = "hello";
        int iterations = 1_000_000;

        // Using StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) / 1e6 + " ms");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) / 1e6 + " ms");
    }

    // Method to compare FileReader and InputStreamReader performance
    private static void compareFileReaderAndInputStreamReader(String filePath) {
        try {
            // Using FileReader
            long startTime = System.nanoTime();
            int wordCount1 = countWordsUsingFileReader(filePath);
            long endTime = System.nanoTime();
            System.out.println("Word count using FileReader: " + wordCount1);
            System.out.println("Time taken by FileReader: " + (endTime - startTime) / 1e6 + " ms");

            // Using InputStreamReader
            startTime = System.nanoTime();
            int wordCount2 = countWordsUsingInputStreamReader(filePath);
            endTime = System.nanoTime();
            System.out.println("Word count using InputStreamReader: " + wordCount2);
            System.out.println("Time taken by InputStreamReader: " + (endTime - startTime) / 1e6 + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to count words using FileReader
    private static int countWordsUsingFileReader(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            wordCount += tokenizer.countTokens();
        }
        br.close();
        return wordCount;
    }

    // Method to count words using InputStreamReader
    private static int countWordsUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        BufferedReader br = new BufferedReader(isr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            wordCount += tokenizer.countTokens();
        }
        br.close();
        return wordCount;
    }
}
