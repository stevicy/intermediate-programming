package JavaLearning.IRO4;

public class stevenMultipleExceptionHandling {
    public static void main(String[] args) {

        System.out.println("=== MULTIPLE EXCEPTION HANDLING IN JAVA ===\n");

        // Example 1: Division with multiple exceptions
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // division by zero
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Some other error happened");
        }
        System.out.println();

        // Example 2: Index error
        int[] nums = {1, 2, 3};
        try {
            System.out.println(nums[5]); // wrong index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: list index wrong");
        } finally {
            System.out.println("This finally block always executes");
        }
        System.out.println();

        // For loop with multiple exceptions
        System.out.println("=== FOR LOOP WITH TRY ===");
        Object[] values = {10, 0, "abc"}; // mix int, zero, string
        for (Object v : values) {
            try {
                int result = 100 / (int) v; // may cause errors
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException in loop");
            } catch (ClassCastException e) {
                System.out.println("ClassCastException in loop");
            } catch (Exception e) {
                System.out.println("General error in loop");
            }
        }
        System.out.println();

        // While loop with multiple exceptions
        System.out.println("=== WHILE LOOP WITH TRY ===");
        int count = 0;
        while (count < 4) {
            try {
                if (count == 1) {
                    //int res = 10 / 0;  // division by zero
                } else {
                    int res = count * 2;
                    System.out.println("Result in while: " + res);
                }
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException in while loop");
            }
            count++;
        }
        System.out.println();

        // Nested try with multiple exceptions
        System.out.println("=== NESTED TRY EXAMPLE ===");
        try {
            System.out.println("Outer block start");
            try {
                // int num = 10 / 0; // inner error
            } catch (ArithmeticException e) {
                System.out.println("Inner caught ArithmeticException");
            }
            int[] arr = {5, 6};
            System.out.println(arr[4]); // outer error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer caught ArrayIndexOutOfBoundsException");
        }
        System.out.println();

        // Extra small demos of multiple excepts
        System.out.println("=== EXTRA MULTIPLE EXCEPTS ===");
        try {
            Object val = "hello";
            int sum = (int) val + 5; // invalid cast
            System.out.println(sum);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException in string + int");
        } catch (Exception e) {
            System.out.println("Caught generic error");
        }
        System.out.println();

        try {
            //int div = 50 / 0; // division error
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero again handled");
        } catch (Exception e) {
            System.out.println("Other error");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("MULTIPLE EXCEPTION HANDLING DONE, IS NOT EASY THOUGH BUT I DID IT.");
        }
    }
}
