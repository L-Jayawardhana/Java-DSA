package DoublyLinkedList;

import java.util.Scanner;

/**
 * Main class to demonstrate Doubly Linked List operations with an interactive menu
 *
 * Program Behavior:
 * - This program creates a doubly linked list data structure where each node contains
 *   a data value and two pointers (prev and next) to adjacent nodes
 * - Users can interact with the list through a menu-driven interface
 * - The program loops continuously until the user chooses to exit
 * - All operations are performed in real-time with immediate feedback
 */
public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object for reading user input from console
        Scanner scanner = new Scanner(System.in);

        // Create an empty doubly linked list instance
        DoublyLinkedList list = new DoublyLinkedList();

        // Variable to store user's menu choice
        int choice;

        // Display program header and description to inform user about functionality
        System.out.println("=== Doubly Linked List Program ===");
        System.out.println("This program demonstrates doubly linked list operations.");
        System.out.println("Each node has links to both next and previous nodes.\n");

        // Main program loop - continues executing until user selects exit option
        // Using do-while ensures menu is displayed at least once
        do {
            // Display menu options to user
            // Each option represents a different list operation
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert a value");
            System.out.println("2. Delete a value");
            System.out.println("3. Print list forward");
            System.out.println("4. Print list backward");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Read user's choice from input
            choice = scanner.nextInt();

            // Switch statement to execute appropriate operation based on user's choice
            switch (choice) {
                case 1:
                    // INSERT OPERATION
                    // Prompts user for a value and adds it to the end of the list
                    // New node becomes the tail with prev pointer to old tail
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    list.insert(insertValue);
                    System.out.println("Value " + insertValue + " inserted successfully!");
                    break;

                case 2:
                    // DELETE OPERATION
                    // Searches for the specified value and removes the first occurrence
                    // Updates prev and next pointers of adjacent nodes to maintain list integrity
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    list.delete(deleteValue);
                    break;

                case 3:
                    // PRINT FORWARD OPERATION
                    // Traverses the list from head to tail using next pointers
                    // Displays all node values in insertion order
                    list.printForward();
                    break;

                case 4:
                    // PRINT BACKWARD OPERATION
                    // Traverses the list from tail to head using prev pointers
                    // Demonstrates the bidirectional nature of doubly linked lists
                    list.printBackward();
                    break;

                case 5:
                    // EXIT OPERATION
                    // Terminates the program loop and closes resources
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    // ERROR HANDLING
                    // Catches invalid menu choices (numbers outside 1-5 range)
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

        } while (choice != 5); // Loop termination condition: continue until user enters 5

        // Close Scanner to prevent resource leak
        scanner.close();
    }
}
