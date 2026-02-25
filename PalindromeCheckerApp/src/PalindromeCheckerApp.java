import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
        public static void main(String[] args) {

            String input = "noon"; // change if needed

            Stack<Character> stack = new Stack<>();

            // Push characters
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            boolean isPalindrome = true;

            // Compare
            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Exact output format
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }