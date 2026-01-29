package StackUsingLinkedList;

public class StackLinkedList {

    // Node class
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // top of stack

    public StackLinkedList() {
        top = null;
    }

    // Push (insert at beginning)
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + value);
    }

    // Pop (remove from beginning)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        }

        int popped = top.data;
        top = top.next;
        System.out.println("Popped: " + popped);
        return popped;
    }

    // Peek (read top)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Print stack from top to bottom
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack (top → bottom): ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}