package DynamicArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DynamicArray dynamicArray = new DynamicArray();
    
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
                    dynamicArray.print();
                    break;

                case 2:
                    System.out.println("========================================");
                    System.out.print("Current array: ");
                    dynamicArray.print();
                    System.out.println("\n========================================");
                    System.out.print("Enter element value: ");
                    int element = input.nextInt();

                    dynamicArray.add(element);
                    break;

                case 3:
                    System.out.print("Enter delete position: ");
                    int deletePos = input.nextInt();
                    dynamicArray.delete(deletePos);
                    break;

                case 4:
                    System.out.print("Enter value to search: ");
                    int value = input.nextInt();
                    int index = dynamicArray.get(value);
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
