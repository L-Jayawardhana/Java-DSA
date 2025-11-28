package SimpleArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int x = input.nextInt();
        ArrayOperations arrayOperations = new ArrayOperations(x);

        boolean y = true;

        do {
            System.out.println("\n1. Print Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Search Element");
            System.out.println("5. Exit Program");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    arrayOperations.print();
                    break;

                case 2:
                    System.out.println("========================================");
                    System.out.print("Current array: ");
                    arrayOperations.print();
                    System.out.println("\n========================================");
                    System.out.print("Enter element value: ");
                    int element = input.nextInt();

                    System.out.print("Enter position (0 to " + arrayOperations.n + "): ");
                    int position = input.nextInt();

                    arrayOperations.insert(element, position);
                    break;

                case 3:
                    System.out.print("Enter delete position: ");
                    int deletePos = input.nextInt();
                    arrayOperations.delete(deletePos);
                    break;

                case 4:
                    System.out.print("Enter value to search: ");
                    int value = input.nextInt();
                    int index = arrayOperations.search(value);
                    if (index == -1)
                        System.out.println("Value not found.");
                    else
                        System.out.println("Value found at index " + index);
                    break;

                case 5:
                    System.out.println("Exiting...!");
                    y = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try between 1 and 5.");
            }
        } while (y);
    }
}
