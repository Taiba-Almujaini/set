import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        // Check if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return true; 
        }

        // Check if the string is a palindrome by comparing characters from start and end
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false; // If characters don't match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }
}
