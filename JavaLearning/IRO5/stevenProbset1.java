import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

public class stevenProbset1 {

    public static void main(String[] args) {
        intro();
        studentInfo();
        mutable_immutable();
        safeDivide(10, 2);
        safeDivide(5, 0);
        lambdaFunction();
        decoratorFunction();  
    }
    
    //Closure Function
    static void intro() {
        // Outer function
        class GreetIntro {
            void greet(String message) {
                // Inner function that uses the outer variable (closure behavior)
                class Inner {
                    void sayGreeting() {
                        System.out.println("\n" + message + " Hello! this is my final term of programming simulation. It's getting tough you know.");
                    }
                }
                new Inner().sayGreeting();
            }
        }
        new GreetIntro().greet("My message:");
    }
    
    // Basic Function
    static void studentInfo() {
        HashMap<String, String> info = new HashMap<>(); 
        info.put("Name", "Steven Payapaya");
        info.put("Age", "20");
        info.put("Course", "BSIT");
        info.put("Status", "Student");
        System.out.println("\n=== My Profile ===");
        info.forEach((k, v) -> System.out.println(k + ": " + v));
    }
    
    //Mutable and Immutable Collections
    static void mutable_immutable() {
        ArrayList<Integer> mutableArrayList = new ArrayList<>();
        mutableArrayList.add(2);
        mutableArrayList.add(5);
        mutableArrayList.add(7);
        
        System.out.println("\nMutable ArrayList: " + mutableArrayList);
        mutableArrayList.add(22);
        System.out.println("Mutable ArrayList after adding an element: " + mutableArrayList);
        
        System.out.println("\nImmutable String:");

        String name = "Steven";
        System.out.println("Original name: " + name);
        String fullName = name + " Payapaya"; // creates new string
        System.out.println("Combined name: " + fullName);
    }

    //Function with Error and Exception
    static void safeDivide(int x, int y) {
        try {
            int result = x / y;
            System.out.println("\nDivision Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    } 

    //Lambda Function 
    static void lambdaFunction() {
        Function<Integer, Integer> square = (x) -> x * x;
        System.out.println("\nLambda Result (square of 5): " + square.apply(5));
    }

    //Decorator Function
    static void decoratorFunction() {
        System.out.println("\nBasic Decorators:");

        // Basic decorator simulation with Runnable wrapper
        Runnable sayHello = () -> System.out.println("Hello, World!!!!");
        Runnable decorated = () -> {
            System.out.println("[Before Function]");
            sayHello.run();
            System.out.println("[After Function]");
        };
        decorated.run();
    }
}













        
    