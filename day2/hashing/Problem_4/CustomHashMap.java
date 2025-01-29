package Problem_4;

class CustomHashMap {

    private static final int SIZE = 16;
    private final Node[] table;

    // Constructor
    public CustomHashMap() {
        table = new Node[SIZE];
    }

    // Hash function to determine bucket index
    private int hash(int key) {
        return Math.abs(key % SIZE);
    }

    // Insert or update key-value pair
    public void put(int key, int value) {
        int index = hash(key);

        Node currentNode = table[index];

        // Traverse the linked list at that index
        while (currentNode != null) {
            if (currentNode.key == key) {
                // Key found, update value
                currentNode.value = value;
                return;
            }
            currentNode = currentNode.next;
        }

        // Key not found, add new node to the linked list at that index
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    // Retrieve value by key
    public Integer get(int key) {
        int index = hash(key);
        Node currentNode = table[index];

        // Traverse the linked list at that index
        while (currentNode != null) {
            if (currentNode.key == key) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }

        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = hash(key);
        Node currentNode = table[index];
        Node prevNode = null;

        // Traverse the linked list at that index
        while (currentNode != null) {
            if (currentNode.key == key) {
                if (prevNode == null) {
                    // Key found at the head
                    table[index] = currentNode.next;
                } else {
                    // Key found, remove it from the list
                    prevNode.next = currentNode.next;
                }
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    // Helper class to represent a node in the linked list
    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        // Insert values
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);

        // Retrieve values
        System.out.println("Value for key 2: " + map.get(2)); // Output: 200

        // Update value
        map.put(2, 220);
        System.out.println("Updated value for key 2: " + map.get(2)); // Output: 220

        // Remove a key
        map.remove(2);
        System.out.println("Value for key 2 after removal: " + map.get(2)); // Output: null
    }
}

