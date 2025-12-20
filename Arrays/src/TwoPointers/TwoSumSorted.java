package TwoPointers;

public class TwoSumSorted {
    public static boolean twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                return true;
            } else if (sum < target) {
                left++;   // move left pointer forward
            } else {
                right--;  // move right pointer backward
            }
        }
        return false;
    }
}

