import java.util.Scanner;
import java.util.ArrayList;
import Probset1Package.CalcCollection;

public class MainProbset1 {

    public static void main_sim() {
        Scanner io = new Scanner(System.in);

        CalcCollection.intro();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Numbers");
            System.out.println("2. Divide Numbers");
            System.out.println("3. Grade Status Checker");
            System.out.println("4. Collection of Me");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1-5): ");
            String choice = io.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nYou chose 1. Add Numbers");
                    System.out.println("Now proceed to enter a numbers..");
                    System.out.print("\nEnter a first number: ");
                    double num1 = Double.parseDouble(io.nextLine());
                    System.out.print("Enter a second number: ");
                    double num2 = Double.parseDouble(io.nextLine());
                    System.out.println("Result: " + CalcCollection.add(num1, num2));
                    break;
                case "2":
                    System.out.println("\nYou chose 2. Divide Numbers");
                    System.out.println("Now proceed to enter a numbers..");
                    System.out.print("\nEnter a first number: ");
                    double num3 = Double.parseDouble(io.nextLine());
                    System.out.print("Enter a second number: ");
                    double num4 = Double.parseDouble(io.nextLine());
                    System.out.println("Result: " + CalcCollection.divide(num3, num4));
                    break;
                case "3":
                    System.out.println("\nYou chose 3. Grade Status Checker");
                    System.out.println("Now proceed to enter a grade..");
                    System.out.print("\nEnter your grade: ");
                    double grade = Double.parseDouble(io.nextLine());
                    System.out.println("Result: " + CalcCollection.gradeStatus(grade));
                    break;
                case "4":
                    System.out.println("\nYou chose 4. Collection of Me");
                    System.out.println("Now here they are:");
                    System.out.println();

                    CalcCollection.meCollection();
                    System.out.println();
                    
                    ArrayList<String> mePersonality = new ArrayList<>();
                    mePersonality.add("Patient");
                    mePersonality.add("Humble");
                    mePersonality.add("God-fearing");
                    ArrayList<String> traits = CalcCollection.collectionPersonality(mePersonality);

                    System.out.println("\n--- My Personality ---");
                    for (String t : traits) {
                        System.out.println("-" + t);
                    }
                    break;
                case "5":
                    System.out.println("\nExiting the program... Thanks!");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    io.close();
            }           
        }
    }

    public static void main(String[] args) {
        main_sim();
    }
    
}
