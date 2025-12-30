package SinglyLinkedList;

/**
 * SinglyLinkedList class implements a basic singly linked list data structure.
 * A singly linked list is a linear data structure where each element (node) contains
 * data and a reference to the next node in the sequence.
 *
 * Time Complexities:
 * - Insert at end: O(n) - must traverse to the end
 * - Delete: O(n) - may need to traverse entire list
 * - Search: O(n) - linear search through nodes
 * - Display: O(n) - must visit each node
 */
public class SinglyLinkedList {

    /**
     * Node class represents a single element in the linked list.
     * Each node contains:
     * - data: the integer value stored in this node
     * - next: reference to the next node in the list (null if this is the last node)
     */
    private static class Node {
        int data;      // Stores the actual value
        Node next;     // Reference to the next node in the list

        /**
         * Constructor to create a new node with given data
         * @param data the integer value to store in this node
         */
        Node(int data) {
            this.data = data;
            this.next = null;  // Initially, new node doesn't point to any other node
        }
    }

    private Node head; // Head pointer - references the first node in the list (null if list is empty)

    /**
     * Inserts a new value at the end of the linked list.
     *
     * Algorithm:
     * 1. Create a new node with the given value
     * 2. If list is empty (head is null), make the new node the head
     * 3. Otherwise, traverse to the last node and link it to the new node
     *
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(1)
     *
     * @param value the integer value to insert into the list
     */
    public void insert(int value) {
        // Create a new node with the provided value
        Node newNode = new Node(value);

        // Case 1: If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Case 2: Traverse to the end of the list
        Node temp = head;  // Start from the head node
        while (temp.next != null) {  // Keep moving until we reach the last node
            temp = temp.next;
        }
        // Link the last node to the new node
        temp.next = newNode;
    }

    /**
     * Deletes the first occurrence of a value from the linked list.
     *
     * Algorithm:
     * 1. Check if list is empty - if so, print error message
     * 2. Check if head node contains the value - if so, remove head
     * 3. Otherwise, traverse the list to find the node before the target
     * 4. Unlink the target node by updating the previous node's next reference
     *
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(1)
     *
     * @param value the integer value to delete from the list
     */
    public void delete(int value) {
        // Case 1: If list is empty, nothing to delete
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 2: If the value is in the head node, remove the head
        if (head.data == value) {
            head = head.next;  // Move head to the next node
            System.out.println("Deleted " + value);
            return;
        }

        // Case 3: Search for the value in the rest of the list
        Node temp = head;  // Start from head
        // Traverse until we find the node before the target or reach the end
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        // Check if value was found
        if (temp.next == null) {
            // Reached end of list without finding the value
            System.out.println("Value not found");
        } else {
            // Value found - remove it by unlinking
            // Skip over the node to be deleted
            temp.next = temp.next.next;
            System.out.println("Deleted " + value);
        }
    }

    /**
     * Searches for a value in the linked list.
     *
     * Algorithm:
     * 1. Start from the head node
     * 2. Traverse through each node comparing its data with the target value
     * 3. Return true if value is found, false if we reach the end without finding it
     *
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(1)
     *
     * @param value the integer value to search for
     * @return true if value exists in the list, false otherwise
     */
    public boolean search(int value) {
        Node temp = head;  // Start from the head node

        // Traverse through the entire list
        while (temp != null) {
            // Check if current node contains the target value
            if (temp.data == value) {
                return true;  // Value found
            }
            temp = temp.next;  // Move to next node
        }
        // Reached end of list without finding the value
        return false;
    }

    /**
     * Displays all elements in the linked list in order from head to tail.
     * Format: data1 -> data2 -> data3 -> null
     *
     * Algorithm:
     * 1. Check if list is empty - if so, print "List is empty"
     * 2. Start from head and traverse through each node
     * 3. Print each node's data followed by " -> "
     * 4. Print "null" at the end to indicate end of list
     *
     * Time Complexity: O(n) where n is the number of nodes
     * Space Complexity: O(1)
     */
    public void print() {
        // Case 1: If list is empty, inform the user
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 2: Traverse and print all nodes
        Node temp = head;  // Start from the head node
        while (temp != null) {
            // Print current node's data with arrow
            System.out.print(temp.data + " -> ");
            temp = temp.next;  // Move to next node
        }
        // Print null to indicate end of list
        System.out.println("null");
    }
}
