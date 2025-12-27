package StringManipulation;

// This program reads a word from the user, prints its reverse, and reports whether it is a palindrome.
public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        // Close the scanner to free system resources
        scanner.close();

        String reversed = StringManipulation.reverseString(input);
        boolean palindrome = StringManipulation.isPalindrome(input);

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is Palindrome   : " + palindrome);
    }
}
