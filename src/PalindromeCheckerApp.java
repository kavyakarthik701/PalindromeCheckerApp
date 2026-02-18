/**
 * ==========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 1: Hardcoded Palindrome Validation
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Store a predefined (hardcoded) string
        String input = "madam";

        // Step 2: Assume the string is a palindrome initially
        boolean isPalindrome = true;

        // Step 3: Loop only until half of the string length
        // Compare characters from both ends moving toward the center
        for (int i = 0; i < input.length() / 2; i++) {

            // Character from the beginning
            char startChar = input.charAt(i);

            // Corresponding character from the end
            char endChar = input.charAt(input.length() - 1 - i);

            // Step 4: Compare characters
            if (startChar != endChar) {
                isPalindrome = false;
                break;  // Exit early if mismatch is found
            }
        }

        // Step 5: Display output in required format
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}


