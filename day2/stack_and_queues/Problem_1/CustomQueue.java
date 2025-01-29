import java.util.Stack;

// Implemented a Queue Using Two Stacks
public class CustomQueue<T> {

    // Stack1 for enqueue operations
    private final Stack<T> enqueue;
    // Stack2 for dequeue operations
    private final Stack<T> dequeue;

    // Constructor
    public CustomQueue() {
        this.enqueue = new Stack<>();
        this.dequeue = new Stack<>();
    }

    // Adds an element to the queue
    public void offer(T t) {
        enqueue.push(t);
    }

    // Returns the front element without removing it
    public T peek() {
        if (dequeue.isEmpty()) {
            if (enqueue.isEmpty()) return null;
            refillDequeue();
        }
        return dequeue.peek();
    }

    // Removes and returns the front element
    public T poll() {
        if (dequeue.isEmpty()) {
            if (enqueue.isEmpty()) return null;
            refillDequeue();
        }
        return dequeue.pop();
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return enqueue.isEmpty() && dequeue.isEmpty();
    }

    // Transfers elements from enqueueStack to dequeueStack
    private void refillDequeue() {
        while (!enqueue.isEmpty()) {
            dequeue.push(enqueue.pop());
        }
    }
}

// Main class for testing
class Main {
    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.poll()); // Output: 10
        System.out.println(queue.peek()); // Output: 20
        System.out.println(queue.poll()); // Output: 20
        System.out.println(queue.poll()); // Output: 30
        System.out.println(queue.isEmpty()); // Output: true
    }
}

