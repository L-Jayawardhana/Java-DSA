package MaxSubArray;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = MaxSumSubarray.maxSum(arr, k);
        System.out.println("Maximum sum of subarray: " + result);
    }
}
