package StackUsingLinkedList;

// Import Scanner for user input
import java.util.Scanner;

/**
 * Main class to demonstrate the StackLinkedList functionality.
 * Provides a menu-driven interface for stack operations.
 */
public class Main {
    /**
     * Main method: Entry point of the program.
     * Uses a do-while loop to repeatedly display a menu and perform stack operations based on user input.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a new stack instance
        StackLinkedList stack = new StackLinkedList();
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Do-while loop to keep the menu running until user chooses to exit
        do {
            // Display menu options
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            // Read user's choice
            choice = scanner.nextInt();

            // Switch statement to handle different menu options
            switch (choice) {
                case 1:
                    // Push operation: Prompt for value and push to stack
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    // Pop operation: Remove top element from stack
                    stack.pop();
                    break;
                case 3:
                    // Peek operation: Display top element without removing it
                    int top = stack.peek();
                    if (top != -1) {
                        System.out.println("Top element: " + top);
                    }
                    break;
                case 4:
                    // Print operation: Display all elements in the stack
                    stack.print();
                    break;
                case 5:
                    // Exit: Display exit message
                    System.out.println("Exiting...");
                    break;
                default:
                    // Invalid choice: Handle invalid inputs
                    System.out.println("Invalid choice");
            }
        } while (choice != 5); // Continue loop until user chooses to exit

        // Close the scanner to free resources
        scanner.close();
    }
}