package JavaLearning.IRO4;

import java.util.Scanner;

class InvalidError extends Exception {
    public InvalidError(String message) {
        super(message);
    }
}

public class stevenProbset_2 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        
        int[] total = new int[5];
        int number = 0;

        while (number < 5) {
            System.out.print("\nEnter a number: ");
            try {
                if (io.hasNextInt()) {
                    int n = io.nextInt();
                    total[number] = n;
                    number++;
                } else {
                    io.next(); // consume invalid input
                    throw new InvalidError("Invalid input. Only integers are allowed.");
                }
            } catch (InvalidError e) {
                System.out.println("Caught Error: " + e.getMessage());
            }
        }

        int sum = 0;
        for (int i = 0; i < total.length; i++) {
            sum += total[i];
        }
        io.close();
        System.out.println("\nTotal sum of all number input: " + sum);
    }
}