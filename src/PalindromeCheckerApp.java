/**
 * ===========================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";
        
        // Use the Stack-based strategy from UC12
        PalindromeStrategy strategy = new StackStrategy();
        
        // Capture execution start time in nanoseconds
        long startTime = System.nanoTime();
        
        // Execute the validation
        boolean isPalindrome = strategy.check(input);
        
        // Capture execution end time in nanoseconds
        long endTime = System.nanoTime();
        
        // Calculate total execution duration
        long executionTime = endTime - startTime;
        
        // Display benchmarking results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}

/**
 * Interface defining the contract for palindrome checking.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Implementation using a Stack to reverse and compare characters.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}