import java.util.Scanner;

public class BasicMethods {

    //Global Scanner Object
    static Scanner io = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("============ 'Basic Methods/Funtion Implemetation ============");

        greet();
        Information.person("Steven", 20, "BSIT");
        Information.status("Student");


        CalculatorProgram.run();
        FriendList.enterFriends();
        SalaryComputation.computeSalary();
        VowelsConsonantsCounter.countVowelsConsonant();
        ClosingMessage.showMessage();

        //Close Scanner at the end
        io.close();

    }

    //Greet Funtion
    static void greet() {
       String message = "Hello! this is my final term of programming simulation. Its's getting tough you know.";
       System.out.println("\nMy message: " + message);
    }

    // ======================
    // CLASS: Information
    // ======================

    static class Information {
        static void person(String n, int a, String c) {
            System.out.println("\n=== MY PROFILE ===");
            System.out.println("Name: " + n);
            System.out.println("Age: " + a);
            System.out.println("Course: " + c);
        }

        static void status(String s) {
            if (s.equalsIgnoreCase("Student")) {
                System.out.println("Status: " + s);
            } else if (s.equalsIgnoreCase("Professional")) {
                System.out.println("Status: " + s);
            } else {
                System.out.println("Status: Retired");
            }  
        }
    }

    // ======================
    // CLASS: Calculator
    // ======================

    static class Calculator {
            static double add(double x, double y) {
                return x + y;
            }

            static double subtraction(double x, double y) {
                return x - y;
            }

            static double multiplication(double x, double y) {
                return x * y;
            }

            static String divide(double x, double y) {
                if (y != 0) {
                    return String.valueOf(x / y);
                } else {
                    return "Error: Division by zero is not allowed.";
                }
            }
        }
 
    // ======================
    // CLASS: CalculatorProgram
    // ======================

    static class CalculatorProgram {
        static void run() {
            System.out.println("\n========= PROBLEM SET 1 =========");

            while (true) {
                System.out.println("\n===== Choose Calculator Operation =====");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("Type 'skip' to proceed to the next problem.\n");
                
                System.out.print("Choose an operation (1-4) or 'skip': ");
                String choice = io.nextLine();

                if (choice.equalsIgnoreCase("skip")) {
                    System.out.println("You chose to skip. Proceeding to the next problem...\n");
                    break;
                }

                switch (choice) {
                    case "1":
                        System.out.println("You chose ADDITION. Proceed to enter a numbers.\n");
                        break;
                    case "2":
                        System.out.println("You chose SUBTRACTION. Proceed to enter a numbers.\n");
                        break;
                    case "3":
                        System.out.println("You chose MULTIPLICATION. Proceed to enter numbers.\n");
                        break;
                    case "4":
                        System.out.println("You chose DIVISION. Proceed to enter a numbers.\n");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.\n");
                        continue;
                }

                try {
                    System.out.print("Enter a first number: ");
                    double num1 = Double.parseDouble(io.nextLine());
                    System.out.print("Enter a second number: ");
                    double num2 = Double.parseDouble(io.nextLine());

                    switch (choice) {
                        case "1":
                            System.out.println("Result: " + Calculator.add(num1, num2));
                            break;
                        case "2":
                            System.out.println("Result: " + Calculator.subtraction(num1, num2));
                            break;
                        case "3":
                            System.out.println("Result: " + Calculator.multiplication(num1, num2));
                            break;
                        case "4":
                            System.out.println("Result: " + Calculator.divide(num1, num2));
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a numeric values only.");
                }                       
            }
        }
    }

    // ======================
    // CLASS: FriendList
    // ======================

    static class FriendList {
        static void enterFriends() {
            System.out.println("\n===== PROBLEM SET 2 =====");
            String[] names = new String[3];
            int[] years = new int[3];
            int[] ages = new int[3];
            int currentYear = 2025;

            System.out.println("===== Enter Friend's =====");
            for (int i = 0; i < 3; i++) {
                System.out.println("\n--- Person " + (i + 1) + " ---");
                System.out.print("Enter a name of friend: ");
                names[i] = io.nextLine();
                System.out.print("Enter year of birth: ");
                years[i] = Integer.parseInt(io.nextLine());
            }

            for (int i = 0; i < 3; i++) {
                ages[i] = currentYear - years[i];
            }

            displayFriends(names, years, ages);
        }

        static void displayFriends(String[] names, int[] years, int[] ages) {
            System.out.println("\n===== List of Friend's =====");
            for (int i = 0; i < 3; i++) {
                System.out.println("Name: " + names[i] + " | Year: "  + years[i] + " | Age: " + ages[i]);
            }

            findOldestYoungest(names, ages);
        }

        static void findOldestYoungest(String[] names, int[] ages) {
            int oldest = ages[0];   
            int youngest = ages[0];
            int oldIndex = 0; 
            int youngIndex = 0;   

            for (int i = 1; i < ages.length; i++) {
                if (ages[i] > oldest) {
                    oldest = ages[i];
                    oldIndex = i;
                }
                if (ages[i] < youngest) {
                    youngest = ages[i];
                    youngIndex = i;
                }
            }

            System.out.println("\nThe oldest is: " + names[oldIndex] + " (" + oldest + ") years old");
            System.out.println("The youngest is: " + names[youngIndex] + " (" + youngest + ") years old");
        }
    }

    // ======================
    // CLASS: SalaryComputation
    // ======================

    static class SalaryComputation {
        static void computeSalary() {
            System.out.println("\n===== PROBLEM SET 3 =====");
            System.out.println("=== Salary Computation ===");

            System.out.print("Enter employee name: ");
            String name = io.nextLine();
            System.out.print("Enter rate per hour: ");
            double rate = Double.parseDouble(io.nextLine());
            System.out.print("Enter hours worked per day: ");
            double hours = Double.parseDouble(io.nextLine());
            System.out.print("Enter number of days worked: ");
            int days = Integer.parseInt(io.nextLine());

            double dailySalary = rate * hours;
            double totalSalary = dailySalary * days;

            System.out.println("\n=== Salary Summary ===");
            System.out.println("Employee name: " + name);
            System.out.println("Rate per Hour: " + rate);
            System.out.println("Hours Worked per Day: " + hours);
            System.out.println("Days Worked: " + days);
            System.out.println("Daily Salary: " + dailySalary);
            System.out.println("Total Salary: " + totalSalary);

        }
    }

    // ======================
    // CLASS: VowelsConsonantCounter
    // ======================

    static class VowelsConsonantsCounter {
        static void countVowelsConsonant() {
            System.out.println("\n===== PROBLEM SET 4 =====");
            System.out.println("=== Vowels and Consonant Counter ===");

            System.out.print("Enter a word: ");
            String word = io.nextLine();

            int vowelCount = 0;
            int consonantCount = 0;
            String vowels = "aeiouAEIOU";

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (vowels.indexOf(c) != -1)
                        vowelCount++;
                    else
                        consonantCount++;
                }
            }

            System.out.println("\n=== Result ===");
            System.out.println("Word: " + word);
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Consonants: " + consonantCount);

            System.out.println("\nEnd of Simulation. Thank You!");

        }
    }

    // ======================
    // CLASS: ClosingMessage
    // ======================

    static class ClosingMessage {
        static void showMessage() {
            System.out.println();

            for (int i = 0; i < 5; i++) {
                System.out.println("JAVA BASIC METHODS/FUNCTION IMPLEMENTATION DONE, IT'S NOT EASY BUT I DID IT THOUGH.");
            }
        }
    }
}
        