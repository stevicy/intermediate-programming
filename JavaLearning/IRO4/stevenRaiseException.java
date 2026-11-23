package JavaLearning.IRO4;

public class stevenRaiseException {
    public static void main(String[] args) {

        System.out.println("=== RAISING EXCEPTIONS IN JAVA ===\n");

        // Example 1: Simple throw
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an error: " + e.getMessage() + "\n");
        }

        // Example 2: Throw with zero
        try {
            int number = 0;
            if (number == 0) {
                throw new ArithmeticException("Number cannot be zero here.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught an error: " + e.getMessage() + "\n");
        }

        // Example 3: Loop with throw
        for (int i = 0; i < 4; i++) {
            try {
                if (i == 2) {
                    throw new Exception("Random error at i=2");
                }
                System.out.println("Loop index: " + i);
            } catch (Exception e) {
                System.out.println("Error happened: " + e.getMessage());
            }
        }
        System.out.println();

        // Example 4: If else with throw
        int x = 10;
        try {
            if (x < 0) {
                throw new IllegalArgumentException("x cannot be negative");
            } else if (x == 10) {
                System.out.println("x is equal to 10");
            } else {
                System.out.println("x is another value");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error with x: " + e.getMessage());
        }
        System.out.println();

        // Example 5: Switch with throw
        int choice = 2;
        try {
            switch (choice) {
                case 1:
                    System.out.println("You chose one");
                    break;
                case 2:
                    throw new RuntimeException("Option 2 is not allowed");
                default:
                    System.out.println("Other choice");
            }
        } catch (RuntimeException e) {
            System.out.println("Runtime problem: " + e.getMessage());
        }
        System.out.println();

        // Example 6: While loop with throw
        int count = 0;
        while (count < 3) {
            try {
                if (count == 1) {
                    throw new IndexOutOfBoundsException("Bad index simulated");
                }
                System.out.println("While count: " + count);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Caught index issue: " + e.getMessage());
            }
            count++;
        }
        System.out.println();

        // Example 7: Throw manually on string check
        try {
            String text = "stevPy";
            if (!text.contains("z")) {
                throw new IllegalArgumentException("Letter z not found in text.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error message: " + e.getMessage());
        }
        System.out.println();

        // Example 8: Throw on list length
        try {
            int[] marks = {90, 85};
            if (marks.length < 3) {
                throw new Exception("Not enough marks in the list.");
            }
        } catch (Exception e) {
            System.out.println("Marks problem: " + e.getMessage());
        }
        System.out.println();

        // Example 9: Try-catch-else simulation
        try {
            int n = 12;
            if (n % 2 != 0) {
                throw new IllegalArgumentException("n should be even");
            }
            System.out.println("n is even: " + n);
        } catch (IllegalArgumentException e) {
            System.out.println("Odd number error: " + e.getMessage());
        }
        System.out.println();

        // Example 10: Try-finally with throw
        try {
            int balance = -100;
            if (balance < 0) {
                throw new ArithmeticException("Negative balance not valid");
            }
        } catch (ArithmeticException e) {
            System.out.println("Balance issue: " + e.getMessage());
        } finally {
            System.out.println("Balance check complete");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("RAISE EXCEPTION DONE IS NOT EASY THOUGH BUT I DID IT.");
        }
    }
}