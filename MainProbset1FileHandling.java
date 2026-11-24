import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainProbset1FileHandling {
    public static void main(String[] args) {
        
        final String filePathMyFile1 = "Java_Probset1FileHandling.txt";
        Scanner io = new Scanner(System.in);

        //Writing
        try(FileWriter myWrriter = new FileWriter(filePathMyFile1, true)) {
            myWrriter.write("---My Personality---\n");
            String personality = "";

            for (int i = 0; i < 3; i++) {
                System.out.println("\nEnter my personality: ");
                personality = io.nextLine();
                myWrriter.write(personality + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        System.out.println();

        //Reading
        try(BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile1))) {
            System.out.println(myReader.readLine());
            String line;

            while((line = myReader.readLine()) != null) {
                System.out.println(line);     
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }

        //Appending
        String[] my_sports = {"Gym", "Muay-Thai", "Cycling", "Running"};

        try(FileWriter myWriter = new FileWriter(filePathMyFile1, true)) {
            myWriter.write("\n---My Sports---\n");      
            for (String s : my_sports) {
                myWriter.write(s + "\n");
            }

            myWriter.write("\n---Selecting Sports---\n");
            for (String sp : my_sports) {
                if (sp.equals("Muay-Thai")) {
                    myWriter.write(sp + " It is! Time to unleash the warrior within.\n");
                } else {
                    myWriter.write("Skipping " + sp + ". Not vibes today.\n");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        //Reading
        System.out.println("\nAdding new data in Java_Probset1FileHandling.txt: ");
        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile1))) {
            String line;
            
            while ((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }

        //Updating (Overwrite old content)
        StringBuilder currentFile = new StringBuilder();

        try (BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile1))) {
            String line;
            while ((line = myReader.readLine()) != null) {
                currentFile.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            currentFile.append("[File not found - Current content is empty]\n");
        } catch (IOException e) {
            System.out.println("An error occured while reading the current contents: " + e.getMessage()); 
        }
        System.out.println("\nCurrent content in Java_Probset1FileHandling.txt: \n" + currentFile.toString());

        // Input number
        System.out.print("\nEnter a number: ");
        int num_1 = Integer.parseInt(io.nextLine());
        
        try (FileWriter myWriter = new FileWriter(filePathMyFile1, false)) {
            myWriter.write("---Even and Odd Checker---\n");

            if (num_1 % 2 == 0) {
                myWriter.write("The " + num_1 + " is EVEN number.\n");
            } else {
                myWriter.write("The " + num_1 + " is ODD number.\n");
            }
        } catch (IOException e) {
            System.out.println("An error occured during file writing: " + e.getMessage());
        }

        System.out.println();
        try(BufferedReader myReader = new BufferedReader(new FileReader(filePathMyFile1))) {
            String line;
            while ((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\nJava_Probset1FileHandling.txt content updated successfully! Go see it!");
        } catch (IOException e) {
            System.out.println("An error occured during file reading: " + e.getMessage());
        }

        System.out.println("\nEnd of Simulation. Thanks!");

        io.close();
    } 
}
