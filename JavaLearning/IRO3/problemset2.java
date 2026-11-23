package JavaLearning.IRO3;

import java.util.Scanner;
import java.util.HashMap;

public class problemset2 {
    public static void main (String[] args) {
        Scanner io = new Scanner(System.in);
        
       System.out.println("Enter your name: "); //Steven 
       String name = io.nextLine();
       System.out.println("Number of letter: " + name.length());
       
       HashMap<Integer, String> nw = new HashMap<> ();
       
       nw.put(19, "S");
       nw.put(20, "t");
       nw.put(5, "e");
       nw.put(22, "v");
       nw.put(5,"e");
       nw.put(14, "n");
       
       System.out.println("Mapped letter: " + nw);
       
       io.close();
        
    }
}

