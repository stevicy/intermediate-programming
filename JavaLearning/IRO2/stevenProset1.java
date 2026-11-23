package JavaLearning.IRO2;

import java.util.ArrayList;

public class stevenProset1 {
    public static void main(String[] args) {
        
        //Declared two integer variable
        int num1 = 5;
        int num2 = 15;
        
        //Displaying the value
        System.out.println("First value is " + num1);
        System.out.println("Second value is " + num2);
        
        //If/Else Statement 
        if (num2 > num1) {
            System.out.println("\nThe second value is " + num2 + " and it is greater than the first value, which is " + num1 + ".");
        } else if (num1 < num2) {
            System.out.println("\nThe first value is " + num1 + "and it is less than the second value, which is " + num2 + ".");
        } else {
            System.out.println("\nBoth value is equal.");
        }
        
        System.out.println();
        
        //ArrayList in Java
        //here it means your declaring an ArrayList of Integer objects called number, and you're initializing it as a new empty ArrayList.
        ArrayList<Integer> number = new ArrayList<>();
        number.add(num1);
        number.add(num2);
        System.out.println(number);
        //append 
        number.add(2);
        System.out.println("After append: " + number);
        //insert
        number.add(1,12);
        System.out.println("After insert: " + number);
        //extend 
        number.add(17);
        number.add(7);
        number.add(22);
        number.add(25);
        System.out.println("After extend: " + number);
        System.out.println();
        
        //Indexing - accessing elements
        System.out.println("Elements index at 0: " + number.get(0));
        System.out.println("Elements index at 3: " + number.get(3));
        System.out.println("Elements index at 5: " + number.get(5));
        
       //Looping - for loop display the elements
       System.out.println("\nThe numbers in the list are: ");
       for (int n : number) {
           System.out.println(n);
       }
       
      //Ternary Operator
      int max_num = (num1 > num2) ? num1 : num2;
      System.out.println("\nThe larger value is: " + max_num);
      
 }
}