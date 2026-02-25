import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare input string
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare characters
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome){
            System.out.println("Its palindrome");
        }else{
            System.out.println("Its not palindrome");

        }
    }
}