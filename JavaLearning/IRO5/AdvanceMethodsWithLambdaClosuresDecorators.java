import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;


public class AdvanceMethodsWithLambdaClosuresDecorators {

    // ==================
    // MY MESSAGE
    // ==================
    public static void greetIntro() {
        class Inner {
            void greet(String message) {
                System.out.println("\n" + message + " Hello! this is my final term of programming simulation. It's getting tough you know.");
            }
        }
        new Inner().greet("My message:");
    }


    // ========================
    //  LAMBDA IMPLEMENTATION 
    // ========================
    public static void lambdaSection(Scanner io) {
        System.out.println("\n----- Lambda Function Section -----");

        // Lambda Functions
        Function<Integer, String> checkNum = x -> x % 2 == 0 ? "Even" : "Odd";
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> sub = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> mul = (x, y) -> x * y;
        BiFunction<Integer, Integer, String> div = (x, y) ->
                y == 0 ? "Error: divide by zero" : String.valueOf(x / y);

        // Check Even/Odd
        System.out.println(checkNum.apply(15));
        System.out.println(checkNum.apply(12));
        System.out.println();
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " is " + checkNum.apply(i));
        }

        try {
            System.out.println("\nExample 1: Lambda Arithmetic");
            System.out.print("Enter first number: ");
            int x = io.nextInt();
            System.out.print("Enter second number: ");
            int y = io.nextInt();

            System.out.println();
            System.out.println("Sum: " + add.apply(x, y));
            System.out.println("Difference: " + sub.apply(x, y));
            System.out.println("Product: " + mul.apply(x, y));
            System.out.println("Quotient: " + div.apply(x, y));
        } catch (Exception e) {
            System.out.println("Invalid input. numbers only!");
            io.nextLine();
        }

        // Conditional logic
        try {
            System.out.println("\nExample 2: Conditional Logic");
            System.out.print("Enter your age: ");
            int age = io.nextInt();
            Supplier<String> status = () ->
                    age < 18 ? "Minor" : age < 60 ? "Adult" : "Senior Citizen";
            System.out.println("Status: " + status.get());
        } catch (Exception e) {
            System.out.println("Invalid age input!");
            io.nextLine();
        }
    }


    // =========================
    //  CLOSURE IMPLEMENTATION
    // =========================
    public static void closureSection(Scanner io) {
        System.out.println("\n----- Closure Function Section -----");

        // Example 1: Basic Closure
        class GreetUser {
            void greet(String username) {
                System.out.println("Example 1: Basic Closure Example");
                class Message {
                    void message() {
                        System.out.println("Hello " + username + "! Welcome to Closure Zone.");
                    }
                }
                new Message().message();
            }
        }
        new GreetUser().greet("Steven");

        // Example 2: Counter Closure simulation with inner class
        System.out.println("\nExample 2: Counter Closure");
        class Counter {
            private int count = 0;
            void increment() {
                count++;
                System.out.println("Count: " + count);
            }
       }
       Counter counter1 = new Counter();
       Counter counter2 = new Counter();
       for (int i = 0; i < 3; i++) counter1.increment();
       for (int i = 0; i < 2; i++) counter2.increment();
    
        // Example 3: Multi-level closure simulation
        class Outer {
            void outerFunc(String msg) {
                class Middle {
                    void middleFunc() {
                        System.out.println("\nExample 3: Multi-Level Closure");
                        class Inner {
                            void innerFunc() {
                                System.out.println("Deep closure says: " + msg);
                            }
                        }
                        new Inner().innerFunc();
                    }
                }
                new Middle().middleFunc();
            }
        }
        new Outer().outerFunc("Keep learning even it's tough, hard, or broke Steven you got this!, your family is counting on you.");
    }


    // =============================
    //  DECORATORS IMPLEMENTATION
    // =============================
    public static void decoratorSection() {
        System.out.println("\n----- Decorators Function Section -----");

        // Basic decorator simulation with Runnable wrapper
        Runnable sayHello = () -> System.out.println("Hello, World!!!!");
        Runnable decorated = () -> {
            System.out.println("[Before Function]");
            sayHello.run();
            System.out.println("[After Function]");
        };
        System.out.println("Example 1: Basic Decorator");
        decorated.run();

        // Decorator with repeat simulation
        System.out.println("\nExample 2: Decorator with Arguments");
        Runnable motivate = () -> System.out.println("Keep coding bahalag sakit ng mata, Steven!");
        for (int i = 0; i < 3; i++) {
            System.out.println("Execution " + (i+1) + ":");
            motivate.run();
        }

        // Advanced decorator simulation: exception handling
        System.out.println("\nExample 3: Advanced Decorator");
        int[][] pairs = {{10,2}, {15,0}};
        for (int[] pair : pairs) {
            try {
                System.out.println("Result of " + pair[0] + " / " + pair[1] + " = " + (pair[0]/pair[1]));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }


    // ==================
    //     WRAP-UP
    // ==================
    public static void wrapUp() {
        Runnable sayGoodbye = () -> {
            System.out.println("\n--- Wrap-Up ---");
            System.out.println("End of Simulation. Thank You! ");
            System.out.println("See Yahhhh Guys!! Good coding by the way, Kadlawnan oy HAHHAHA");
            System.out.println("All LAMBDA, CLOSURES, AND DECORATORS executed successfully.");
            System.out.println();
        };

        sayGoodbye.run();
    }


    // ==================
    //   FINAL MESSAGE
    // ==================
    public static void closingMessage() {
        Runnable closeMessage = () -> System.out.println("JAVA ADVANCE METHODS AND CONCEPT IMPLEMENTATION WITH LAMBDA/CLOSURES/DECORATORS DONE, IT'S NOT EASY BUT I DID THOUGH.");
        for (int i = 0; i < 5; i++) closeMessage.run();
    }


    // ==================
    //   MAIN METHOD
    // ==================
     public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("======== 'Advance Methods and Concept Implementation with Lambda/Closures/Decorators' ========");
        greetIntro();
        lambdaSection(io);
        closureSection(io);
        decoratorSection();
        wrapUp();
        closingMessage();

        io.close();
    }
}





    
