package StackUsingArray;

/**
 * StackArray - Implementation of Stack data structure using array
 * Stack follows LIFO (Last In First Out) principle
 * Elements are added and removed from the same end called "top"
 */
public class StackArray {

    // Array to store stack elements
    private int[] stack;

    // Index of the top element in stack (-1 means stack is empty)
    private int top;

    // Maximum capacity of the stack
    private int capacity;

    /**
     * Constructor to initialize stack with given capacity
     * @param capacity - maximum number of elements stack can hold
     */
    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity]; // Create array of given size
        top = -1; // Initialize top as -1 (empty stack)
    }

    /**
     * Push operation - adds element to the top of stack
     * Time Complexity: O(1)
     * @param value - element to be pushed onto stack
     */
    public void push(int value) {
        // Check for stack overflow condition
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        // Increment top and add element at that position
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    /**
     * Pop operation - removes and returns top element from stack
     * Time Complexity: O(1)
     * @return - the removed element, -1 if stack is empty
     */
    public int pop() {
        // Check for stack underflow condition
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        }
        // Get top element and decrement top pointer
        int popped = stack[top--];
        System.out.println("Popped: " + popped);
        return popped;
    }

    /**
     * Peek operation - returns top element without removing it
     * Time Complexity: O(1)
     * @return - top element of stack, -1 if stack is empty
     */
    public int peek() {
        // Check if stack is empty
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // Return top element without modifying stack
        return stack[top];
    }

    /**
     * Helper method to check if stack is empty
     * Time Complexity: O(1)
     * @return - true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == -1; // Stack is empty when top is -1
    }

    /**
     * Print method - displays all elements in stack from top to bottom
     * Time Complexity: O(n) where n is number of elements
     */
    public void print() {
        // Check if stack is empty
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack (top → bottom): ");
        // Traverse from top to bottom and print elements
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println(); // New line after printing all elements
    }
}