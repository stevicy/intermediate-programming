package JavaLearning.IRO4;

public class stevenBasicExceptionHandling {
    public static void main(String[] args) {
        System.out.println("=== JAVA EXCEPTION HANDLING SIMULATION ===\n");

        // 1. Array Index Exception
        int[] numbers = {15, 25, 35};
        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.\n");
        }

        // 2. Arithmetic Exception
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed.\n");
        }

        // 3. Finally block example
        try {
            int[] data = {1, 2, 3};
            System.out.println(data[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index problem detected.");
        } finally {
            System.out.println("Finally block runs.\n");
        }

        // 4. Try inside loop
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Number: " + i);
            } catch (Exception e) {
                System.out.println("Loop error.");
            }
        }
        System.out.println();

        // 5. Division exception with multiple catch
        try {
            int num1 = 100;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Some other error happened.");
        } finally {
            System.out.println("Division attempt finished.\n");
        }

        // 6. While loop with try-catch
        int count = 0;
        while (count < 3) {
            try {
                System.out.println("Count is: " + count);
                count++;
            } catch (Exception e) {
                System.out.println("While loop error.");
            }
        }
        System.out.println();

        // 7. String index exception
        try {
            String text = "tired";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index error.\n");
        }

        // 8. Another division by zero example
        try {
            int div = 50 / 0;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not allowed.\n");
        }

        // 9. Nested try-catch
        try {
            System.out.println("Starting nested try...");
            try {
                int[] arr = {1, 2};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner try caught the array error.");
            }
            // int d = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer try caught the division error.\n");
        }

        // 10. Mixed example with random cases
        int[] list = {5, 10, 15};
        try {
            System.out.println("Accessing element: " + list[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds in mixed example.");
        }

        try {
            int zero = 0;
            int result = 15 / zero;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Another division by zero.\n");
        }

        // 11. Multiple array operations
        int[] values = {11, 12, 23, 24, 35};
        try {
            System.out.println("Value at index 2: " + values[2]);
            System.out.println("Value at index 6: " + values[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array limit exceeded.\n");
        }

        // 12. Simulate user logic mistake
        try {
            int age = -10;
            if (age < 0) {
                throw new ArithmeticException("Age cannot be negative.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid input: " + e.getMessage() + "\n");
        }

        for (int m = 0; m < 5; m++) {
            System.out.println("BASIC EXCEPTION HANDLING DONE, NOT EASY THOUGH BUT I DID IT. ");
        }
    }
}