public class TernaryOperator {
	public static void main(String[] args) {
	    
	    //Example 1: This example, demonstrates how to find the largest of two numbers using ternary operator.:
	    // Declare and initialize two integers
        int firstNumber = 8;
        int secondNumber = 14;

        // Display the numbers
        System.out.println("Number A: " + firstNumber);
        System.out.println("Number B: " + secondNumber);

        // Use ternary operator to find the larger value
        int largerValue = (firstNumber > secondNumber) ? firstNumber : secondNumber;

        // Output the result
        System.out.println("Greater value is: " + largerValue);
        
        
        //Example 2: This example demonstrates how to perform arithmetic operations based on the conditions using ternary operator.:
        System.out.println();
         // Declare two numbers
        int valueA = 7;
        int valueB = 12;
        int result;

        // Display the numbers
        System.out.println("Value A: " + valueA);
        System.out.println("Value B: " + valueB);

        // Use ternary operator to decide operation
        result = (valueA > valueB) ? (valueA + valueB) : (valueA - valueB);

        // Display the result
        System.out.println("Computed Result: " + result);
        
        
        //Example 3: This example demonstrates how to use ternary operator to assign a value based on a boolean condition.:
        System.out.println();
        // Boolean flag to represent user login status
        boolean isLoggedIn = false;

        // Use ternary operator to assign message
        String statusMessage = isLoggedIn ? "Access Granted" : "Access Denied";

        // Print the result
        System.out.println("Login Status: " + statusMessage);
        
        
    }
}