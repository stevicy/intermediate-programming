
import java.util.HashMap;
import java.util.ArrayList;

public class MethodswithMutableImmutable {
    
    // ====================
    //    'MY MESSAGE'
    // ====================

    static String message(String message) {
        return message;
    }

    // ===============================================
    //   'MY PROFILE' (Mutable Collection: HashMap)
    // ===============================================

    static void hashMapProfileMutable() {
        HashMap<String, Object> profile = new HashMap<>();
        profile.put("Name", "Steven");
        profile.put("Age", 20);
        profile.put("Course", "BSIT");
        

        System.out.println("\n--- My Profile ---");
        System.out.println("Name: " + profile.get("Name"));
        System.out.println("Age: " + profile.get("Age"));
        System.out.println("Course: " + profile.get("Course"));

        

        // Update (mutable behavior)
        profile.put("Status", "Student");
        System.out.println("Status: " + profile.get("Status"));
    }

    // =================================
    //      MY PERSONALITY (Mutable)
    // =================================

    static void listPersonalityMutable() {
        ArrayList<String> traits = new ArrayList<>();
        traits.add("Patient");
        traits.add("Humble");
        traits.add("God-fearing");

        System.out.println("\n--- My Personality ---");
        for (String t : traits) {
            System.out.println("- " + t);
        }

         // Add new traits (mutable simulation)
        System.out.println("\n--- Adding elements to my personality: ---");
        traits.add("Caring");
        traits.add("Strong");
        traits.add("Resilient");
        traits.add("Calm");

        for (String updatedTraits : traits) {
            System.out.println("- " + updatedTraits);
        }
    }

    // ============================
    //   MY SPORTS (Mutable)
    // ============================

    static void runSports() {
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Gym");
        sports.add("Cycling");
        sports.add("Running");
        sports.add("Muay-Thai");

        System.out.println("\n--- My Sports ---");
        for (String s : sports) {
            System.out.println("- " + s);
        }

        System.out.println("\n-- Selecting Sports: --");
        for (String s : sports) {
            if (s.equals("Muay-Thai")) {
                System.out.println(s + " it is! Time to unleash the warrior within");
            } else {
                System.out.println("Skipping " + s + " not vibes today");
            }
        }

    }

    static void fightersMMA() {
        ArrayList<String> fighter = new ArrayList<>();
        fighter.add("Max Halloway");
        fighter.add("Dustin Porier");

        System.out.println("\n--- Fight Card Setup ---");
        System.out.println(fighter);
        System.out.println("\n" + fighter.get(0) + " v.s " + fighter.get(1));

        // Remove Dustin Porier
        fighter.remove("Dustin Porier");
        System.out.println(fighter + " - winner.");

        // Insert Conor McGregor at index 0
        fighter.add(0, "Conor McGregor");
        System.out.println("\n" + fighter);
        System.out.println("\n" + fighter.get(0) + " v.s " + fighter.get(1));

        // Remove Max Halloway
        fighter.remove("Max Halloway");
        System.out.println(fighter + " - winner.");

        // Fight card breakdown
        System.out.println("\n--- Fight Card Breakdown ---");
        for (String winner : fighter) {
            if (winner.equals("Conor McGregor")) {
                System.out.println(winner + " is the main event.");
                System.out.println("Winner " + winner + " by knockout in Round 2!");
            } else {
                System.out.println(winner + " is on the Prelims.");
            }
        }
    }

    // =====================================================
    //  IMMUTABLE SIMULATION (Strings & Primitive Values)
    // =====================================================

    static void immutableSim() {
        System.out.println("\n------ Integer and Double Immutable Simulation --- ---");

        // Integer and double are immutable
        int age = 20;
        double height = 163.0;

        System.out.println("Original age: " + age);
        System.out.println("Original height: " + height);

        // These create new values, not modifying the original directly
        age += 1;
        height += 0.5;

        System.out.println("\nUpdating values (create new ones):");
        System.out.println("New Age (After update): " + age);
        System.out.println("New Height (After update): " + height);

        // Strings are immutable
        System.out.println("\n--- String Immutable Simulation ---");
        String name = "Steven";
        System.out.println("Original name: " + name);
        String fullName = name + " Payapaya"; // creates new string
        System.out.println("Combined name: " + fullName);

        System.out.println("\nEnd of Simulation. Thank You!");
        System.out.println();
    }

    // ======================
    //   FINAL MESSAGE
    // ======================

    static void closingMessage() {
        for (int i = 0; i < 3; i++) {
            System.out.println("JAVA METHODS/FUNCITON WITH MUTABLE AND IMMUTABLE DONE, IT'S NOT EASY BUT I DID THOUGH.");
        }
     }


    // ======================
    // MAIN PROGRAM
    // ======================

    public static void main(String[] args) {
        System.out.println("===== 'Methods and Functions with Mutable and Immutable Collections' =====");
        String result = message("Hello! this is my final term of programming simulation. Its's getting tough you know.");
        System.out.println("\nMy message: " + result);
        

        // === Calling the functions immediately after input ===
        message("Hello! This is my final term of programming simulation. It's getting tough you know.");
        hashMapProfileMutable();
        listPersonalityMutable();
        runSports();
        fightersMMA();
        immutableSim();
        closingMessage();

    }
}



