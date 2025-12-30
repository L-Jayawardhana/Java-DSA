package SinglyLinkedList;

import java.util.Scanner;

/**
 * Singly Linked List Implementation with User Input
 * This program demonstrates a singly linked list data structure with interactive menu-driven operations.
 * Users can insert elements, delete elements, search for values, display the list, and exit the program.
 * Operations: Insert, Delete, Search, Display, Exit
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("=== Singly Linked List Operations ===");

        while (true) {
            // Display menu options to the user
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert a value");
            System.out.println("2. Delete a value");
            System.out.println("3. Search for a value");
            System.out.println("4. Display the list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Insert operation: Add a new element to the end of the list
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    list.insert(insertValue);
                    System.out.println("Value " + insertValue + " inserted successfully!");
                    break;

                case 2:
                    // Delete operation: Remove an element from the list
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    list.delete(deleteValue);
                    break;

                case 3:
                    // Search operation: Check if a value exists in the list
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();
                    if (list.search(searchValue)) {
                        System.out.println(searchValue + " found in the list!");
                    } else {
                        System.out.println(searchValue + " not found in the list.");
                    }
                    break;

                case 4:
                    // Display operation: Print all elements in the list
                    System.out.print("Current Linked List: ");
                    list.print();
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}
