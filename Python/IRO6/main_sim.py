from mysim_package import title
from mysim_package import message
from mysim_package import my_info
from mysim_package import add
from mysim_package import divide
from mysim_package import grade_status
from mysim_package import even_and_odd

#=================================================================
#                '1st Simulation Problem'
#=================================================================
def sim1_run():
    title()

    my_message = ["Hello! this is my final term of programming simulation. It's getting tough you know."]
    print(f"\nMy message: {message(my_message)}")

    n,a,c,s = "Steven Payapaya", 20, "BSIT", "Working Student"
    info = my_info(n,a,c,s)

    print("\n=== MY PROFILE ===")
    print(f"Name: {info["Name"]}")
    print(f"Age: {info["Age"]}")  
    print(f"Course: {info["Course"]}")
    print(f"Status: {info["Status"]}")


    print("\n=================================================")
    print("           'MY FIRST SIMULATION MENU'              ")
    print("===================================================")
    print("• This program demonstrates the power of functions.")
    print("• You'll perform operations like addition, division.")
    print("• Grade status checking, and even/odd evaluation.")
    print("----------------------------------------------")
 
    while True:   
        print("\n--- 1st Menu ---")
        print("1. Add Numbers")
        print("2. Divide Numbers")
        print("3. Grade Status Check")
        print("4. Even and Odd Checker")         
        print("5. Exit")
                
        choice = input("Enter choice (1-5): ")

        if choice == "1":                                        
            print("\nYou chose 1, Add Numbers")
            print("Now proceed to enter a number...")
            print("-----------------------------------")
            num1 = float(input("Enter first number: "))
            num2 = float(input("Enter second number: "))
            print("Result: ", add(num1, num2))
            print("-----------------------------------")

        elif choice == "2":
            print("\nYou chose 2, Divide Numbers.")
            print("Now proceed to enter a number...")
            print("-----------------------------------")
            num3 = float(input("Enter first number: "))
            num4 = float(input("Enter second number: "))
            print("Result: ", divide(num3, num4))
            print("-----------------------------------")

        elif choice == "3":
            print("\nYou chose 3, Grade Status Checker.")
            print("Now proceed to enter a number...")
            print("-----------------------------------")
            grade = float(input("Enter your grade: "))
            print("Status: ", grade_status(grade))
            print("-----------------------------------")

        elif choice == "4":
            print("\nYou chose 4. EVEN and ODD Checker.")
            print("Now proceed to enter a number...")
            try:
                print("-----------------------------------")
                num = int(input("Enter a number: "))
                print(f"Result: {even_and_odd(num)}")
            except ValueError:
                print("Please enter a valid integer.")
                print("-----------------------------------")

        elif choice == "5":
            print("Exiting program.... Proceed to another Program.")
            break
        else:
            print("Invalid choice. Please try again.")


#Run Program sim1  
sim1_run()
#=================================================================
#                'End of 1st Simulation Problem'
#=================================================================


from mysim_package import info_personality
from mysim_package import my_sports
from mysim_package import fighters
from mysim_package import tuple_info

#===============================================================
#                '2nd Simulation Problem'
#===============================================================
def sim2_run():
    print("\n====================================================")
    print("           MY SECOND SIMULATION MENU                  ")
    print("======================================================")
    print("• This program is all about collections and logic.")
    print("• It includes lists, tuples, and dictionary concepts.")
    print("• You'll explore my personality traits, my sports,")
    print("  a fight card setup, and even the wealthiest people.")
    print("======================================================")

    while True:
        print("\n--- 2nd Menu ---")
        print("1. My Personality Traits")
        print("2. My Sports ")
        print("3. Fight Card Setup")
        print("4. Wealthiest People Tuple ")
        print("5. Exit")

        choice = input("Enter choices (1-5): ")

        if choice == "1":
            print("\nYou chose 1. My Personality Traits.")

            print("--------------------------------------------------")
            p_traits = ["Patient", "Humble", "God-fearing"]
            traits = info_personality(p_traits)

            print("-- My Personality Traits --")
            i = 0
            while i < len(traits):
                print("-", traits[i])
                i += 1

            p_traits.append("Caring")
            p_traits.insert(2, "Strong")
            p_traits.extend(["Resilient, Calm"])

            full_traits = info_personality(p_traits)
            print("\n-- Adding elemetns to My Personality Traits --")

            n = 0
            while n < len(full_traits):
                print("-", full_traits[i])
                n += 1     
            print("--------------------------------------------------")
        
        elif choice == "2":
            print("\nYou chose 2. My Sports")
            
            print("--------------------------------------------------")
            sp = ("Gym", "Cycling", "Running", "Muay-Thai")
            sports = my_sports(sp)

            print("\n-- My Sports --")
            i = 0
            while i < len(sports):
                print("-", sports[i])
                i += 1
            
            print("\n-- Selecting Sports --")
            for sport in sports:
                if sport == "Muay-Thai":
                    print(f"{sport} it is!  time to unleash the warrior within.")
                else:
                    print(f"Skipping {sport}, cause not vibes today.")
            print("--------------------------------------------------")

        elif choice == "3":
            print("\nYou chose 3. Fight Card Setup")
            
            print("-------------------------------------------------")
            fighter = ["Max Holloway", "Dustin Porier"]

            print("--- Fight Card Setup ---")
            print(fighters(fighter))

            print(f"{fighter[0]} v.s {fighter[1]}")

            fighter.remove("Dustin Porier")
            print(f"\n{fighter} - winner by unanimous decision.")

            fighter.insert(0,"Conor McGregor")
            print(f"\n{fighter}")
            print(f"{fighter[0]} v.s {fighter[1]}")

            fighter.remove("Max Holloway")
            print(f"\n{fighter} - winner by knockout!")

            print("\n--- Fight Card Breakdown ---")
            for winner in fighter:
                if winner == "Conor McGregor":
                    print(f"{winner} is the MAIN EVENT.")
                    print(f"Winner {winner} by KO in Round 2!")
                else:
                    print(f"{winner} is on the prelims.")
            print("--------------------------------------------------")

        elif choice == "4":
            print("\nYou chose 4. Wealthiest People Tuple")

            print("--------------------------------------------------")
            # just call subfile def func
            wealthy_people = tuple_info()

            tp1 = wealthy_people
            print("---- Wealthiest People In The World ----")
            print(tp1)
            print()

            y1 = 0
            while y1 < len(tp1[-1]):
                print(f"{tp1[-1]}, You inspire me not to quit my job.")
                y1 += 1
                if y1 == 5:
                    break
            print()

            y2 = 0
            while y2 < len(tp1[-3]):
                print(f"{tp1[-3]}, my job pay my bills.")
                y2 += 1
                if y2 == 5:
                    break
            print()

            y3 = 0
            while y3 <len(tp1[-2]):
                print(f"{tp1[-2]}, I don't drink beers, I only do code.")
                y3 += 1
                if y3 == 5:
                    break
            print()

            tp2 = tp1[-2]
            match tp2:
                case "Bill Gates":
                    print(f"{tp2} is the co-founder of Microsoft.")
                case "Mark Zuckerberg":
                    print(f"{tp2} is the CEO of Meta (Facebook).")
                case "Steve Jobs":
                    print(f"{tp2} is the co-founder of Apple.")
                case _:
                    print(f"Unknown person {tp2}.")
            print("-------------------------------------------------------")

        elif choice == "5":
            print("Exiting program... Proceed to other program.") 
            break

        else:
            print("Invalid choice. Please try again.")


#Run Program sim2
sim2_run()
#===============================================================
#                'End of 2nd Simulation Problem'
#===============================================================


from mysim_package import lambda_check_num
from mysim_package import arithmetic_ops
from mysim_package import string_manip
from mysim_package import age_conditional_logic
from mysim_package import vowel_counter

#===================================================================
#                  '3rd Simulation Problem'
#===================================================================
def sim3_run(): 
    print("\n==============================================================")
    print("                 MY THIRD SIMULATION MENU                       ")
    print("================================================================")
    print("• This program explores the concept of Lambda Functions.")
    print("• You'll perform operations like arithmetic, string manipulation,")
    print("  conditional logic, and vowel-consonant analysis.")
    print("================================================================")
    
    ops = arithmetic_ops()
    str_ops = string_manip()
    age_fn = age_conditional_logic()

    while True:
        print("\n--- 3rd Menu ---")
        print("1. Lambda Function (Even and Odd)")
        print("2. Lambda Arithmetic Operations")
        print("3. Lambda String Manipulation")
        print("4. Lambda Age Conditional Logic")
        print("5. Vowels and Consonant Counter")
        print("6. Exit")

        choice = input("Enter your choice (1-6): ")

        if choice == "1":
            print("\nYou chose 1. Lambda Function (Even and Odd)")
            
            print("----------------------------------------")
            num = int(input("Enter a number: "))
            print("Result:", lambda_check_num(num))
            print("----------------------------------------")

        elif choice == "2":
            print("\nYou chose 2. Lambda Arithmetic Operations")
            print("---------------------------------")
            a = float(input("Enter first number: "))
            b = float(input("Enter second number: "))
            print("Add:", ops["add"](a, b))
            print("Subtract:", ops["sub"](a, b))
            print("Multiply:", ops["mul"](a, b))
            print("Divide:", ops["div"](a, b))
            print("---------------------------------")

        elif choice == "3":
             print("\nYou chose 3. Lambda Arithmetic Operations")
             print("-------------------------------------------")
             text = input("Enter any string: ")
             print("Uppercase:", str_ops["upper"](text))
             print("Reversed:", str_ops["reverse"](text))
             print("Character Count:", str_ops["count"](text))
             print("-------------------------------------------")

        elif choice == "4":
            print("\nYou chose 4. Lambda Age Conditional Logic")
            print("--------------------------------")
            age = int(input("Enter your age: "))
            print("You are an:", age_fn(age))
            print("--------------------------------")

        elif choice == "5":
            print("\nYou chose 5. Vowels and Consonant Counter")
            print("----------------------------------")
            word = input("Enter a word: ")
            v_count, c_count = vowel_counter(word)

            print(f"Word Entered : {word}")
            print(f"Total Vowels : {v_count}")
            print(f"Total Consonants : {c_count}")
            print("--------------------------------\n")

        elif choice == "6":
            print("Exiting program... Proceed to other program.") 
            break

        else:
            print("InInvalid choice. Please try again.")


#Run Program sim3
sim3_run()
#===============================================================
#                'End of 3rd Simulation Problem'
#===============================================================


from mysim_package import compute_salary

#===================================================================
#                  '4th Simulation Problem'
#===================================================================
def sim4_run():
    print("\n\n=======================================================")
    print("                WELCOME TO SALARY SYSTEM                  ")
    print("===========================================================")
    print("• This simulation computes the total salary of an employee.")
    print("• It requires the following information:")
    print(" - Employee Name")
    print(" - Rate per Hour")
    print(" - Hours Worked per Day")
    print(" - Number of Days Worked")
    print("===========================================================")

    while True:
        print("\n--- 4th Menu ---")
        print("1. Compute Salary")
        print("2. Exit")

        choice = input("Enter choice (1-2): ")

        if choice == "1":
            print("\nYou chose 1. Salary Computation System")

            print("-------------------------------------------")
            compute_salary()
            print("-------------------------------------------")

        elif choice == "2":
            print("Exiting program... Proceed to other program.")
            break

        else:
            print("Invalid choice. Please try again.")


#Run Program sim4
sim4_run()
#===================================================================
#                 'End of 4th Simulation Problem'
#===================================================================


from mysim_package import n1
from mysim_package import n2
from mysim_package import n3
from mysim_package import n4

#===================================================================
#                  '5th Simulation Problem'
#===================================================================
def sim5_run():   
     print("\n\n============================================================================")
     print("                     MULTIPLE EXCEPTION HANDLING                             ")
     print("================================================================================")
     print("• This simulation focuses on using multiple exception handling.")
     print("• Inside the While loop, you will see how works with different errors such as: ")
     print("- ZeroDivisionError 'n dividing a number by zero.")
     print("- ValueError 'n trying to convert invalid input.")
     print("- The loop continues even the if errors occur, showing.")
     print("- How programs can stay running smoothly using try-except.")
     print("================================================================================")
     
     while True:
         print("\n-------------- 5th Menu --------------------")
         print("1. Example: Division with multiple excetptions.")
         print("2. Example: For loop with multiple exception.")
         print("3. Example: Index and ValueError together with multiple exception.")
         print("4. Example: While loop with multiple exception.")
         print("5. Exit")

         choice = input("Enter choice (1-2): ")

         if choice == "1":
             print("\nYou chose 1.")
             print("----------------------------------------------")
             print("Example 1: Division with multiple excetptions.")
             print("x = 10")
             print("y = 0")
             print("c = x / y")

             try:
                print(f"{n1(10,0)}")
             except ZeroDivisionError:
                print("ZeroDivsionError: cannot divide by zero.")
             except Exception:
                print("Some other error happened.")
             print("----------------------------------------------")
          
         elif choice == "2":
             print("\nYou chose 2.")
             print("--------------------------------------------")
             print("Example 2: For loop with multiple exception.")
             values = [10, 0, "nope"]
             print(f"values = {n2(values)}")
             print("result = 100 // v")

             for v in values:
                 try:
                    result = 100 // v
                    print(f"\nResult: {result}")
                 except ZeroDivisionError:
                    print("ZerDivisionError in loop.")
                 except TypeError:
                    print("TypeError in loop.")
                 except Exception:
                    print("General error in loop.")
             print("--------------------------------------------")

         elif choice == "3":
             print("\nYou chose 3.")
             print("-----------------------------------------------------------------")
             print("Example 3: Index and ValueError together with multiple exception.")
             print("nums = [5,2,7]")
             print("nums[5]")
             print("int('opps')")

             try:
                print(n3([5,2,7]))
             except IndexError:
                print("\nCaught IndexError: list index error.")
             except ValueError:
                print("Caught ValueError: invalid conversion.")
             finally:
                print("This finally block always execute.")

             try:
               print(n4("opps"))
             except IndexError:
              print("Caught IndexError: list index error.")
             except ValueError:
              print("\nCaught ValueError: invalid conversion.")
             finally:
              print("This finally block always execute.")
             print("-----------------------------------------------------------------")

         elif choice == "4":
             print("\nYou chose 5.")
             print("----------------------------------------------")
             print("Example 4. While loop with multiple exception.")

             count = 0
             while count < 4:
                  print(f"\n{n4(count)}")
                  try:
                      if count == 1:
                          res = 10 / 0
                      elif count == 2:
                          res = int("bad")
                      else:
                          res = count * 2
                          print("Result multiply(2):", res)
                  except ZeroDivisionError:
                    print("ZeroDivisionError in while loop.")   
                  except ValueError:
                    print("ValueError in while loop.")  
                  count += 1
             print("----------------------------------------------")

         elif choice == "5":
             print("Exiting program... Proceed to other program.")
             break
             
         else: 
             print("Invalid choice. Please try again.")


#Run Program sim5
sim5_run()
#===================================================================
#                 'End of 5th Simulation Problem'
#===================================================================


from mysim_package import n5
from mysim_package import n6
from mysim_package import n7

#===================================================================
#                  '6th Simulation Problem'
#===================================================================
def sim6_run():
    print("\n\n==================================================================")
    print("                   RAISE EXEPTION HANDLING                          ")
    print("======================================================================")
    print("• In this simulation, we will explore how raise exception works like: ")
    print("- Using match-case that shows raising a RuntimeError.")
    print("- Age validation that raises ValueError when invalid.")
    print("- Balance example showing try-finally and raises errors.")
    print("=======================================================================")

    while True:
        print("\n--- 6th Menu ---")
        print("1. Example: Match case with raise.")
        print("2. Example: Age raise example.")
        print("3. Example: Balance Try finaly with raise.")
        print("4. Exit")

        choice = input("Enter choice (1-4): ")

        if choice == "1":
            print("\nYou chose 1.")
            print("---------------------------------")
            print("Example 1. Match case with raise.")
            choice2 = 2
            print(f"choice2 = {n5(choice2)}")

            try:
                match choice2:
                    case 1:
                        print("You chose one.")
                    case 2:
                        raise RuntimeError("Option 2 is not allowed.")
                    case _:
                        print("Other choice.")
            except RuntimeError as e:
                print(f"Runtime problem: {e}")
            print("---------------------------------")

        elif choice == "2":
            print("\nYou chose 2.")
            print("---------------------------------")
            print("Example 2. Age raise example.")
            try:
               age = -5
               print(f"age = {n6(age)}")
               if age < 0:
                  raise ValueError("Age cannot be negative.")
            except ValueError as e:
                 print(f"Caught an error: {e}")
            print("---------------------------------")

        elif choice == "3":
            print("\nYou chose 3.")
            print("-----------------------------------------")
            print("Example 3: Balance Try finaly with raise.")

            try:
               balace = -100
               print(f"balance = {n7(balace)}")
               if balace < 0:
                    raise ArithmeticError("Negative balance not valid.")
            except ArithmeticError as e:
                 print(f"Balance issue: {e}")
            finally:
                 print("Balance check complete.")
            print("-----------------------------------------")

        elif choice == "4":
            print("\nExiting all the program...")
            break

        else:
            print("Invalid choice. Please try again.")


#Run Program sim6
sim6_run()
#===================================================================
#                  'End of 6th Simulation Problem'
#===================================================================


print("End of Simulation. Thank You!")
print()

#=========================
#     FINAL MESSAGE
#=========================
def final_message():
        for i in range(5):
            print("PYTHON STRUCTURING WITH MODULES AND PACKAGES DONE, IT'S NOT EASY BUT I DID THOUGH.")

#Run Program final_message
final_message()















            




























