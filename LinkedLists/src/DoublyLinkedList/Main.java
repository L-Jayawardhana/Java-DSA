package DoublyLinkedList;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int choice;

        // Display program description
        System.out.println("=== Doubly Linked List Program ===");
        System.out.println("This program demonstrates doubly linked list operations.");
        System.out.println("Each node has links to both next and previous nodes.\n");

        // Main menu loop
        do {
            // Display menu options
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert a value");
            System.out.println("2. Delete a value");
            System.out.println("3. Print list forward");
            System.out.println("4. Print list backward");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            // Process user's choice
            switch (choice) {
                case 1:
                    // Insert operation
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    list.insert(insertValue);
                    System.out.println("Value " + insertValue + " inserted successfully!");
                    break;

                case 2:
                    // Delete operation
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    list.delete(deleteValue);
                    break;

                case 3:
                    // Print forward traversal
                    list.printForward();
                    break;

                case 4:
                    // Print backward traversal
                    list.printBackward();
                    break;

                case 5:
                    // Exit program
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

        } while (choice != 5); // Continue until user chooses to exit

        scanner.close();
    }
}
