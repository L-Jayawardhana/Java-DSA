package CircularSinglyLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number. Please enter an integer.");
                sc.next(); // consume invalid token
            }
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n=== Circular Singly Linked List Menu ===");
            System.out.println("1. Insert at end");
            System.out.println("2. Insert at beginning");
            System.out.println("3. Delete by value");
            System.out.println("4. Search value");
            System.out.println("5. Print list");
            System.out.println("0. Exit");

            choice = readInt(sc, "Enter your choice: ");

            switch (choice) {
                case 1: {
                    int value = readInt(sc, "Enter value to insert (end): ");
                    list.insert(value);
                    break;
                }
                case 2: {
                    int value = readInt(sc, "Enter value to insert (beginning): ");
                    list.insertAtBeginning(value);
                    break;
                }
                case 3: {
                    int value = readInt(sc, "Enter value to delete: ");
                    list.delete(value);
                    break;
                }
                case 4: {
                    int value = readInt(sc, "Enter value to search: ");
                    System.out.println(list.search(value) ? "Found" : "Not Found");
                    break;
                }
                case 5:
                    list.print();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
