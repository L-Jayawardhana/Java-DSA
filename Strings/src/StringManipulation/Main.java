package StringManipulation;

public class Main {
    public static void main(String[] args) {

        String input = "level";

        String reversed = StringManipulation.reverseString(input);
        boolean palindrome = StringManipulation.isPalindrome(input);

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is Palindrome   : " + palindrome);
    }
}

