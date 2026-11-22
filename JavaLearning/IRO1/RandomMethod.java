import java.lang.Math;  //The Math.random() method is often used for generating random values in Java.

public class RandomMethod {
	public static void main(String[] args) {
	    
	    //Example To show the working of java.lang.Math.random() method.: 
	    // Generate a random number between 0.0 and 1.0
        double randomNumber = Math.random();
        
        // Print the generated random number and the Output is different everytime this code is executed
        System.out.println("Generated Random Number: " + randomNumber);
        
        System.out.println();
        int lowerLimit = 5;      // minimum number in range
        int upperLimit = 15;     // maximum number in range
        int totalNumbers = upperLimit - lowerLimit + 1;  // size of the range

        // Generate and print 10 random numbers in the range 5 to 15
        for (int count = 0; count < 10; count++) {
            // Generate random number and shift by lowerLimit
            int randomValue = (int)(Math.random() * totalNumbers) + lowerLimit;
            System.out.println(randomValue);
        }
        
    }
}
        	
	