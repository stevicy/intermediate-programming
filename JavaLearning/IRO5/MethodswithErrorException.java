import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;

public class MethodswithErrorException {
   
    // ==============
    // 'MY MESSAGE'
    // ==============
    public static void greet() {
        String message = "HELLO! THIS IS MY FINAL TERM OF PROGRAMMING SIMULATION. IT'S GETTING TOUGH YOU KNOW.";
        System.out.println("\nMy message: " + message);
    }


    // ===========
    // 'MY SELF'
    // ===========
    public static HashMap<String, Object> createProfile(String name, int age, String course) {
         System.out.println("\n===== Creating My Profile =====");
         HashMap<String, Object> profile = new HashMap<>();

         try {
            if (!(name instanceof String)) {
                throw new IllegalArgumentException("Name must be a string.");
            }
            if (!(Integer.valueOf(age) instanceof Integer)) {
                throw new IllegalArgumentException("Age must be an integer.");
            }
            if (!(course instanceof String)) {
                throw new IllegalArgumentException("Course must be a string.");
            }

            
            profile.put("Name: ", name);
            profile.put("Age: ", age);
            profile.put("Course: ", course);
            profile.put("Status: ", "Student");

        } catch (Exception e) {
            System.out.println("Error while creating profile: " + e.getMessage());
        } finally {
            System.out.println("Profile created process completed.");
        }

        System.out.println("Profile successfully created with no errors.");
        return profile;
    }


    // ==========================
    // 'Basic Exception Handling'
    // ==========================
    public static void basicExceptionHandling(Scanner io) {
        System.out.println("\n----- Basic Exception Handling Function -----");

        int[] numbers = {15, 25, 35};
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("numbers[3]");

        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        }

        int[] data = {1, 2, 3};
        System.out.println("\ndata = " + Arrays.toString(data));
        System.out.println("data[5]");

        try {
            System.out.println(data[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index problem detected");
        } finally {
            System.out.println("This part always run.");
        }

        String text = "tired";
        System.out.println("\ntext = " + text);
        System.out.println("text[10]");

        try {
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index error.");
        }

        try {
            System.out.print("\nEnter a number: ");
            String userInput = io.nextLine();
            int num = Integer.parseInt(userInput);
            System.out.println("Input: " + num);

            if (num % 2 == 0) {
                System.out.println("Even number.");
            } else {
                System.out.println("Odd number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input. Not a number.");
        }

        try {
            int div = 100 / 0;
            System.out.println("div = " + div);
        } catch (ArithmeticException e) {
            System.out.println("\nDivide by zero not allowed.");
        }
    }


    // ==========================
    // Multiple Exception Handling
    // ==========================
    public static void multipleExceptionHandling() {
        System.out.println("\n----- Multiple Exception Handling Function -----");

        System.out.println("Example 1: Division with multiple exceptions.");
        System.out.println("x = 10");
        System.out.println("y = 0");
        System.out.println("c = x / y");

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ZeroDivisionError: cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Some other error happened.");
        }

        System.out.println("\nExample 2: Conversion with multiple exceptions.");
        System.out.println("val = 'five");
        System.out.println("y = int(val)");

        try {
            int val = Integer.parseInt("five");
            System.out.println(val);
        } catch (NumberFormatException e) {
            System.out.println("ValueError: cannot convert string to int.");
        } catch (Exception e) {
            System.out.println("TypeError found.");
        }

        System.out.println("\nExample 3: Index and ValueError together.");
        System.out.println("nums = [5,2,7]");
        System.out.println("nums[5]");
        System.out.println("int('opps')");

        int[] nums = {5, 2, 7};

        try {
            System.out.println(nums[5]);
            Integer.parseInt("oops");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nCaught IndexError: list index error.");
        } catch (NumberFormatException e) {
            System.out.println("Caught ValueError: invalid conversion.");
        } finally {
            System.out.println("This finally block always execute.");
        }

        try {
            Integer.parseInt("oops");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught IndexError: list index error.");
        } catch (NumberFormatException e) {
            System.out.println("\nCaught ValueError: invalid conversion.");
        } finally {
            System.out.println("This finally block always execute.");
        }
        

        System.out.println("\nExample 4: For loop with multiple exception.");
        System.out.println("values = {10, 0, 'nope'}");
        System.out.println("result = 100 // v");

        Object[] values = {10, 0, "nope"};
        
        for (Object v : values) {
            try {
                int result = 100 / (int) v;
                System.out.println("\nResult: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ZeroDivisionError in loop.");
            } catch (ClassCastException e) {
                System.out.println("TypeError in loop.");
            } catch (Exception e) {
                System.out.println("General error in loop.");
            }
        }

        System.out.println("\nExample 5: While loop with multiple exception.");
        int count = 0;

        while (count < 4) {
            try {
                System.out.println(count);
                if (count == 1)
                    throw new ArithmeticException();
                else if (count == 2)
                    Integer.parseInt("bad");
                else
                    System.out.println("Result: " + (count * 2));
            } catch (ArithmeticException e) {
                System.out.println("ZeroDivisionError in while loop.");
            } catch (NumberFormatException e) {
                System.out.println("ValueError in while loop.");
            }
            count++;
        }
    }


    // =====================
    // Raise Exception Block
    // =====================
    public static void raiseExceptionHandling() {
        System.out.println("\n----- Raise Exception Handling Function -----");

        System.out.println("Example 1: Loop with raise.");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(i);
                if (i == 2) {
                    throw new Exception("Random error at i = 2");
                }
                System.out.println("Loop index " + i);
            } catch (Exception e) {
                System.out.println("Error happened: " + e.getMessage());
            }
        }

        System.out.println("\nExample 2: Switch-case with raise.");
        System.out.println("choice = 2");
        int choice = 2;

        try {
            switch (choice) {
                case 1:
                    System.out.println("You chose one.");
                    break;
                case 2:
                    throw new RuntimeException("Option 2 is not allowed.");
                default:
                    System.out.println("Other choice.");
            }
        } catch (RuntimeException e) {
            System.out.println("Runtime problem: " + e.getMessage());
        }

        System.out.println("\nExample 3: Age raise example.");
        System.out.println("age = -5");

        try {
            int age = -5;
            if (age < 0)
                throw new IllegalArgumentException("Age cannot be negative.");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an error: " + e.getMessage());
        }

        System.out.println("\nExample 4: Balance Try-Finally with raise.");
        System.out.println("balance = -100");

        try {
            int balance = -100;
            if (balance < 0)
                throw new ArithmeticException("Negative balance not valid.");
        } catch (ArithmeticException e) {
            System.out.println("Balance issue: " + e.getMessage());
        } finally {
            System.out.println("Balance check complete.");
        }
    }


    // ===============================
    // User Defined Exception Classes
    // ===============================
    static class TooYoungError extends Exception {
        public TooYoungError(String msg) {
            super(msg);
        }
    }

    static class TooOldError extends Exception {
        public TooOldError(String msg) {
            super(msg);
        }
    }

    
    static class NegativeFeeError extends Exception {
        public NegativeFeeError(String msg) {
            super(msg);
        }
    }

    public static void gymRegistration(Scanner io) {
        System.out.println("\n--- GYM REGISTRATION SIMULATION (user-defined) ---");
        System.out.println("Welcome to Peak Gym Cabadbaran City Branch!");
        System.out.println("Please follow the rules before entering.");
        System.out.println("---------------------------------------------------");

        int count = 0;
        while (count < 5) {
            try {
                System.out.println("\n--- Registration Attempt: " + (count + 1) + " ---");

                System.out.print("Enter your age: ");
                int age = io.nextInt();

                if (age < 0)
                    throw new TooYoungError("Age cannot be negative.");
                if (age < 16)
                    throw new TooYoungError("Sorry, you're too young. Dili pa allowed sa gym if below 16 years old.");
                if (age > 90)
                    throw new TooOldError("Too old na, risky for senior to workout.");

                System.out.println("Age accepted. Pwede na ka mag-register.");

                System.out.print("\nEnter membership fee payment: ");
                int fee = io.nextInt();

                if (fee < 0)
                    throw new NegativeFeeError("Negative payment. Not valid.");

                if (fee < 500)
                    System.out.println("Too small ang payment, minimum 500 required.");
                else if (fee > 5000)
                    System.out.println("Too big ang payment, maximum 5000 only.");
                else
                    System.out.println("Fee accepted. Welcome to Peak Gym!");

                switch (fee) {
                    case 1000 -> System.out.println("\nPromo: Free water bottle with 1000 pesos fee.");
                    case 1500 -> System.out.println("\nPromo: Free gloves with 1500 pesos fee.");
                    case 2000 -> System.out.println("\nPromo: Free gym bag with 2000 pesos fee.");
                    case 3000 -> System.out.println("\nPromo: Free 1-month personal trainer with 3000 pesos fee.");
                    case 4000 -> System.out.println("\nPromo: Free Peak Gym Jacket with 4000 pesos fee.");
                    case 5000 -> System.out.println("\nPromo: VIP access + all freebies at a 5000 pesos fee!");
                    default -> System.out.println("\nNormal membership fee, no promo this time.");
                }

                System.out.println("\nThank you for choosing Peak Gym!");
                System.out.println("Stay strong and be healthy always.");

            } catch (TooYoungError | TooOldError | NegativeFeeError e) {
                System.out.println("Custom Exception Caught: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                io.nextLine(); // clear invalid input
            } finally {
                System.out.println("\nRegistration " + (count + 1) + " done.");
                System.out.println("--------------------------------");
                count++;
            }
        }

        System.out.println("\n--- SUMMARY REPORT ---");
        System.out.println("Total Registrations Processed: " + count);
        System.out.println("Thank you to all who registered.");
        System.out.println("Peak Gym Cabadbaran City - Fitness for All Ages (16 to 90).");
        System.out.println("-------------------------------------------------------------");
    }


    // =================
    // FINAL MESSAGE
    // =================
    public static void closingMessage() {
        for (int i = 0; i < 5; i++) {
            System.out.println("JAVA METHODS/FUNCTION WITH ERROR AND EXCEPTION HANDLING DONE, IT'S NOT EASY BUT I DID THOUGH.");
        }
    }

     // MAIN METHOD
     public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("======== 'Methods and Function with Error/Exception Collection' ========");
        greet();

        HashMap<String, Object> myProfile = createProfile("Steven", 20, "BSIT");
        System.out.println("\n--- My Profile ---");
        for (String key : myProfile.keySet()) {
            System.out.println(key + " " + myProfile.get(key));
        }

        basicExceptionHandling(io);
        multipleExceptionHandling();
        raiseExceptionHandling();
        gymRegistration(io);

        System.out.println("\nEnd of Simulation. Thank You!\n");
        closingMessage();

        io.close();
    }
}


