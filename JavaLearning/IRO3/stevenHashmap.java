package JavaLearning.IRO3;

import java.util.HashMap;
import java.util.Map;

public class stevenHashmap {
	public static void main(String[] args) {
	  HashMap<String, Object> myDetail = new HashMap<> ();
	  
	  System.out.println("===== My Personal Detail =====");
	  
	  //My Personal Detail
	  myDetail.put("My name", "Steven P. Payapaya");
	  myDetail.put("Age", 20);
	  myDetail.put("Sex", "Male");
	  myDetail.put("Birthdate", "May 15, 2005");
	  
	  System.out.println("My Personal Detail: " + myDetail);
	  System.out.println("My name: " + myDetail.get("My name"));
	  System.out.println("Age: " + myDetail. get("Age"));
	  System.out.println("Sex: " + myDetail.get("Sex"));
	  System.out.println("Birthdate: " + myDetail.get("Birthdate"));
	  System.out.println();
	  
	  System.out.println("===== My Mother Detail =====");
      HashMap<String, Object> motherDetail = new HashMap<>();
      motherDetail.put("Mother name", "Erlinda P. Payapaya");
      motherDetail.put("Age", 45);
      motherDetail.put("Birthdate", "January 30, 1980");
      motherDetail.put("Occupation", "Domestic Helper");
	  
	  System.out.println("My mother's detail: " + motherDetail);
      System.out.println("Mother name: " + motherDetail.get("Mother name"));
      System.out.println("Age: " + motherDetail.get("Age"));
      System.out.println("Birthdate: " + motherDetail.get("Birthdate"));
      System.out.println("Occupation: " + motherDetail.get("Occupation"));
      System.out.println();

	  System.out.println("===== My Father Detail =====");
      HashMap<String, Object> fatherDetail = new HashMap<>();
      fatherDetail.put("Father name", "Goldwin M. Payapaya");
      fatherDetail.put("Age", 52);
      fatherDetail.put("Birthdate", "December 29 1973");
      fatherDetail.put("Occupation", "N/A");
      
      System.out.println("My father's detail: " + fatherDetail);
      System.out.println("Father name: " + fatherDetail.get("Father name"));
      System.out.println("Age: " + fatherDetail.get("Age"));
      System.out.println("Birthdate: " + fatherDetail.get("Birthdate"));
      System.out.println("Occupation: " + fatherDetail.get("Occupation"));
      System.out.println();
      
      System.out.println("===== Adding Items to My Personal Detail =====");
      myDetail.put("Education", "Bachelor of Science in Information Technology");
      myDetail.put("GPA", 1.52);
      myDetail.put("Hobbies", "Gym, Running, Cycling, Muay-Thai");
      myDetail.put("Skills", "Basic Programming, Basic Networking");

      System.out.println("My dictionary detail: " + myDetail);
      System.out.println("My name: " + myDetail.get("My name"));
	  System.out.println("Age: " + myDetail. get("Age"));
	  System.out.println("Sex: " + myDetail.get("Sex"));
	  System.out.println("Birthdate: " + myDetail.get("Birthdate"));
      System.out.println("Education: " + myDetail.get("Education"));
      System.out.println("GPA: " + myDetail.get("GPA"));
      System.out.println("Skills: " + myDetail.get("Skills"));
      System.out.println("Hobbies: " + myDetail.get("Hobbies"));
	  System.out.println();
	  System.out.println("===== Final Summary of My Detail =====");
      for (Map.Entry<String, Object> entry : myDetail.entrySet()) {
          System.out.println("Key: " + entry.getKey() + "\tValue: " + entry.getValue());
        }
      System.out.println();
      
      // GPA Feedback
      double gpa = (double) myDetail.get("GPA");
      if (gpa <= 1.75) {
          System.out.println("GPA: " + gpa + " - Pasar bai!!!");
        } else {
            System.out.println("GPA: " + gpa + " - Pagtuon megoyyy!");
        }
      
      System.out.println();

      // Age Feedback
      int age = (int) myDetail.get("Age");
      if (age < 18) {
          System.out.println("Bata pa kaayo!, e enjoy sa imong pagka ulitaw.");
        } else if (age <= 25) {
            System.out.println("Guwang naman diay ko hahaha. Dapat daw akong mindset ron 'TRABAHO NA'.");
        } else {
            System.out.println("Guwang pas tanang guwang hahaha");
        }

      System.out.println();
      
      // Hobbies Loop (splitting string manually)
      System.out.println("Here are my hobbies:");
      String hobbiesString = (String) myDetail.get("Hobbies");
      String[] hobbies = hobbiesString.split(", ");
      for (String h : hobbies) {
           System.out.println("- " + h);
        }

      System.out.println();
      
      // Skills Loop (splitting string manually)
      System.out.println("Here are my skills:");
      String skillsString = (String) myDetail.get("Skills");
      String[] skills = skillsString.split(", ");
      for (String s : skills) {
           System.out.println("- " + s);
        }
        
      System.out.println();
      
      // Sex Check
      String sex = (String) myDetail.get("Sex");
      if (sex.equals("Male")) {
            System.out.println("Lalaki ko bai, dapat daw lig-on og nawng ay esti lawas diay og pang-utok haha.");
        } else if (sex.equals("Female")) {
            System.out.println("Babae, wala koy ma print kay always sila sakto.");
        } else {
            System.out.println("Way sex or gender? aw okay rana, importante tao.");
        }

      System.out.println();
      
      // Education Response
      String education = (String) myDetail.get("Education");
      if (education.contains("Information Technology")) {
            System.out.println("IT course? niceee noh???? -Sir Junell Bojocan ");
        } else {
            System.out.println("Nganung nag IT man ka gwapo? No choice lagi. -Steven Payapaya");
        }

      System.out.println();
      
      // Birthdate Reaction
      String birthdate = (String) myDetail.get("Birthdate");
      if (birthdate.contains("May")) {
            System.out.println("Born in May? Mga bright og talented daw mga May.");
        } else if (birthdate.contains("December")) {
            System.out.println("December baby! Near Christmas so daghan regalo.");
        } else {
            System.out.println("Lapas nas calendar akong birth month.");
        }

      System.out.println();
      
      // Name Reaction
      String name = (String) myDetail.get("My name");
      if (name.contains("Steven")) {
            System.out.println("Steven? Soon your name will be well known. Timan-e na!");
        } else {
            System.out.println(name + "? Padayon lang, ma ilado ra ka puhon.");
        }

      System.out.println();
      
      for (int i = 0; i < 5; i++) {
            System.out.println("PYTHON HASHMAP IS DONE, NOT EASY BUT I DID THOUGH");
        }
      
	}
}
