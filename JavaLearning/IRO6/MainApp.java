import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Probset2Package.GameRules;

public class MainApp {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner io = new Scanner(System.in);

        System.out.println("===== 'MMA Fighthers Game' =====");
        
        ArrayList<String> options = new ArrayList<>(GameRules.moves.keySet());

        System.out.println("\n-----------------------------");
        System.out.println("Choices:");
        System.out.println("0 - Conor McGregor (Punch)");
        System.out.println("1 - Khabib Nurmagomedov (Takedown)");
        System.out.println("2 - Dustin Poirier (Kicks)");
        System.out.println("3 - Alex Pereira (Elbow)");
        System.out.println("4 - Jon Jones (Choke)");
        System.out.println("-----------------------------");

        System.out.println("\n-----------------------------");
        System.out.print("Enter your choice (0-4): ");
        int choice;

        try {
            choice = Integer.parseInt(io.nextLine());
        } catch (Exception e) {
            System.out.println("Error: Please enter a integer number only.");
            io.close();
            return;
        }

        if (choice < 0 || choice >= options.size()) {
            System.out.println("Invalid choice! Try again.");
            io.close();
            return;
        }

        String playerMove = options.get(choice);
        String computerMove = options.get(rand.nextInt(options.size()));

        System.out.println("\nYou chose : " + playerMove);
        System.out.println("Computer chose : " + computerMove);

        String result = GameRules.getWinner(playerMove, computerMove);
        System.out.println("\nResult: " + result);
        System.out.println("-----------------------------");

        io.close();
    }
}
