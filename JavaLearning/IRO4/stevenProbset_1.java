package JavaLearning.IRO4;

public class stevenProbset_1 {
    public static void main(String [] args) {
        
        int[] list = {2,5,7};
        try {
            System.out.println(list[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index out of range. \n");
        }
        
        int[] n = {5,7};
        try {
            int result = n[0] + n[1];
            System.out.println("The sum is: " + result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Indexing error.");
        }
        
        try {
            int n1 = 10;
            int n2 = 0;
            int n3 = n1 / n2;
            System.out.println(n3);
        }catch(ArithmeticException e){
            System.out.println("\nCannot divide by zero.");
        }catch (Exception e){
            System.out.println("Some other error happend.");
        }finally{
            System.out.println("This blocks always run.");
            System.out.println("Division attempt complete.");
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println("Number: " + i);
            }catch(Exception e){
                System.out.println("Looping error.");
            }
        }
        System.out.println();
        
        int count = 0;
        while (count < 5) {
            try{
                System.out.println("Number: " + count);
                count++;
            }catch(Exception e){
                System.out.println("While loop error.");
            }
        }
        
    }
}