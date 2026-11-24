import java.util.Scanner;

import MySimPackage.Collection;
import MySimPackage.GreetCalc;
import MySimPackage.SalaryCompute;

import java.util.ArrayList;
import java.util.Arrays;

public class MainSimulaiton {

    static Scanner io = new Scanner(System.in);

    //=================================================================
    //       '1st Simulation Problem'
    //=================================================================
    public static void sim1Run() {
        
        System.out.println("======= My Comprehensive Simulation IRO6 'Structuring with Modules and Packages' =======");
        String myMessage = "Hello! this is my final term of programming simulation. It's getting tough you know.";
        System.out.println("\nMy message: " + GreetCalc.message(myMessage));

        String name = "Steven Payapaya";
        int age = 20;
        String course = "BSIT";
        String status = "Working Student";

        String[] info = GreetCalc.myInfo(name, age, course, status);

        System.out.println("\n=== MY PROFILE ===");
        System.out.println("Name: " + info[0]);
        System.out.println("Age: " + info[1]);
        System.out.println("Course: " + info[2]);
        System.out.println("Status: " + info[3]);

        System.out.println("\n=================================================");
        System.out.println("           MY FIRST SIMULATION MENU             ");
        System.out.println("=================================================");
        System.out.println("• This program demonstrates the power of functions.");
        System.out.println("• You'll perform operations like addition, division.");
        System.out.println("• Grade status checking, and even/odd evaluation.");
        System.out.println("----------------------------------------------");

        while (true) {
            System.out.println("\n--- 1st Menu ---");
            System.out.println("1. Add Numbers");
            System.out.println("2. Divide Numbers");
            System.out.println("3. Grade Status Check");
            System.out.println("4. Even and Odd Checker");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1-5): ");
            String choice = io.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nYou chose 1, Add Numbers");
                    System.out.println("Now proceed to enter a number...");
                    System.out.println("-----------------------------------");
                    System.out.print("Enter first number: ");
                    double num1 = Double.parseDouble(io.nextLine());
                    System.out.print("Enter second number: ");
                    double num2 = Double.parseDouble(io.nextLine());
                    System.out.println("Result: " + GreetCalc.add(num1, num2));
                    System.out.println("-----------------------------------");
                    break;
                case "2":
                    System.out.println("\nYou chose 2, Divide Numbers.");
                    System.out.println("Now proceed to enter a number...");
                    System.out.println("-----------------------------------");
                    System.out.print("Enter first number: ");
                    double num3 = Double.parseDouble(io.nextLine());
                    System.out.print("Enter second number: ");
                    double num4 = Double.parseDouble(io.nextLine());
                    double result = GreetCalc.divide(num3, num4);
                    if (num4 == 0) System.out.println("Error: Division by zero.");
                    else System.out.println("Result: " + result);
                    System.out.println("-----------------------------------");
                    break;
                case "3":
                    System.out.println("\nYou chose 3, Grade Status Checker.");
                    System.out.println("-----------------------------------");
                    System.out.print("Enter your grade: ");
                    double grade = Double.parseDouble(io.nextLine());
                    System.out.println("Status: " + GreetCalc.gradeStatus(grade));
                    System.out.println("-----------------------------------");
                    break;
                case "4":
                    System.out.println("\nYou chose 4. EVEN and ODD Checker.");
                    System.out.println("-----------------------------------");
                    System.out.print("Enter a number: ");
                    int num = Integer.parseInt(io.nextLine());
                    System.out.println("Result: " + GreetCalc.evenAndOdd(num));
                    System.out.println("-----------------------------------");
                    break;
                case "5":
                    System.out.println("Exiting program.... Proceed to another Program.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                
        
            }
        }
    }
    //=================================================================
    //                'End of 1st Simulation Problem'
    //=================================================================


    //===============================================================
    //                '2nd Simulation Problem'
    //===============================================================
    public static void sim2Run() {

        System.out.println("\n====================================================");
        System.out.println("           MY SECOND SIMULATION MENU                  ");
        System.out.println("======================================================");
        System.out.println("• This program is all about collections and logic.");
        System.out.println("• It includes lists, tuples, and dictionary concepts.");
        System.out.println("• You'll explore my personality traits, my sports,");
        System.out.println("  a fight card setup, favorite games,  country to visit,");
        System.out.println("  and even the wealthiest people.");
        System.out.println("======================================================");

        while (true) {
            System.out.println("\n--- 2nd Menu ---");
            System.out.println("1. My Personality Traits");
            System.out.println("2. My Sports");
            System.out.println("3. Fight Card Setup");
            System.out.println("4. Wealthiest People Arrays");
            System.out.println("5. Favorite Mobile Games.");
            System.out.println("6. Wanderlust.");
            System.out.println("7. Exit");

            System.out.print("Enter choice (1-5): ");
            String choice = io.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nYou chose 1. My Personality Traits.");
                    System.out.println("--------------------------------------------------");

                    ArrayList<String> traits = new ArrayList<>();
                    traits.add("Patient");
                    traits.add("Humble");
                    traits.add("God-fearing");
                    ArrayList<String> fullTraits = Collection.infoPersonality(traits);

                    System.out.println("-- My Personality Traits --");
                    for (String t : fullTraits) System.out.println("- " + t);

                    fullTraits.add("Caring");
                    fullTraits.add(2, "Strong");
                    fullTraits.add("Resilient");
                    System.out.println("\n-- Adding elements to My Personality Traits --");
                    for (String t : fullTraits) System.out.println("- " + t);
                    System.out.println("--------------------------------------------------");
                    break;
                case "2":
                    System.out.println("\nYou chose 2. My Sports");
                    System.out.println("--------------------------------------------------");

                    String[] sportsArray = {"Gym", "Cycling", "Running", "Muay-Thai"};
                    ArrayList<String> sports = Collection.mySports(sportsArray);

                    System.out.println("-- My Sports --");
                    for (String s : sports) System.out.println("- " + s);

                    System.out.println("\n-- Selecting Sports --");
                    for (String s : sports) {
                        if (s.equals("Muay-Thai")) System.out.println(s + " it is! time to unleash the warrior within.");
                        else System.out.println("Skipping " + s + ", cause not vibes today.");
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case "3":
                    System.out.println("\nYou chose 3. Fight Card Setup");
                    System.out.println("--------------------------------------------------");

                    ArrayList<String> fighters = new ArrayList<>();
                    fighters.add("Max Holloway");
                    fighters.add("Dustin Porier");
                    System.out.println("--- Fight Card Setup ---");
                    System.out.println(Collection.fighters(fighters));
                    System.out.println(fighters.get(0) + " v.s " + fighters.get(1));

                    fighters.remove("Dustin Porier");
                    System.out.println("\n" + fighters + " - winner by unanimous decision.");

                    fighters.add(0, "Conor McGregor");
                    System.out.println("\n" + fighters);
                    System.out.println(fighters.get(0) + " v.s " + fighters.get(1));

                    fighters.remove("Max Holloway");
                    System.out.println("\n" + fighters + " - winner by knockout!");

                    for (String winner : fighters) {
                        if (winner.equals("Conor McGregor")) {
                            System.out.println("\n" + winner + " is the MAIN EVENT.");
                            System.out.println("Winner " + winner + " by KO in Round 2!");
                        } else System.out.println(winner + " is on the prelims.");
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case "4":
                    System.out.println("\nYou chose 4. Wealthiest People Arrays");
                    System.out.println("--------------------------------------------------");

                    String[] wealthy = Collection.wealthyPeople();
                    System.out.println("---- Wealthiest People In The World ----");
                    for (String w : wealthy) System.out.println("- " + w);


                    String tp2 = wealthy[2];
                    switch (tp2) {
                        case "Bill Gates":
                            System.out.println(tp2 + " is the co-founder of Microsoft.");
                            break;
                        case "Mark Zuckerberg":
                            System.out.println(tp2 + " is the CEO of Meta (Facebook).");
                            break;
                        case "Steve Jobs":
                            System.out.println("\n" + tp2 + " is the co-founder of Apple.");
                            break;
                        default:
                            System.out.println("Unknown person " + tp2 + ".");
                    }
                    System.out.println("-------------------------------------------------------");
                    break;
                case "5":
                    System.out.println("\nYou chose 5. Favorite Mobile Games.");
                    System.out.println("--------------------------------------------------");

                    String[] gamesArr = {"Rules of Survival", "Crossfire", "NBA2K16", "Grand Theft Auto "};
                    ArrayList<String> games = Collection.favoriteGames(gamesArr);
                    System.out.println("--- Favorite Mobile Games ---");
                    for (String g : games) System.out.println("- " + g);
                    System.out.println("--------------------------------------------------");
                    break;
                case "6":
                    System.out.println("\nYou chose 6. Wanderlust.");
                    System.out.println("--------------------------------------------------");

                    String[] countryArr = {"New York", "New Zealand", "Italy", "Alaska"};
                    ArrayList<String> visited = Collection.countriesVisited(countryArr);
                    System.out.println("--- List of my Wanderlust ---");
                    for (String c : visited) System.out.println("- " + c);
                    System.out.println("--------------------------------------------------");
                    break;
                case "7":
                    System.out.println("Exiting program... Proceed to other program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                
            }
        }
    }
    //===============================================================
    //                 'End of 2nd Simulation Problem'
    //===============================================================


    //===================================================================
    //                 '3rd Simulation Problem'
    //===================================================================
    public static void sim3Run() {

        System.out.println("\n\n=======================================================");
        System.out.println("                WELCOME TO SALARY SYSTEM                  ");
        System.out.println("===========================================================");
        System.out.println("• This simulation computes the total salary of an employee.");
        System.out.println("• It requires the following information:");
        System.out.println(" - Employee Name");
        System.out.println(" - Rate per Hour");
        System.out.println(" - Hours Worked per Day");
        System.out.println(" - Number of Days Worked");
        System.out.println("===========================================================");

        while (true) {
            System.out.println("\n--- 3rd Menu ---");
            System.out.println("1. Compute Salary");
            System.out.println("2. Exit");

            System.out.print("Enter choice (1-2): ");
            String choice = io.nextLine();

             switch (choice) {
                case "1":
                    System.out.println("\nYou chose 1. Salary Computation System");
                    System.out.println("-------------------------------------------");

                    System.out.print("Enter employee name: ");
                    String name = io.nextLine();
                    System.out.print("Enter rate per hour: ");
                    double rate = Double.parseDouble(io.nextLine());
                    System.out.print("Enter hours worked per day: ");
                    double hours = Double.parseDouble(io.nextLine());
                    System.out.print("Enter number of days worked: ");
                    int days = Integer.parseInt(io.nextLine());

                    double[] salary = SalaryCompute.computeSalary(rate, hours, days);

                    System.out.println("\n=== Salary Summary ===");
                    System.out.println("Employee name: " + name);
                    System.out.println("Rate per Hour: " + rate);
                    System.out.println("Hours Worked per Day: " + hours);
                    System.out.println("Days Worked: " + days);
                    System.out.println("Daily Salary: " + salary[0]);
                    System.out.println("Total Salary: " + salary[1]);
                    System.out.println("-------------------------------------------");
                    break;
                case "2":
                    System.out.println("Exiting program... Proceed to other program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                
            }
        }
    }
    //===================================================================
    //                 'End of 3rd Simulation Problem'
    //===================================================================


    //===================================================================
    //                    '4th Simulation Problem'
    //===================================================================
    public static void sim4Run() {

        System.out.println("\n\n============================================================================");
        System.out.println("                     MULTIPLE EXCEPTION HANDLING                            ");
        System.out.println("============================================================================");
        System.out.println("• This simulation focuses on using multiple exception handling.");
        System.out.println("• Inside the While loop, you will see how works with different errors such as: ");
        System.out.println("- ZeroDivisionError 'n dividing a number by zero.");
        System.out.println("- ValueError 'n trying to convert invalid input.");
        System.out.println("- The loop continues even the if errors occur, showing.");
        System.out.println("- How programs can stay running smoothly using try-except.");
        System.out.println("================================================================================");

        while (true) {
            System.out.println("\n-------------- 4th Menu --------------------");
            System.out.println("1. Example: Division with multiple excetptions.");
            System.out.println("2. Example: For loop with multiple exception.");
            System.out.println("3. Example: Index and ValueError together with multiple exception.");
            System.out.println("4. Example: While loop with multiple exception.");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1-5): ");
            String choice = io.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nYou chose 1.");
                    System.out.println("----------------------------------------------");
                    System.out.println("Example 1: Division with multiple excetptions.");
                    System.out.println("x = 10");
                    System.out.println("y = 0");
                    System.out.println("c = x / y");

                    try {
                        System.out.println(SalaryCompute.num1(10, 0));
                    } catch (ArithmeticException e) {
                        System.out.println("ArithmeticException: Cannot divide by zero.");
                    } catch (Exception e) {
                        System.out.println("Some other error happened.");
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case "2":
                    System.out.println("\nYou chose 2.");
                    System.out.println("----------------------------------------------");
                    System.out.println("Example 2: For loop with multiple exception.");
                    
                    Object[] values = {10, 0, "nope"};
                    System.out.println("values = " + Arrays.toString(SalaryCompute.num2(values)));
                    System.out.println("result = 100 / values");

                    for (Object v : values) {
                        try {
                            int res = 100 / (int) v; // casting like Python
                            System.out.println("\nResult: " + res);
                        } catch (ArithmeticException e) {
                            System.out.println("ZeroDivisionError in loop.");
                        } catch (ClassCastException e) {
                            System.out.println("TypeError in loop.");
                        } catch (Exception e) {
                            System.out.println("General error in loop.");
                        }
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case "3":
                    System.out.println("\nYou chose 3.");
                    System.out.println("----------------------------------------------");
                    System.out.println("Example 3: Index and ValueError together with multiple exception.");
                    System.out.println("nums = [5,2,7]");
                    System.out.println("nums[5]");
                    System.out.println("int('opps')");

                    int[] nums = {5, 2, 7};

                    try {
                        System.out.println(SalaryCompute.num3(nums)); // may throw IndexOutOfBoundsException
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("\nCaught IndexError: ArrayList index error.");
                    } catch (NumberFormatException e) {
                        System.out.println("Caught ValueError: invalid conversion.");
                    } catch (Exception e) {
                        System.out.println("Some other error happened.");
                    } finally {
                        System.out.println("This finally block always execute.");
                    }

                    try {
                        System.out.println(SalaryCompute.num4("opps")); // NumberFormatException
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Caught IndexError: Arrayist index error.");
                    } catch (NumberFormatException e) {
                        System.out.println("\nCaught ValueError: invalid conversion.");
                    } catch (Exception e) {
                        System.out.println("Some other error happened.");
                    } finally {
                        System.out.println("This finally block always execute.");
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case "4":
                    System.out.println("\nYou chose 4.");
                    System.out.println("----------------------------------------------");
                    System.out.println("Example 4. While loop with multiple exception.");

                    int count = 0;
                    while (count < 4) {
                        System.out.println("\n" + count); 

                        try {
                            int result = SalaryCompute.multiply2(count);
                            System.out.println("Result multiply by 2 (" + count + ") = " + result);
                            
                            
                            if (count == 1) {
                                System.out.println(10/0); // ArithmeticExcetion
                            } else if (count == 2) {
                                Integer.parseInt("bad"); // NumberFormatException
                            }

                        } catch (ArithmeticException e) {
                            System.out.println("ZeroDivisionError in while loop.");
                        } catch (NumberFormatException e) {
                            System.out.println("ValueError in while loop.");
                        } catch (Exception e) {
                            System.out.println("General error in while loop.");
                        } finally {
                            System.out.println("This finally block always execute for this iteration.");
                        }
                        count++;
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case "5":
                    System.out.println("\nExiting all the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                
            }
        }
    }
    //===================================================================
    //                 'End of 4th Simulation Problem'
    //===================================================================
 

    public static void main(String[] args) {
        sim1Run();
        sim2Run();
        sim3Run();
        sim4Run();
        
    // ==========================
    //      FINAL MESSAGE
    // ==========================
    System.out.println("\nEnd of Simulation. Thank You!\n");

    for (int i = 0; i < 5; i++) {
        System.out.println("JAVA STRUCTURING WITH MODULES AND PACKAGES DONE, IT'S NOT EASY BUT I DID IT!");
    }

    io.close();
    
    }
}

