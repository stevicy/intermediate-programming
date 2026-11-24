import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class MainProbset2FileHandling {

    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);  
        Random rand = new Random();

        String[] moves = {
            "Conor McGregor (Punch)",         // Rock
            "Khabib Nurmagomedov (Takedown)", // Paper
            "Dustin Poirier (Kicks)",         // Scissors
            "Alex Pereira (Elbow)",           // Lizard
            "Jon Jones (Choke)"               // Spock
        };

        int userWins = 0;
        int computerWins = 0;

        final String roundFile = "Java_Probset2File1.txt";   
        final String overallFile = "Java_Probset2File2.txt";

        System.out.println("===== 'MMA Fighters RPSLS Game' =====");

        while(true) {
            System.out.println("\n-----------------------------");
            System.out.println("Choices:");
            for (int i = 0; i < moves.length; i++) {
                System.out.println(i + " - " + moves[i]);
            }
            System.out.println("-----------------------------");

            int choice;
            try {
                System.out.print("Enter your choice (0-4): ");
                choice = Integer.parseInt(io.nextLine());
                if (choice < 0 || choice > 4) {
                    System.out.println("Invalid choice! Try again.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid integer.");
                continue;
            }

            String playerChoice = moves[choice];
            String computerChoice = moves[rand.nextInt(5)];

            String result = determineWinner(playerChoice, computerChoice);

            System.out.println("\nYou chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + result);

            // Save round result immediately
            try {
                FileWriter fw = new FileWriter(roundFile, true); // append mode
                fw.write("Player: " + playerChoice + " | Computer: " + computerChoice + " | " + result + "\n");
                fw.close();
            } catch(IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

            // Count wins
            if (result.contains("You WIN")) {
                userWins++;
            } else if (result.contains("Computer WIN")) {
                computerWins++;
            }

            System.out.print("\nPlay again? (yes/no): ");
            String again = io.nextLine().toLowerCase();
            if (!again.equals("yes")) {
                break;
            }
        }

        // Determine overall winner
        String overall;
        if (userWins > computerWins) {
            overall = "OVERALL WINNER: PLAYER";
        } else if (computerWins > userWins) {
            overall = "OVERALL WINNER: COMPUTER";
        } else {
            overall = "OVERALL RESULT: TIE";
        }

        // Save overall winner
        try {
            FileWriter fw = new FileWriter(overallFile); // overwrite
            fw.write(overall);
            fw.close();
        } catch(IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("\nThanks for playing!");
        System.out.println("\nRound results saved to " + roundFile);
        System.out.println("Overall result saved to " + overallFile);

        io.close();
    }

    public static String determineWinner(String player, String computer) {
        int p = 0; 
        int c = 0;

        switch(player) {
            case "Conor McGregor (Punch)": p = 0; break;
            case "Khabib Nurmagomedov (Takedown)": p = 1; break;
            case "Dustin Poirier (Kicks)": p = 2; break;
            case "Alex Pereira (Elbow)": p = 3; break;
            case "Jon Jones (Choke)": p = 4; break;
        }

        switch(computer) {
            case "Conor McGregor (Punch)": c = 0; break;
            case "Khabib Nurmagomedov (Takedown)": c = 1; break;
            case "Dustin Poirier (Kicks)": c = 2; break;
            case "Alex Pereira (Elbow)": c = 3; break;
            case "Jon Jones (Choke)": c = 4; break;
        }

        if (p == c) return "It's a Tie!";

        // USER WIN
        if (p==2 && c==1) return "Dustin Poirier kicks Khabib Nurmagomedov. You WIN!";
        if (p==1 && c==0) return "Khabib Nurmagomedov takes down Conor McGregor. You WIN!";
        if (p==0 && c==3) return "Conor McGregor punches Alex Pereira. You WIN!";
        if (p==3 && c==4) return "Alex Pereira elbows Jon Jones. You WIN!";
        if (p==4 && c==2) return "Jon Jones chokes Dustin Poirier. You WIN!";
        if (p==2 && c==3) return "Dustin Poirier kicks Alex Pereira. You WIN!";
        if (p==3 && c==1) return "Alex Pereira elbows Khabib Nurmagomedov. You WIN!";
        if (p==1 && c==4) return "Khabib Nurmagomedov takes down Jon Jones. You WIN!";
        if (p==4 && c==0) return "Jon Jones chokes Conor McGregor. You WIN!";
        if (p==0 && c==2) return "Conor McGregor punches Dustin Poirier. You WIN!";

        // COMPUTER WIN
        if (c==2 && p==1) return "Dustin Poirier kicks Khabib Nurmagomedov. Computer WIN";
        if (c==1 && p==0) return "Khabib Nurmagomedov takes down Conor McGregor. Computer WIN";
        if (c==0 && p==3) return "Conor McGregor punches Alex Pereira. Computer WIN";
        if (c==3 && p==4) return "Alex Pereira elbows Jon Jones. Computer WIN";
        if (c==4 && p==2) return "Jon Jones chokes Dustin Poirier. Computer WIN";
        if (c==2 && p==3) return "Dustin Poirier kicks Alex Pereira. Computer WIN";
        if (c==3 && p==1) return "Alex Pereira elbows Khabib Nurmagomedov. Computer WIN";
        if (c==1 && p==4) return "Khabib Nurmagomedov takes down Jon Jones. Computer WIN";
        if (c==4 && p==0) return "Jon Jones chokes Conor McGregor. Computer WIN";
        if (c==0 && p==2) return "Conor McGregor punches Dustin Poirier. Computer WIN";

        return "Unexpected result!";
    }
}
