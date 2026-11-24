import java.util.Scanner;

public class Sim2Probset1OOP {

    public static void main(String[] args) {

        Sim1Probset1OOP.Moves moveSystem = new Sim1Probset1OOP.Moves();
        Sim1Probset1OOP.WinnerSystem winnerSystem = new Sim1Probset1OOP.WinnerSystem(moveSystem);

        int userWins = 0;
        int computerWins = 0;

        Scanner io = new Scanner(System.in);

        System.out.println("===== 'MMA Fighters RPSLS Game' (OOP Version) =====");

        while (true) {
            System.out.println("\n-----------------------------");
            System.out.println("Choices:");
            for (int i = 0; i < moveSystem.getMoves().length; i++) {
                System.out.println(i + " - " + moveSystem.getMoveByIndex(i));
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
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer!");
                continue;
            }

            String playerChoice = moveSystem.getMoveByIndex(choice);
            String computerChoice = moveSystem.getRandomMove();

            String result = winnerSystem.determineWinner(playerChoice, computerChoice);

            System.out.println("\nYou chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + result);

            if (result.contains("You WIN")) {
                userWins++;
            } else if (result.contains("Computer WIN")) {
                computerWins++;
            } 

            System.out.print("\nPlay again? (yes/no): ");
            String again = io.nextLine().toLowerCase();
            if (!again.equals("yes")) break;
        }

        System.out.println("\n===== FINAL RESULT =====");
        if (userWins > computerWins) {
            System.out.println("OVERALL WINNER: PLAYER");
        } else if (computerWins > userWins) {
            System.out.println("OVERALL WINNER: COMPUTER");
        } else {
            System.out.println("OVERALL RESULT: TIE");
        }

        System.out.println("\nThanks for playing!");
        io.close();
    }
}
