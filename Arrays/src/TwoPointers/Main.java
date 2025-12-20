package TwoPointers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 4, 6, 8, 9};

        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        if (TwoSumSorted.twoSum(arr, target)) {
            System.out.println("Pair exists");
        } else {
            System.out.println("Pair does not exist");
        }

        scanner.close();
    }
}
