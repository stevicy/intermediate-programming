package JavaLearning.IRO3;

import java.util.HashSet;

public class stevenHashset {
    public static void main (String[] args) {
        
        HashSet<String> set_1 = new HashSet<> ();
        set_1.add("Monday");
        set_1.add("Tuesday");
        set_1.add("Wednesday");
        set_1.add("Thursday");
        set_1.add("Friday");
        set_1.add("Saturday");
        
        System.out.println("My day set: " + set_1);
        System.out.println("How many days in set: " + set_1.size());
        
        //Using switch case to identify what day is schedule to work or shift
        for (String days : set_1) {
            switch(days) {
                case "Monday":
                    System.out.println(days + ", It's day off.");
                    break;
                case "Tuesday":
                    System.out.println(days + ", It's day off.");
                    break;
                case "Wednesday":
                    System.out.println(days + ", Halfday shift in morning");
                    break;
                case "Thursday":
                    System.out.println(days + ", It's day off.");
                    break;
                case "Friday":
                    System.out.println(days + ", It's day off.");
                    break;
                case "Saturday":
                    System.out.println(days + ", Wholeday shift.");
                    break;
                default:
                System.out.println(days + ", days are not recognize.");
                
            }
        }
        System.out.println();
        
        for (String school : set_1) {
            switch (school) {
                case "Monday":
                case "Tuesday":
                case "Thursday":
                case "Friday":
                    System.out.println(school + ", School days. :((");
                    break;
                case "Wednesday":
                case "Saturday":
                    System.out.println(school + ", It's work day baby!!!");
                    break;
                default:
                System.out.println(school + ", days are not recognize.");
                
            }
        }
        System.out.println();
        
        for (String work : set_1) {
            switch (work) {
                case "Monday":
                case "Tuesday":
                case "Thursday":
                case "Friday":
                    System.out.println(work + ", School days ");
                    break;
                case "Wednesday":
                case "Saturday":
                    System.out.println(work + ", It's work day baby!!!");
                    break;
                default:
                System.out.println(work + ", days are not recognize.");
                
            }
        }
        System.out.println();
        
        // My set of Lifting Weight
        HashSet<Integer> set_2 = new HashSet<> ();
        System.out.println("Empty weight set: " + set_2);
        
        set_2.add(140);
        set_2.add(150);
        set_2.add(200);
        set_2.add(80);
        
        System.out.println("Now this is my ideal lifting weight set: " + set_2);
        
        // Now here i use if-elif-else condition to identify each Lifting weight
        for (Integer weight : set_2) {
            if (weight == 140) {
                System.out.println(weight + "lbs - Bench press baby!!!");
            } else if (weight == 150) {
                System.out.println(weight + "lbs - Squat baby!!!");
            } else if (weight == 200) {
                System.out.println(weight + "lbs - Deadlift lightweight baby!!!");
            } else if (weight == 80) {
                System.out.println(weight + "lbs - Shoulder press baby!!!");
            } else {
                System.out.println(weight + "Unknown lift, but anyways let's lift something baby!!");
            
            }
        }
        System.out.println();
        
        HashSet<Object> set_3 = new HashSet<> (); // I use Object because it is a mixed data type.
        set_3.add(300);
        set_3.add(5);
        set_3.add("Tired");
        set_3.add(true);
        
        System.out.println("My Personal problem set: " + set_3);
        System.out.println();
        
        String message = "PYTHON HASHSET IS DONE, NOT EASY BUT I DID THOUGH";
        HashSet<String> message_1 = new HashSet<> ();
        message_1.add(message);
        
        for (int i = 0; i < 5; i++) {
            for(String msg : message_1) {
                System.out.println(msg);
            }
        }   
    }
}

