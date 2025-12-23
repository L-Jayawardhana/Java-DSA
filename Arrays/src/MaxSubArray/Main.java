package MaxSubArray;

import java.util.Scanner;

/**
 * Maximum Sum Subarray Problem - Sliding Window Technique
 *
 * This program finds the maximum sum of a contiguous subarray of size 'k'.
 *
 * Algorithm: Sliding Window
 * - Instead of recalculating the sum for each window from scratch,
 *   we slide the window by subtracting the element going out and
 *   adding the element coming in.
 *
 * Time Complexity: O(n) - We traverse the array only once
 * Space Complexity: O(1) - Only a few variables are used
 *
 * Example:
 *   Array: [2, 1, 5, 1, 3, 2], Window size (k): 3
 *   Windows: [2,1,5]=8, [1,5,1]=7, [5,1,3]=9, [1,3,2]=6
 *   Maximum Sum: 9
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Read array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get window size
        System.out.print("Enter the window size (k): ");
        int k = scanner.nextInt();

        // Calculate and display the result
        int result = MaxSumSubarray.maxSum(arr, k);
        System.out.println("Maximum sum of subarray: " + result);

        scanner.close();
    }
}
