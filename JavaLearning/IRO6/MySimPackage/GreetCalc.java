package MySimPackage;

public class GreetCalc {

    //========================This Belong to 1st Simulation Run============================

    public static String message(String msg) {
        return msg;
    }

    public static String[] myInfo(String name, int age, String course, String status) {
        return new String[] {name, String.valueOf(age), course, status};
    }
    
    public static double add(double x, double y) {
        return x + y;
    }

    public static double divide(double x, double y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return x / y; // safe division
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticExceptionError: " + e.getMessage());
            return 0; 
        }
    }

    public static String evenAndOdd(int num) {
        return (num % 2 == 0) ? "EVEN" : "ODD";
    }

    public static String gradeStatus(double grade){
        if (grade >= 90) return "Excellent!";
        else if (grade >= 75) return "Passed";
        else return "Failed";
    }
}
