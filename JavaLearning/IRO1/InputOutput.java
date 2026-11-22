import java.util.Scanner;  //We use the Scanner class when we want to get input from the user — like typing something into the keyboard while the program is running.

public class InputOutput { //Here is the file name 'Main'
	public static void main(String[] args) {  //Here is the starting point or execution in Java programming.
	    
	    Scanner io = new Scanner(System.in);  //Creating an object of Scanner and the name is 'io'

	    
	    //Here we used the println() method to display the string.
		System.out.println("The Java programming is too difficult for me.");
		System.out.println("Hi, I am Steven.");
        System.out.println("Still trying to learn more in Java programming.");
        
        //Example Printing Variables and Literals:
	    Double number = 25.75;
        System.out.println(5);  // Print a simple number which is '5'
        System.out.println(number);  // Print the value of the variable 'number'
        
        //Example Print Concatenated Strings:
        Double temperature = 36.8;  // Declare a Double variable with a new value
        System.out.println("Today feels " + "great!");  // Print a new message or string
        System.out.println("Current temperature = " + temperature);   // Print string and the value of variable name is  'temperature'
        
        //Example Getting Integer Input From the User: 
        System.out.print("Enter an integer number: "); //here is asking the user to input a integer number using his keyboard.
        int number1 = io.nextInt();                    //take input from the user and put it to variable name is 'number1' 
        System.out.println("You entered " + number1); //here is to display a string and the value of 'number1

        //Example Getting float, double and String Input:
        System.out.print("Enter your weight (float): "); //here is asking the user to input a float using his keyboard.
        float weight = io.nextFloat();                   //take input from the user and put it to variable name is 'weight'
        System.out.println("Weight entered = " + weight); //here is to display a string and the value of 'weight'
  
        System.out.print("Enter the price (double): ");  //here is asking the user to input a double using his keyboard
        double price = io.nextDouble();                  //take input from the user and put it to variable name is 'price'
        System.out.println("Price entered = " + price);  //here is to display a string and the value of 'price'

        // Getting String input
        System.out.print("Enter your city: ");          //here is asking the user to input a string using his keyboard 
        String city = io.next();                        //take input from the user and put it to variable name is 'city'
        System.out.println("City entered = " + city);   //here is to display a string and the value of 'city'

       // closing the scanner object
        io.close();
		
	}
}