import java.util.Random;

public class Sim1Probset1OOP {

    // ===========================
    // Moves class
    // ===========================
    public static class Moves {
        private String[] moves;

        // Default constructor
        public Moves() {
            this.moves = new String[] {
                "Conor McGregor (Punch)",
                "Khabib Nurmagomedov (Takedown)",
                "Dustin Poirier (Kicks)",
                "Alex Pereira (Elbow)",
                "Jon Jones (Choke)"
            };
        }

        // Getter
        public String[] getMoves() {
            return moves;
        }

        // Setter
        public void setMoves(String[] moves) {
            this.moves = moves;
        }

        public String getMoveByIndex(int index) {
            return moves[index];
        }

        public String getRandomMove() {
            Random rand = new Random();
            return moves[rand.nextInt(moves.length)];
        }

        public int getMoveValue(String move) {
            for (int i = 0; i < moves.length; i++) {
                if (moves[i].equals(move)) {
                    return i;
                }
            }
            return -1; // should never happen
        }
    }

    // ===========================
    // WinnerSystem class
    // ===========================
    public static class WinnerSystem {
        private Moves moves;

        // Constructor
        public WinnerSystem(Moves moves) {
            this.moves = moves;
        }

        // Getter
        public Moves getMoves() {
            return moves;
        }

        // Setter
        public void setMoves(Moves moves) {
            this.moves = moves;
        }

        public String determineWinner(String playerChoice, String computerChoice) {
            int p = moves.getMoveValue(playerChoice);
            int c = moves.getMoveValue(computerChoice);

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

            return "Unexpected Result!";
        }
    }
}
