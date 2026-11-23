package JavaLearning.IRO2;

class Learner {
    public int id;
    public String fullName;

    Learner(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
}

public class stevenArrays {
    public static void main(String[] args) {

        // === PART 1: Using % operator to check even/odd ===
        int[] arr = {2, 5, 7, 12, 15, 17};

        System.out.println("=== Checking even/odd with % ===");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print("Number: " + num + " is ");
            if (num % 2 == 0) {
                System.out.println("even.");
            } else {
                System.out.println("odd.");
            }
        }

        System.out.println();

        // === PART 2: Using floor division to check even/odd ===
        int[] arr1 = {3, 7, 10, 21, 28, 33};

        System.out.println("=== Checking even/odd using floor division ===");
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            int half = num / 2;

            if (half * 2 == num) {
                System.out.println("Element at index " + i + " : " + num + " is even");
            } else {
                System.out.println("Element at index " + i + " : " + num + " is odd");
            }
        }

        System.out.println();

        // === PART 3: Working with Learner objects ===
        Learner[] learners = {
            new Learner(101, "Alice"),
            new Learner(202, "Bob"),
            new Learner(303, "Charlie"),
            new Learner(404, "Diana"),
            new Learner(505, "Ethan")
        };

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("=== Learner Details ===");
        for (Learner learner : learners) {
            System.out.println("Learner: " + learner.fullName + " (ID: " + learner.id + ")");

            int half = learner.id / 2;
            if (half * 2 == learner.id) {
                System.out.println("→ ID is EVEN");
                evenCount++;
            } else {
                System.out.println("→ ID is ODD");
                oddCount++;
            }

            System.out.println();
        }

        // Summary
        System.out.println("=== Summary ===");
        System.out.println("Total learners: " + learners.length);
        System.out.println("Even IDs: " + evenCount);
        System.out.println("Odd IDs: " + oddCount);

        System.out.println();

        // === PART 4: Total score calculator ===
        int[] scores = {12, 18, 25, 7, 10};
        displayTotal(scores);
    }

    public static void displayTotal(int[] scores) {
        int total = 0;

        for (int score : scores) {
            total += score;
        }

        System.out.println("Total score: " + total);
        System.out.println();
        
       int y5 = 0;
       int maxCount = 5;  // You can change this number as needed

        while (y5 < maxCount) {
            System.out.println("JAVA ARRAYS DONE, ITS NOT EASY BUT I DID IT THOUGH.");
            if (y5 == 2) {
                break;
            }
            y5++;
        }
        
    }
}