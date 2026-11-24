package Probset2Package;

import java.util.HashMap;

public class GameRules {

    // Stores move names with numbers
    public static HashMap<String, Integer> moves = new HashMap<>(); 

    static {
        moves.put("Conor McGregor (Punch)", 0); 
        moves.put("Khabib Nurmagomedov (TaKedown)", 1);
        moves.put("Dustin Poirier (Kicks)", 2);
        moves.put("Alex Pereira (Elbow)", 3);
        moves.put("Jon Jones (Choke)", 4);
    }

    // Decides who wins
    public static String getWinner(String playerMove, String computerMove) {
        int p = moves.get(playerMove);
        int c = moves.get(computerMove);
        
        // If they have both the same choice it's a then here execution is a Tie.
        if (p == c) {
            return "It's a Tie!";
        }
        
        //------------------------------
        // Scissors(2) beats Paper(1)
        // Paper(1) beats Rock(0)
        // Rock(0) beats Lizard(3)
        // Lizard(3) beats Spock(4)
        // Spock(4) beats Scissors(2)
        // Scissors(2) beats Lizard(3)
        // Lizard(3) beats Paper(1)
        // Paper(1) beats Spock(4)
        // Spock(4) beats Rock(0)
        // Rock(0) beats Scissors(2)
        //------------------------------

        // USER WIN CONDITIONS
        else if (p == 2 && c == 1) return "Dustin Poirier kicks Khabib Nurmagomedov. You WIN!";
        else if (p == 1 && c == 0) return "Khabib Nurmagomedov takes down Conor McGregor. You WIN!";
        else if (p == 0 && c == 3) return "Conor McGregor punches Alex Pereira. You WIN!";
        else if (p == 3 && c == 4) return "Alex Pereira elbows Jon Jones. You WIN!";
        else if (p == 4 && c == 2) return "Jon Jones chokes Dustin Poirier. You WIN!";
        else if (p == 2 && c == 3) return "Dusitn Poirier kicks Alex Pereira. You WIN!";
        else if (p == 3 && c == 1) return "Alex Pereira elbows Khabib Nurmagomedov. You WIN!";
        else if (p == 1 && c == 4) return "Khabib Nurmagomedov takes down Jon Jones. You WIN!";
        else if (p == 4 && c == 0) return "Jon Jones chokes Conor McGregor. You WIN!";
        else if (p == 0 && c == 2) return "Conor McGregor punches Dustin Poirier. You WIN!";

        // COMPUTER WIN CONDITIONS (reversed)
        else if (c == 2 && p == 1) return "Dustin Poirier kicks Khabib Nurmagomedov. Computer WIN";
        else if (c == 1 && p == 0) return "Khabib Nurmagomedov takes down Conor McGregor. Computer WIN";
        else if (c == 0 && p == 3) return "Conor McGregor punches Alex Pereira. Computer WIN";
        else if (c == 3 && p == 4) return "Alex Pereira elbows Jon Jones. Computer WIN";
        else if (c == 4 && p == 2) return "Jon Jones chokes Dustin Poirier. Computer WIN";
        else if (c == 2 && p == 3) return "Dustin Poirier kicks Alex Pereira. Computer WIN";
        else if (c == 3 && p == 1) return "Alex Pereira elbows Khabib Nurmagomedov. Computer WIN";
        else if (c == 1 && p == 4) return "Khabib Nurmagomedov takes down Jon Jones. Computer WIN";
        else if (c == 4 && p == 0) return "Jon Jones chokes Conor McGregor. Computer WIN";
        else if (c == 0 && p == 2) return "Conor McGregor punches Dustin Poirier. Computer WIN";

        else {
            return "Unexpected result!";
        }
    }
}

