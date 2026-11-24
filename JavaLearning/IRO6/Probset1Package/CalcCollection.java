package Probset1Package;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class CalcCollection {

    public static void intro() {
        System.out.println("=== Simulation Probset 1 ===");
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double divide(double x, double y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            } return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } return 0;
    }

    public static String gradeStatus(double grade) {
        if (grade >= 90) {
            return "Execellent!";
        } else if (grade >= 75) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public static void meCollection(){
        Map<String, Object> meCollection = new HashMap<>();

            meCollection.put("Name: ", "Steven Payapaya");
            meCollection.put("Age: ", 20 );
            meCollection.put("Role: ", "BSIT Student & PeakGym Assistant");

        for (Map.Entry<String, Object> entry : meCollection.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());  
        }
    }

    public static ArrayList<String> collectionPersonality(ArrayList<String> collectionPersonaList) {
        return collectionPersonaList;
    }
}
