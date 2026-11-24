import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.Random;
import java.util.Scanner;

public class MainSimFileHandling {
    public static void main(String[] args) {
        
        Scanner io = new Scanner(System.in);

        final String filePathMyFile1 = "Java_File1.txt";
        final String filePathMyFile2 = "Java_File2.txt";
        final String filePathMyFile3 = "Java_File3.txt";

        //====================================================================================================
        //                                  'FILE 1 CONTENT'
        //====================================================================================================
        
        // Appending to Appending into the 'Java_File1.txt'
        HashMap<String, Object> my_profile = new HashMap<>();
        my_profile.put("Name: ", "Steven Payapaya");
        my_profile.put("Age: ", 20);
        my_profile.put("Course: ", "BSIT");
        my_profile.put("Status: ", "Student & PeakGym Assistant");

        try (FileWriter myWriter = new FileWriter(filePathMyFile1, true)) {

            myWriter.write("=================== My Comprehensive Simulatuon IRO7 'Working with Files' ========================");
            myWriter.write("\nMy message: Hello! This is my final term of programming simulation. It's getting tough you know." + "\n");
            for (String key : my_profile.keySet()) {
                myWriter.write(key + "" + my_profile.get(key) + "\n");
            }
            myWriter.write("\n==================================================================================================");
        } catch (IOException e) {
            System.err.println("An error occurred during file writing: " + e.getMessage());
        }

        //Reading and displaying into the content of 'Java_File1.txt' after appending
        // BufferedReader provides efficient line-by-line reading
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile1))) {
            System.out.println("--------------------------");
            System.out.println("      File 1 content:     ");
            System.out.println("--------------------------");
            System.out.println();

            String line;
            while ((line = myReader.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred during file reading: " + e.getMessage());
        }


 
        //====================================================================================================
        //                                  'FILE 2 CONTENT'
        //====================================================================================================
        
        //Writing/Appending into the content of 'Java_File2.txt' 
        try (FileWriter myWriter= new FileWriter(filePathMyFile2, true)) {
            myWriter.write("---My Personality---\n");

            for (int i = 0; i < 3; i++) {
                System.out.print("\nEnter my personality: ");
                String personality = io.nextLine();
                myWriter.write(personality + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File2.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile2))) {
            System.out.println();
            System.out.println("--------------------------");
            System.out.println("      File 2 content:     ");
            System.out.println("--------------------------");
            System.out.println();
            System.out.println("==================================================================================================");

            String line;
            while ((line = myReader.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reader: " + e.getMessage());
        }


        //Appending into the 'Java_File2.txt'
        ArrayList<String> mySports = new ArrayList<>();
        mySports.add("Gym");
        mySports.add("Muay-Thai");
        mySports.add("Cycling");
        mySports.add("Running");

        try (FileWriter myWriter = new FileWriter(filePathMyFile2, true)) {
            myWriter.write("\n---My Sports---" + "\n");
            for (String sport : mySports) {
                myWriter.write(sport + "\n");
            }

            myWriter.write("\n---Selecting Sports---" + "\n");
            for (String sp : mySports) {
                if (sp.equals ("Muay-Thai")) {
                    myWriter.write(sp + " It is! Time to unleash the warrior within." + "\n");
                } else {
                    myWriter.write("Skipping " +  sp  + ". Not vibes today." + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File2.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile2))) {
            System.out.println("\nAdding new data in File 2 content: ");
            String line;
            
            while ((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reader: " + e.getMessage());
        }


        //Appending into the 'Java_File2.txt'
        ArrayList<String> mySkills = new ArrayList<>();
        mySkills.add("Basic Programming (Python, Java)");
        mySkills.add("Basic Networking");

        try (FileWriter myWriter = new FileWriter(filePathMyFile2, true)) {
            myWriter.write("\n---My Skills---" + "\n");
            for (String skills : mySkills) {
                myWriter.write(skills + "\n");
            }   
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File2.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile2))) {
            System.out.println("\nAdding new data in File 2 content: ");
            String line;

            while ((line = myReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reader: " + e.getMessage());
        }


        //Appending into the 'Java_File2.txt'
        HashSet<String> set_1 = new HashSet<>();
        set_1.add("Monday");
        set_1.add("Tuesday");
        set_1.add("Wednesday");
        set_1.add("Thursday");
        set_1.add("Friday");
        set_1.add("Saturday");
        set_1.add("Sunday");

        try (FileWriter myWriter = new FileWriter(filePathMyFile2, true)) {
            myWriter.write("\n---My HashSet Schedule Routine---" + "\n");

            for (String days : set_1) {
                switch (days) {
                    case "Monday":
                        myWriter.write(days + ", It's school day." + "\n");
                        break;
                    case "Tuesday":
                        myWriter.write(days + ", It's school day." + "\n");
                        break;
                    case "Wednesday":
                        myWriter.write(days + ", Halfday shift in morning." + "\n");
                        break;
                    case "Thursday":
                        myWriter.write(days + ", It's school day." + "\n");
                        break;
                    case "Friday":
                        myWriter.write(days + ", It's school day." + "\n");
                        break;
                    case "Saturday":
                        myWriter.write(days + ", Wholeday shift." + "\n");
                        break;
                    case "Sunday":
                        myWriter.write(days + ", It's Sabbath day." + "\n");
                        break;
                    default:
                        System.out.println(days + ", days are not recognize." + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File2.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile2))) {
            System.out.println("\nAdding new data in File 2 content: ");
            String line;
            
            while((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reader: " + e.getMessage());
        }


        //Appending into the 'Java_File2.txt'
        HashSet<Integer> set_2 = new HashSet<> ();
        set_2.add(140);
        set_2.add(150);
        set_2.add(200);
        set_2.add(80);

        try (FileWriter myWriter = new FileWriter(filePathMyFile2, true)) {
            myWriter.write("\n--Now this is My ideal Lifting weights HashSet--" + "\n");
            
            for (Integer weight : set_2) {
                if (weight == 140) {
                    myWriter.write(weight + "lbs - Bench press." + "\n");
                } else if (weight == 150) {
                    myWriter.write(weight + "lbs - Squat." + "\n");
                } else if (weight == 200) {
                    myWriter.write(weight + "lbs - Deadlift." + "\n");
                } else if (weight == 80) {
                    myWriter.write(weight + "lbs - Shoulder press." + "\n");
                } else {
                    myWriter.write(weight + "lbs - Unknown lift, but anyways let's lift something baby!!" + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File2.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile2))) {
            System.out.println("\nAdding new data in File 2 content: " );
            String line;

            while((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\n==================================================================================================");
        } catch (IOException e) {
            System.out.println("An error occured during file reader: ");
        }



        //====================================================================================================
        //                                  'FILE 3 CONTENT'
        //====================================================================================================

        //Writing/Appending into the content of 'Java_File3.txt' 
        try (FileWriter myWriter = new FileWriter(filePathMyFile3, true)) {
            myWriter.write("---Salary Computation---" + "\n");

            System.out.print("\nEnter employee name: ");
            String name = io.nextLine();
            System.out.print("Enter rate per hour: ");
            double rate = Double.parseDouble(io.nextLine());
            System.out.print("Enter hours worked: ");
            double hours = Double.parseDouble(io.nextLine());
            System.out.print("Enter numbers of days worked: ");
            double days = Integer.parseInt(io.nextLine());

            double dailySalary = rate * hours;
            double totalSalary = dailySalary * days;

            myWriter.write("Employee Name: " + name + "\n");
            myWriter.write("Rate per Hour: " + rate + "\n");
            myWriter.write("Hours Worked per Day: " + hours + "\n");
            myWriter.write("Days Worked: " + days + "\n");
            myWriter.write("Daily Salary: " + dailySalary + "\n");
            myWriter.write("Total Salary: " + totalSalary + "\n");
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File3.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile3))) {
            System.out.println("--------------------------");
            System.out.println("      File 3 content:     ");
            System.out.println("--------------------------");
            System.out.println();
            System.out.println("==================================================================================================");

            String line;
            while ((line = myReader.readLine()) != null) {
                System.out.println(line);   
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }


        //Appending into the 'Java_File3.txt'
        try (FileWriter myWriter = new FileWriter(filePathMyFile3, true)) {
            myWriter.write("\n---Even and Odd Checker---" + "\n");

            System.out.print("\nEnter a number: ");
            Integer num = Integer.parseInt(io.nextLine());

            if (num % 2 == 0) {
                myWriter.write("The " + num + " is EVEN number." + "\n");
            } else {
                myWriter.write("The " + num + " is ODD number." + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File3.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile3))) {
            System.out.println("\nAdding new data in File 3 content: ");
            String line;
            while((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }


        //Appending into the 'Java_File3.txt'
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> sub = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> mul = (x, y) -> x * y;
        BiFunction<Integer, Integer, String> div = (x, y) ->
                y == 0 ? "Error: Cannot divide by zero" : String.valueOf(x / y);
    
        try (FileWriter myWriter = new FileWriter(filePathMyFile3, true)) {
            myWriter.write("\n---Lambda Arithmetic---" + "\n");

            System.out.print("\nEnter first number: ");
            int x = Integer.parseInt(io.nextLine());
            System.out.print("Enter second number: ");
            int y = Integer.parseInt(io.nextLine());

            myWriter.write("Sum: " + add.apply(x, y) + "\n");
            myWriter.write("Difference: " + sub.apply(x, y) + "\n");
            myWriter.write("Product: " + mul.apply(x, y) + "\n");
            myWriter.write("Quotient: " + div.apply(x, y) + "\n");
            
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File3.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile3))) {
            System.out.println("\nAdding new data in File 3 content: ");
            String line;
            while((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }

        
        //Appending into the 'Java_File3.txt'
        try (FileWriter myWriter = new FileWriter(filePathMyFile3, true)) {
            myWriter.write("\n---Age Conditional Logic---" + "\n");

            System.out.print("\nEnter your age: ");
            int age = Integer.parseInt(io.nextLine());
            Supplier<String> status = () ->
                    age < 18 ? "Minor" : age < 60 ? "Adult" : "Senior Citizen";
            myWriter.write("Status: " + status.get() + "\n");
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the file of 'Java_File3.txt' after writing
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile3))) {
            System.out.println("\nAdding new data in File 3 content: ");
            String line;
            while ((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }


        //========================= Here is the starting point of updating the Java_File3.txt =========================
        //Here im just reading and displaying the current content of Java_File3.txt
        StringBuilder currentContentsBuilder = new StringBuilder();

        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile3))) {
            String line;
            while ((line = myReader.readLine()) != null) {
                currentContentsBuilder.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            currentContentsBuilder.append("[File not found - Current content is empty]\n");
        } catch (IOException e) {
            System.out.println("An error occured while reading the current contents: " + e.getMessage());
        }

        System.out.println("\n" + "Current Content of File 3: \n" + currentContentsBuilder.toString());

        //Now here im going to edite and updating the current content of Java_File3.txt
        int[] total = new int[5];
        int number = 0;

        while (number < 5) {
            try {
                System.out.print("\nEnter a number: ");
                String userInput = io.nextLine();
                int n = Integer.parseInt(userInput);
                total[number] = n;
                number++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Only integers are allowed.");
            }
        }

        //Now here the file 3 content is updated, the current content of file 3 is gone, and replace it with new.
        try (FileWriter myWriter = new FileWriter(filePathMyFile3, false)) {
            for (int num : total) {
                myWriter.write(num + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Now here im going to make process of each lines to sum all of them.
        int sumFiles = 0;

        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile3))) {
            String line;
            while ((line = myReader.readLine()) != null) {
                // convert line to integer and add to sum
                sumFiles += Integer.parseInt(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }

        System.out.println("Total of numbers: " + sumFiles);
        System.out.println("\nFile 3 content updated successfully! Go see it!.");

        //Now here im gonna append the sum of all lines into the file3.txt
        try (FileWriter myWriter = new FileWriter(filePathMyFile3, true)) {
            myWriter.write("Total of numbers: " + sumFiles + "\n");
        } catch (IOException e) {
            System.out.println("Error writing sum to file: " + e.getMessage());
        }

        //Appending to the new content 'Java_File3.txt'
        try (FileWriter myWriter = new FileWriter(filePathMyFile3, true)) {
            myWriter.write("\n---Vowels and Consonant Counter---" + "\n");

            System.out.print("\nEnter a word: ");
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

            myWriter.write("-Result-\n");
            myWriter.write("Word: " + word + "\n");
            myWriter.write("Vowels: " + vowelCount + "\n");
            myWriter.write("Consonant: " + consonantCount + "\n");
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the new content of 'Java_File.txt' after appending
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile3))) {
            String line;
            while ((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }

        //Appending to the new content 'Java_File3.txt'
        Random rand = new Random();

        int[] randomNumbers = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = rand.nextInt(100) + 1; // 1 to 100
            sum += randomNumbers[i];
        }

        double average = sum / 10.0;
        
        try (FileWriter myWriter = new FileWriter(filePathMyFile3, true)) {
            myWriter.write("\n---Random Numbers for Math Fun---" + "\n");
            for (int num1 : randomNumbers) {
                myWriter.write(num1 + "\n");
            }
            myWriter.write("Sum of numbers: " + sum + "\n");
            myWriter.write("Average of numbers: " + average);
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading and displaying into the new content of 'Java_File.txt' after appending
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile3))) {
            String line;
            while ((line = myReader.readLine()) != null ) {
                        System.out.println(line);
            }
            System.out.println("==================================================================================================");
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }


        //Here i do simualtion of deleting the file name 'Java_File2.txt', after finishing a simulation of appending and reading in 'Java_File2.txt'.
        //-------------------------------------------  
        String filePath = "Java_File2.txt";  // Path to the file that i want to delete

        File file = new File(filePath); // Create a File object
        
        // Delete the file
        if (file.delete()) {
            System.out.println("\n" + filePath + " - has been deleted successfully!");
        } else {
            System.out.println(filePath + "File does not exist.");
        }
        //-------------------------------------------  

        System.out.println("\nEnd of Simulation. Thank You!");


        //=======================
        //    FINAL MESSAGE
        //=======================
        System.out.println();
        
        try(FileWriter mywWriter = new FileWriter(filePathMyFile1)) {
            for (int i = 0; i < 5; i++) {
                System.out.println("JAVA FILE HANDLING DONE, IT'S NOT EASY BUT I DID THOUGH.");
                mywWriter.write("JAVA FILE HANDLING DONE, IT'S NOT EASY BUT I DID THOUGH." + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        io.close();
    } 
}
