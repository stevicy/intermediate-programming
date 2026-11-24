import java.util.Scanner;

class InvalidError extends Exception {
    public InvalidError(String message){
        super (message);
    }
}

public class stevenProbset2{

    static void inputNumbers() {
        int[] total = new int[5];
        int number = 0;

        Scanner io = new Scanner(System.in);

        while (number < 5) {
            try {
                System.out.print("\nEnter a number: ");
                String userInput = io.nextLine();
                int n = Integer.parseInt(userInput);
                total[number] = n;
                number++;

            

            } catch (NumberFormatException e) {
                try {
                    throw new InvalidError("Invalid input. Only integers are allowed.");
                } catch (InvalidError ex) {
                    System.out.println("Caught Error: " + ex.getMessage());
                }
            }
        }
        io.close();

        int sum = 0;
        for (int n : total) {
            sum += n;
        }

            System.out.println("\nTotal sum of all number input: " + sum);
    }
    public static void main(String[] args) {
      inputNumbers();
    }  
 }
