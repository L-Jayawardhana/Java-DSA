package StringManipulation;

public class StringManipulation {

    // Reverse a string
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    // Check palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "level";

        String reversed = reverseString(input);
        boolean palindrome = isPalindrome(input);

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is Palindrome   : " + palindrome);
    }
}
