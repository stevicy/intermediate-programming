package JavaLearning.IRO2;

import java.util.ArrayList;

public class stevenArraylist {
    public static void main(String[] args) {

        // Budget checking for item prices
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(40);
        prices.add(25);
        prices.add(60);

        int budget = 50;

        System.out.println("--- Shopping Decisions ---");
        for (int p : prices) {
            if (p <= budget) {
                System.out.println("Buy: $" + p);
            } else {
                System.out.println("Too expensive: $" + p);
            }
        }

        System.out.println("\n--- Fight Card Setup ---");
        ArrayList<String> card = new ArrayList<>();
        card.add("Max Holloway");
        card.add("Justin Gaethje");
        System.out.println(card);

        card.add(1, "Dustin Poirier");
        System.out.println(card);

        card.remove(0); // Remove Max
        System.out.println(card);

        card.remove("Justin Gaethje"); // Remove Justin
        System.out.println(card);

        card.set(0, "Dustin Poirier"); // Make Dustin Poirier the main event
        System.out.println(card);

        System.out.println("\n--- Fight Card Breakdown ---");
        for (String fighter : card) {
            if (fighter.equals("Dustin Poirier")) {
                System.out.println(fighter + " is in the Main Event.");
                System.out.println("Winner: " + fighter + " by knockout in Round 2!");
            } else {
                System.out.println(fighter + " is on the Prelims.");
            }
        }

        System.out.println("\n--- Sport Selection ---");
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Gym");
        sports.add("Cycling");
        sports.add("Running");
        sports.add("Muay Thai");

        for (String sport : sports) {
            if (sport.equals("Muay Thai")) {
                System.out.println("Muay Thai it is! Time to unleash the warrior within.");
            } else {
                System.out.println("Skipping " + sport + ". Not the vibe today.");
            }
        }

        System.out.println("\n--- Weekly Muay Thai Training Plan ---");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : days) {
            if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.println(day + ": Rest day. Recharge and recover.");
            } else {
                System.out.println(day + ": Muay Thai training scheduled.");
            }
        }

        System.out.println("\n--- Shadowboxing Rounds ---");
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round " + round + ": 3 minutes of shadowboxing.");
        }

        System.out.println("\n--- Kicks Practice ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Kick " + i + ": Right Roundhouse");
            } else {
                System.out.println("Kick " + i + ": Left Roundhouse");
            }
        }

        System.out.println("\n--- Combo Drills ---");
        String[] combos = {"Jab-Cross", "Teep-Cross", "Elbow-Knee", "Jab-Jab-Kick", "Clinch-Knee-Elbow"};
        for (String combo : combos) {
            System.out.println("Practice combo: " + combo);
        }

        System.out.println("\n--- End of Training ---");
        System.out.println();
        
        for (int i = 1; i <= 3; i++) {
    System.out.println("JAVA ARRAYLIST DONE, ITS NOT EASY THOUGH BUT I DID IT.");
}

    }
}