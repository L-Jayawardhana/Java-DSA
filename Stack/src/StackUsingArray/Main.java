package StackUsingArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a stack with capacity of 5 elements
        StackArray stack = new StackArray(5);

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        int choice; // Variable to store user's menu choice

        // Do-while loop: executes at least once, then continues while condition is true
        do {
            // Display menu options to the user
            System.out.println("\n--- Stack Operations Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Read user's choice
            choice = scanner.nextInt();

            // Switch statement to execute different operations based on user choice
            switch (choice) {
                case 1: // Push operation - add element to stack
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2: // Pop operation - remove top element from stack
                    stack.pop();
                    break;
                case 3: // Peek operation - view top element without removing it
                    System.out.println("Top element: " + stack.peek());
                    break;
                case 4: // Print operation - display all stack elements
                    stack.print();
                    break;
                case 5: // Exit option
                    System.out.println("Exiting...");
                    break;
                default: // Handle invalid menu choices
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5); // Loop continues until user chooses option 5 (Exit)

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}