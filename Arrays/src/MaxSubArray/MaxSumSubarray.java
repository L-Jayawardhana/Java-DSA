package MaxSubArray;

public class MaxSumSubarray {
    public static int maxSum(int[] arr, int k) {

        if (arr.length < k) {
            System.out.println("Invalid window size");
            return -1;
        }

        int windowSum = 0;
        int maxSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
