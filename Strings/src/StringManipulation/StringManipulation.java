package StringManipulation;

public class StringManipulation {

    // Reverse a string using two-pointer technique. Returns null if input is null.
    public static String reverseString(String str) {
        if (str == null) return null;
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

    // Check if a string is a palindrome. Considers only alphanumeric characters and ignores case.
    // Returns false for null input; true for empty or single-character strings.
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) right--;
            char a = Character.toLowerCase(str.charAt(left));
            char b = Character.toLowerCase(str.charAt(right));
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
