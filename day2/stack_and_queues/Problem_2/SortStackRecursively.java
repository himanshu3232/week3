import java.util.Stack;

// Sort a stack recursively
public class SortStackRecursively {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        // Sort the stack
        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }

    // Function to recursively sort the stack
    private static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int element = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, element);
        }
    }

    // Helper function to insert element in a sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int topElement = stack.pop();
        insertInSortedOrder(stack, element); // Pass 'element', not 'topElement'
        stack.push(topElement);
    }
}
