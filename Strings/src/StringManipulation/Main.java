package StringManipulation;

/*
Program behavior:
- Prompts the user to enter a word (reads a full line of input).
- Prints the reversed version of the word.
- Reports whether the input is a palindrome.

Notes:
- Palindrome check ignores case and non-alphanumeric characters (e.g., "A man, a plan, a canal: Panama").
- Reverse function returns the exact character order reversed.
*/
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
