package StackUsingLinkedList;

/**
 * StackLinkedList class implements a stack data structure using a singly linked list.
 * The stack follows LIFO (Last In, First Out) principle.
 * Top of the stack is the head of the linked list for efficient push and pop operations.
 */
public class StackLinkedList {

    /**
     * Node class represents each element in the linked list.
     * Each node contains data and a reference to the next node.
     */
    private class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        /**
         * Constructor for Node.
         * @param data The integer value to store in the node.
         */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // Reference to the top (head) of the stack

    /**
     * Constructor for StackLinkedList.
     * Initializes an empty stack.
     */
    public StackLinkedList() {
        top = null;
    }

    /**
     * Push operation: Adds a new element to the top of the stack.
     * @param value The integer value to push onto the stack.
     */
    public void push(int value) {
        Node newNode = new Node(value); // Create a new node with the value
        newNode.next = top; // Link the new node to the current top
        top = newNode; // Update top to the new node
        System.out.println("Pushed: " + value);
    }

    /**
     * Pop operation: Removes and returns the top element from the stack.
     * @return The popped value, or -1 if the stack is empty.
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        }

        int popped = top.data; // Get the data from the top node
        top = top.next; // Move top to the next node
        System.out.println("Popped: " + popped);
        return popped;
    }

    /**
     * Peek operation: Returns the top element without removing it.
     * @return The top value, or -1 if the stack is empty.
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data; // Return the data of the top node
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Print operation: Displays all elements in the stack from top to bottom.
     */
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack (top → bottom): ");
        Node temp = top; // Start from the top
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // Move to the next node
        }
        System.out.println();
    }
}