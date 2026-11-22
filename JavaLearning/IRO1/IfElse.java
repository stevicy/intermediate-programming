public class IfElse {
	public static void main(String[] args) {  
	   
	   //The if Statement
	   int s = 77;
       int p = 75;
       if (s > p) {
            System.out.println("s is greater than p");
}

       //The else Statement
       System.out.println();
       int score = 85;
       if (score >= 90) {
            System.out.println("Excellent performance!");
       } else {
            System.out.println("Good job, keep improving!");
}

       //The else if Statement
       System.out.println(); 
       int temperature = 30;
       if (temperature < 15) {
            System.out.println("It's cold outside.");
       } else if (temperature < 25) {
           System.out.println("The weather is nice.");
       } else {
            System.out.println("It's hot today.");
}

       //Short Hand if...else
       System.out.println();
       int marks = 75;
       String result = (marks >= 50) ? "You passed!" : "You failed.";
       System.out.println(result);
       
       //Real-Life Examples
       System.out.println();
       int membershipId = 2025;
       if (membershipId == 2025) {
           System.out.println("Welcome! Your gym membership is active.");
       } else {
           System.out.println("Invalid membership ID. Access denied.");
}

      
	}
}