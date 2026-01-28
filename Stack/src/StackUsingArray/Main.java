package StackUsingArray;

public class Main {
    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();

        stack.pop();
        stack.print();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop(); // underflow case
    }
}