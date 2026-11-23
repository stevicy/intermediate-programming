package JavaLearning.IRO2;

import java.util.Scanner;

public class stevenProbset2 {
    public static void main(String[] args) {
        
        Scanner io = new Scanner(System.in);

        // Prompt user to input a name
        System.out.print("Enter your name: ");
        String name = io.nextLine();

        int vowel_count = 0;

        
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i); 
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowel_count++;
            }
        }

        System.out.println("\nThe number of vowels in your name is: " + vowel_count);

        // Input numbers based on vowel count
        int total = 0;
        System.out.println("\n====You will prompt to input a numbers " + vowel_count + "times.====");
        for (int i = 0; i < vowel_count; i++) {
            System.out.print("Enter a number: ");
            total += io.nextInt();
        }

        // Check even or odd using floor division
        if ((total / 2) * 2 == total) {
            System.out.println("\nThe sum is EVEN.");
        } else {
            System.out.println("\nThe sum is ODD.");
        }

        io.close();
    }
}
