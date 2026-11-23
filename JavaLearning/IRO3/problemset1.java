package JavaLearning.IRO3;

import java.util.HashSet;

public class problemset1 {
    public static void main (String[] args) {
        // My set of Lifting Weight
        HashSet<Integer> set_2 = new HashSet<> ();
        set_2.add(140);
        set_2.add(150);
        set_2.add(200);
        set_2.add(80);
        
        System.out.println("My ideal lifting weight set: " + set_2);
        System.out.println("How many weight in set ? " + set_2.size());
        System.out.println();
        
        // Now here i use if-elif-else condition to identify each Lifting weight
        for (Integer weight : set_2) {
            if (weight == 140) {
                System.out.println(weight + "lbs - Bench press.");
            } else if (weight == 150) {
                System.out.println(weight + "lbs - Squat.");
            } else if (weight == 200) {
                System.out.println(weight + "lbs - Deadlift.");
            } else if (weight == 80) {
                System.out.println(weight + "lbs - Shoulder press.");
            } else {
                System.out.println(weight + "Unknown lift, but anyways let's lift something!");
            
            }
        }
    }
}