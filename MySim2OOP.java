import java.util.Scanner;

public class MySim2OOP {
    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);

        MySim1OOP introduction = new MySim1OOP();

        introduction.myMessage = "Hello, this is my last final term of intermediate programming simulation. I hope maka pasar.";
        introduction.myName = "Steven P. Payapaya";
        introduction.myAge = 20;
        introduction.myCourse = "BSIT";
        introduction.myStatus = "Student & PeakGym Assistant";
        
        System.out.println("=================== My Comprehensive Simulatuon IRO8 'Working with Object-Oriented Programming' ========================");
        System.out.println("My message: " + introduction.myMessage);
        System.out.println("\nName: " + introduction.myName);
        System.out.println("Age: " + introduction.myAge);
        System.out.println("Course: " + introduction.myCourse);
        System.out.println("Status: " + introduction.myStatus);
        System.out.println("==================================================================================================");

        String again = "Yes";

        while (again.equalsIgnoreCase("Yes")) {

            MySim1OOP customer = new MySim1OOP();
            
            System.out.println("\n===========================================");
            System.out.println("    'PEAK GYM RECORD ATTENDANCE SYSTEM'      ");
            System.out.println("===========================================");
            
            System.out.print("Enter your name: ");
            customer.personName = io.nextLine();

            System.out.print("Enter your age: "); 
            customer.age = io.nextInt(); 
            io.nextLine();

            System.out.print("Enter Gender (M/F): "); 
            customer.gender = io.nextLine(); 

            System.out.print("Enter Contact Number: "); 
            customer.contactNumber = io.nextLine();

            System.out.print("Enter Time In: ");
            customer.timeIn = io.nextLine();
            
            // Customer Payment Type
            System.out.println("\nChoose Payment Type:");
            System.out.println("1 - Daily (40)");
            System.out.println("2 - Monthly (550)");
            System.out.println("3 - Member");
            System.out.print("Enter option: ");
            int p = io.nextInt(); 
            io.nextLine();
            
            if (p == 1) {
                customer.paymentType = "Daily";
                customer.paymentAmount = 40;
            } else if (p == 2) {
                customer.paymentType = "Monthly";
                customer.paymentAmount = 550;
                System.out.print("\nEnter Membership Expiry (MM/DD/YY): ");
                customer.membershipExpiry = io.nextLine();
            } else {
                customer.paymentType = "Member";
                customer.membershipExpiry = "N/A";
            }


            // Customer Amino Purchase
            System.out.print("\nBuy Amino? (yes/no): ");
            String b = io.nextLine();

            if (b.equalsIgnoreCase("yes")) {
                customer.boughtAmino = true;
                System.out.print("Enter Amino Quantity: ");
                customer.aminoQty = io.nextInt();
                customer.aminoTotal = customer.aminoQty * 12;
                io.nextLine();
            } else {
                customer.boughtAmino = false;
                customer.aminoQty = 0;
                customer.aminoTotal = 0;
            }
            System.out.println("===========================================");


            // Display Customer Record
            System.out.println("\n\n======================================");
            System.out.println("          'CUSTOMER RECORD'           ");
            System.out.println("======================================");
            System.out.println("Name: " + customer.personName);
            System.out.println("Age: " + customer.age);
            System.out.println("Gender: " + customer.gender);
            System.out.println("Contact Number: " + customer.contactNumber);
            
            System.out.println("--------------------------------------");
            System.out.println("Time In: " + customer.timeIn);
            System.out.println("Payment Type: " + customer.paymentType);
            System.out.println("Payment Amount: " + customer.paymentAmount);
            System.out.println("Membership Expiry: " + customer.membershipExpiry);

            if (customer.boughtAmino) {
                System.out.println("--------------------------------------");
                System.out.println("Amino Qty: " + customer.aminoQty);
                System.out.println("Amino Total: " + customer.aminoTotal);
            }
            System.out.println("======================================");

            System.out.print("\nRecord another customer? (Yes/No): ");
            again = io.nextLine();

        }
        System.out.println("======================================");
        System.out.println("        'SYSTEM ARE NOW CLOSE'        ");
        System.out.println("======================================");


        //===========================================================================================================

        MySim1OOP salaryCompute = new MySim1OOP();

        System.out.println("\n\n=======================================================");
        System.out.println("           'WELCOME TO PEAK GYM SALARY COMPUTE'          ");
        System.out.println("=======================================================");

        System.out.print("Enter employee name: ");
        salaryCompute.employeeName = io.nextLine();

        System.out.print("Enter shift (morning/afternoon/wholeday): ");
        salaryCompute.shift = io.nextLine();

        if (salaryCompute.shift.equalsIgnoreCase("morning")) {
            salaryCompute.dailySalary = 200;
        } else if (salaryCompute.shift.equalsIgnoreCase("afternoon")) {
            salaryCompute.dailySalary = 250;
        } else if (salaryCompute.shift.equalsIgnoreCase("wholeday")) {
            salaryCompute.dailySalary = 200 + 250; // whole day = 450
        } else {
            System.out.println("Invalid shift, defaulting to morning.");
            salaryCompute.dailySalary = 200;
            salaryCompute.shift = "morning";
        }

        System.out.print("Enter number of days worked: ");
        salaryCompute.daysWorked = Integer.parseInt(io.nextLine());
        System.out.println("=======================================================");

        // Compute total salary
        salaryCompute.totalSalary = salaryCompute.dailySalary * salaryCompute.daysWorked;

        System.out.println("\n================= Salary Summary =====================");
        System.out.println("Employee Name : " + salaryCompute.employeeName);
        System.out.println("Daily Salary  : " + salaryCompute.dailySalary);
        System.out.println("Shift        : " + salaryCompute.shift);
        System.out.println("Days Worked   : " + salaryCompute.daysWorked);
        System.out.println("--------------------------------------------");
        System.out.println("TOTAL SALARY  : " + salaryCompute.totalSalary);
        System.out.println("========================================================");

        io.close();
        System.out.println("             'SALARY COMPUTE ARE NOW CLOSE'            ");
        System.out.println("========================================================");

        System.out.println("\nEnd of Simulation. Thank You!");

        //=======================
        //    FINAL MESSAGE
        //=======================
        MySim1OOP fnlMessage = new MySim1OOP();

        System.out.println();
        fnlMessage.fnalMessage = "JAVA OBJECT-ORIENTED PROGRAMMING DONE, IT'S NOT EASY BUT NA HUMAN RAJOD NAKO ANG LAST NGA SIMULATION!!!! ";

        for (int i = 0; i < 5; i++) {
            System.out.println(fnlMessage.fnalMessage);
        }
    }
}