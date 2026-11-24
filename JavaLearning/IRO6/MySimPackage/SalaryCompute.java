package MySimPackage;

public class SalaryCompute {

    //======This Belong to 3rd Simulation Run======
    public static double[] computeSalary(double rate, double hours, double days) {
        double dailySalary = rate * hours;
        double totalSalary = dailySalary * days;
        return new double[] {dailySalary, totalSalary};
    }

    //======This Belong to 4th Simulation Run======
    public static double num1(int x, int y) {
        return x / y; // may throw ArithmeticException
    }

    public static Object[] num2(Object[] arr) {
        return arr; // returns array
    }

    public static int num3(int[] arr) throws IndexOutOfBoundsException {
        return arr[5]; // this will throw IndexOutOfBoundsException if index 5 doesn't exist
    }

    // Same as n4: convert string → int
    public static int num4(String x) {
        return Integer.parseInt(x); // auto error if invalid
    }
    
    // Simple function: multiply the input by 2
    public static int multiply2(int num) {
        return num * 2; 
    } 
}
