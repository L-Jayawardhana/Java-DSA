package MaxSubArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the window size (k): ");
        int k = scanner.nextInt();

        int result = MaxSumSubarray.maxSum(arr, k);
        System.out.println("Maximum sum of subarray: " + result);

        scanner.close();
    }
}
