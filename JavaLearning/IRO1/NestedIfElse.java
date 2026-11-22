 public class NestedIfElse {
	public static void main(String[] args) {  
	  
	  //If else:
	  int number = 7;

        if (number % 2 == 0) {
            // For true case: number is divisible by 2
            System.out.println("The number is even.");
        } else {
            // For false case: number is not divisible by 2
            System.out.println("The number is odd.");
        }
        
     //Nested if else statements:
     System.out.println();
      int memberId = 1004;

        // Check if member ID is even or odd
        if (memberId % 2 == 0) {
            System.out.print("Your ID is even ");

            // Nested check: is it a premium member (divisible by 4)?
            if (memberId % 4 == 0) {
                System.out.println("and you're a Premium Member! ");
            } else {
                System.out.println("but not a Premium Member.");
            }
        } else {
            System.out.println("Your ID is odd ");

            // Nested check: is it a special guest ID (divisible by 5)?
            if (memberId % 5 == 0) {
                System.out.println("and you're a Special Guest! ");
            } else {
                System.out.println("and just a Regular Visitor.");
            }
        }

     //Find the Highest Scoring Athlete using Nested If-Else:
     System.out.println();
     int scoreA = 85, scoreB = 92, scoreC = 88;

        if (scoreA >= scoreB) {
            if (scoreA >= scoreC)
                System.out.println("Athlete A has the highest score: " + scoreA);
            else
                System.out.println("Athlete C has the highest score: " + scoreC);
        } else {
            if (scoreB >= scoreC)
                System.out.println("Athlete B has the highest score: " + scoreB);
            else
                System.out.println("Athlete C has the highest score: " + scoreC);
        }

        System.out.println("\nCompetition complete!");
        
        
    //Determine if Three Items Have the Same Weight (Nested Conditions)
    System.out.println();
    int box1 = 10;
    int box2 = 10;
    int box3 = 12;
    
    if (box1 == box2) {
        // Check if all three boxes are the same weight
    if (box1 == box3) {
        System.out.println("All boxes have the same weight.");
    } else {
        System.out.println("Two boxes are the same, one is different.");
    }
    } else {
    System.out.println("Boxes have different weights.");
}

      
	}
}
