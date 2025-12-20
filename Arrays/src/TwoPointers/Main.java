package TwoPointers;

import java.util.Scanner;

/**
 * Two Sum Problem (Sorted Array) - Two Pointer Technique
 *
 * Problem: Given a sorted array and a target sum, find if there exists
 * a pair of elements that add up to the target.
 *
 * Approach: Two Pointer Technique
 * - Use two pointers: one at the start (left) and one at the end (right)
 * - If sum of elements at both pointers equals target, pair found
 * - If sum is less than target, move left pointer forward (to increase sum)
 * - If sum is greater than target, move right pointer backward (to decrease sum)
 *
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - No extra space used
 *
 * Note: This technique only works on SORTED arrays
 */
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
