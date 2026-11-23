package JavaLearning.IRO4;

import java.util.Scanner;

class TooYoungError extends Exception {
    public TooYoungError(String message) {
        super(message);
    }
}

class TooOldError extends Exception {
    public TooOldError(String message) {
        super(message);
    }
}

class NegativeFeeError extends Exception {
    public NegativeFeeError(String message) {
        super(message);
    }
}

public class stevenCustomException {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        
        System.out.println("=== GYM REGISTRATION SIMULATION ('Custom Exceptions') ===\n");
        System.out.println("Welcome to Peak Gym Cabadbaran Branch!");
        System.out.println("Please follow the rules before entering.");
        System.out.println("--------------------------------------------------------\n");

        int count = 0;

        while (count < 5) {
            try {
                System.out.println("=== Registration Attempt: " + (count + 1) + " ===\n");

                // Ask user age
                System.out.print("Enter your age: ");
                int age = io.nextInt();

                // Age checks
                if (age < 0) {
                    throw new TooYoungError("Age cannot be negative oy!");
                }
                if (age < 16) {
                    throw new TooYoungError("Sorry, you are too young. Dili pa allowed sa gym if below 16.");
                }
                if (age > 60) {
                    throw new TooOldError("Too old na, risky for seniors to workout.");
                }

                System.out.println("Age accepted. Pwede na ka mag-register.\n");

                // Ask user fee
                System.out.print("Enter membership fee payment: ");
                int fee = io.nextInt();

                // Fee checks
                if (fee < 0) {
                    throw new NegativeFeeError("Negative payment? Dili pwede oy!");
                }
                if (fee < 500) {
                    System.out.println("Too small ang bayad, minimum 500 required.");
                } else if (fee > 5000) {
                    System.out.println("Too big ang payment, maximum 5000 only.");
                } else {
                    System.out.println("Fee accepted. Welcome to Peak Gym!\n");
                }

                // Switch for special promos
                switch (fee) {
                    case 1000:
                        System.out.println("Promo: Free water bottle with â‚±1000 fee.");
                        break;
                    case 1500:
                        System.out.println("Promo: Free gloves with â‚±1500 fee.");
                        break;
                    case 2000:
                        System.out.println("Promo: Free gym bag with â‚±2000 fee.");
                        break;
                    case 3000:
                        System.out.println("Promo: Free 1-month personal trainer with â‚±3000 fee.");
                        break;
                    case 4000:
                        System.out.println("Promo: Free Peak Gym jacket with â‚±4000 fee.");
                        break;
                    case 5000:
                        System.out.println("Promo: VIP access + all freebies at â‚±5000!");
                        break;
                    default:
                        System.out.println("Normal membership fee, no promo this time.");
                }

                System.out.println("Thank you for choosing Peak Gym!");
                System.out.println("Stay strong and healthy always.\n");

            } catch (TooYoungError e) {
                System.out.println("Custom Exception Caught: " + e.getMessage() + "\n");
            } catch (TooOldError e) {
                System.out.println("Custom Exception Caught: " + e.getMessage() + "\n");
            } catch (NegativeFeeError e) {
                System.out.println("Custom Exception Caught: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.\n");
                io.nextLine(); // clear invalid input
            } finally {
                System.out.println("Registration " + (count + 1) + " done.");
                System.out.println("----------------------------\n");
                count++;
            }
        }

        // Summary
        System.out.println("=== SUMMARY REPORT ===");
        System.out.println("Total Registrations Processed: " + count);
        System.out.println("Thank you to all who registered.");
        System.out.println("Peak Gym Cabadbaran - Fitness for All Ages (16 to 60).");
        System.out.println("--------------------------------------------------------\n");

        for (int m = 0; m < 3; m++) {
            System.out.println("CUSTOM EXCEPTION DONE, NOT EASY THOUGH BUT I DID IT.\n");
        }

        System.out.println("=== END OF PROGRAM ===");
        System.out.println("=========================================================");
        io.close();
    }
}
