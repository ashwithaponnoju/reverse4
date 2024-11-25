import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner to read the input string
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        // Call the reverseString method to reverse the input string
        String reversed = reverseString(input);
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to reverse the string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}

