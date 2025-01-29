package Problem_3;

import java.util.Stack;

// Problem: For each day in a stock price array, calculate the span
public class StockSpan {

    public static void main(String[] args) {
        int[] arr = {300, 200, 100, 400, 400, 500, 300, 350}; // Stock prices
        int[] spans = calculateSpan(arr);

        // Print the spans
        System.out.print("Stock Prices: ");
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();

        System.out.print("Stock Spans : ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }

    // Function to calculate the span of stock prices
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];  // Array to store the span values
        Stack<Integer> stack = new Stack<>(); // Stack to store indices of prices

        // Iterate through each day's stock price
        for (int i = 0; i < n; i++) {
            // Remove all elements from stack that have lower price than current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span: If stack is empty, span is (i + 1), else (i - stack.peek())
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push the current index onto the stack
            stack.push(i);
        }

        return span;
    }
}
