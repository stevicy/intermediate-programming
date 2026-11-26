print("====='Methods and Funtion with Mutable and Immutable Collection' =====")

#==============
# 'MY MESSAGE'
#==============
def message(mes):
    return mes

my_message = ["Hello! this is my final term of programming simulation. It's getting tough you know."]
message(my_message) 
print(f"\nMy message: {my_message}")     

#===========
# 'MY SELF'
#===========
class MyProfileMutable:
    def profile(m):
        return m 
    
class dict_profileMutable:
    def info():
        profile1 = {"Name: ": "Steven", "Age: ": 20, "Course: ": "BSIT"}
        profile1["Status"] = "Student" #Adding personal info in variable 'profile1'

        print(f"\nMy Dict_Profile: {MyProfileMutable.profile(profile1)}")
        print("\n----- My Profile -----")
        for k,v in profile1.items():
            print(f"{k} {v}")

dict_profileMutable.info()
#------------------------------------------------------------------


class ListPersonalityMutable:
    def personal():
        word_list = ["Patient", "Humble", "God-fearing"]
        print("\n--- My Personality: ---")
        w = 0
        while w < len(word_list):
            print("-",word_list[w])
            w += 1

        word_list.append("Caring")
        word_list.insert(2, "Strong")
        word_list.extend(["Resilient", "Calm"])
        
        print("\n--- Adding elements to my personality: ---")
        l = 0
        while l < len(word_list):
            print("-",word_list[l])
            l += 1

ListPersonalityMutable.personal()
print()
#------------------------------------------------------------------


#=========================
# SIMULATION OF MUTABLE
#=========================

class MySports:
    def sport(g):
        return g 

class RunSports:
    def sports():
        sp = ["Gym", "Cycling", "Running", "Muay-Thai"]
        print("\n-- My Sports --")
        print(MySports.sport(sp))

        print("\n-- Selecting Sports --")
        for s in sp:
            if s == "Muay-Thai":
                print(f"{s} it is! Time to unleash the warrior within.")
            else:
                print(f"Skipping {s}. Not vibes today.")

RunSports.sports()
print()
#--------------------------------------------------------------------


class MMA:
    def fighters(c):
        return c
    
class FightCard:
    def fight():
        fighter = ["Max Halloway", "Dustin Porier"]
        print("\n--- Fight Card Setup ---")
        print(MMA.fighters(fighter))
        print(f"\n{fighter[0]} v.s {fighter[1]}")

        fighter.remove("Dustin Porier")
        print(f"{MMA.fighters(fighter)} - winner.")

        fighter.insert(0,"Conor McGregor")
        print(f"\n{MMA.fighters(fighter)}")
        print(f"\n{fighter[0]} v.s {fighter[1]}")

        fighter.remove("Max Halloway")
        print(f"{MMA.fighters(fighter)} - winner.")

        print("\n--- Fight Card Breakdown ---")
        for winner in fighter:
            if winner == "Conor McGregor":
                print(f"{winner} is the main event.")
                print(f"Winner {winner} by knockout in Round 2!")
            else:
                print(f"{winner} is on the Prelims.")

FightCard.fight()
print()
#-------------------------------------------------------------------


class ListComprehension:
    def compre1(x):
        return x
    
    def compre2(y):
        return y 
    
    def compre3(n):
        return n

class RunCompre:
    def run():
            print("\n-------- List Comprehension --------")
            squares = [y1 * 5 for y1 in range(5,15)]
            print("List Comprehension Example 1: ", "\n", ListComprehension.compre1(squares))

            squares.remove(40)
            print("After Removing (40):", ListComprehension.compre1(squares))

            squares.append(15)
            print("After Apppending (15):", ListComprehension.compre1(squares))

            squares.insert(5,55)
            print("After Insert (5,55):", ListComprehension.compre1(squares))

            even_numbers = [x for x in range(21) if x % 2 == 0]
            print("\nList Comprehension Example 2 'Even numbers from 0 to 20' : ", "\n", ListComprehension.compre2(even_numbers))
            
            even_numbers.reverse()
            print("After Reverse:", ListComprehension.compre2(even_numbers))

            del even_numbers[2]
            print("After Deleting [2]:", ListComprehension.compre2(even_numbers))

            even_numbers.pop(4)
            print("After Popping (4):", ListComprehension.compre2(even_numbers))

            odd_numbers = [x for x in range(21) if x % 2 != 0]
            print("\nList Comprehension Example 3 'Odd numbers from 0 to 20' : ", "\n", ListComprehension.compre3(odd_numbers))
            
            odd_numbers.append(21)
            print("After Apppending (21):", ListComprehension.compre3(odd_numbers))

            odd_numbers.extend([23,25,27,29,31])
            print("After Extend ([23,25,27,29,31]):", ListComprehension.compre3(odd_numbers))

            odd_numbers.insert(5,11)
            print("After Inserting (5,11):", ListComprehension.compre3(odd_numbers))

RunCompre.run()
print()
#-------------------------------------------------------------------


#============================
#  SIMULATION OF IMMUTABLE
#============================

class ImmutableSim1:
    def tuple():
        tp1 = ("Bill Gates", "Mark Zuckerberg", "Steve Jobs")
        print("---- Wealthiest People In The World: ", tp1, "----")

        y1 = 0
        while y1 < len(tp1[-1]):
            print(f"{tp1[-1]}, You inspire me not quit my job.")
            y1 += 1
            if y1 == 5:
                break
        print()   
        
        y2 = 0
        while y2 < len(tp1[-3]):
            print(f"{tp1[-3]}, My job pays my bills.")
            y2 += 1
            if y2 == 5:
                break
        print()   

        y3 = 0
        while y3 < len(tp1[-2]):
            print(f"{tp1[-2]}, I don't drink beers, I only do code.")
            y3 += 1
            if y3 == 5:
                break
        print()

        tp2 = tp1[-2] #Mark Zuckerberg

        match tp2:
            case "Bill Gates":
                print(f"{tp2} is the co-founder of Microsoft.")
            case "Mark Zuckerberg":
                print(f"{tp2} is the CEO of Meta Facebook.")
            case "Steve Jobs":
                print(f"{tp2} is the co-founder of Apple.")
            case _:
                print(f"Unknown person {tp2}")

ImmutableSim1.tuple()
#-----------------------------------------------------------------

class ImmutableSim2:
    def num_sim():
        print("\n--- Integer and Float Immutable Simulation ---")
        age = 20
        height = 30.48
        print(f"Original age: {age}")
        print(f"Original height: {height}")

        print("\nUpdating values (create new ones):")
        age = age + 1
        height = height + 0.1
        print(f"New Age (After update): {age}")
        print(f"New Height (After update): {height}")

    def string_sim():
        print("\n--- String Immutable Simulation ---")
        name = "Steven"
        print(f"Original string: {name}")

        new_name = name + "Payapaya"
        print(f"New Combined String: {new_name}")
        print()

        for ch in new_name:
            if ch.lower() in "aeiou":
                print(f"{ch} - vowels.")
            else:
                print(f"{ch} - consonant.")
        print()

        print("--String slicing and recreation.--")
        sliced = new_name[1:6]
        print(f"Sliced Part: {sliced}")
        recreated = sliced + "P"
        print(f"Recreated String: {recreated}")

    def comnbined_sim():
        print("\n----- Combined Immutable Simulation -----")
        student_name = "Steven"
        student_age = 20
        student_course = "BSIT"
        student_tuple = (student_name, student_age, student_course)

        print(f"Original Data: {student_tuple}")

        #Recreate tuple with updated values
        updated_tuple = (student_name.upper(), student_age + 1, student_course + " - 2nd Year. ")
        print(f"Updated Tuple (Re-created): {updated_tuple}")

        print("\nSimulation Output:")
        for item in updated_tuple:
            if isinstance(item, str):
                print(f"{item} - String type (Immutable)")
            elif isinstance(item, int):
                print(f"{item} - Integer type (Immutable)")
            else:
                print(f"{item} - Other immutable type.")

        print()
        print("-- Using Match-case --")
        match student_course:
            case "BSIT":
                print("You're taking Bachelor of Science in Information Technology.")
            case "BSCS":
                print("You're taking Bachelor of Science in Computer Science.")
            case _:
                print("Course not identified.")


ImmutableSim2.num_sim()
ImmutableSim2.string_sim()
ImmutableSim2.comnbined_sim()
#-------------------------------------------------------------
 
print("\nEnd of Simulation. Thank You!")
print()

#==================
#  FINAL MESSAGE
#==================
class ClosingMessage:
    def show_message():
        for i in range(5):
            print("PYTHON METHODS/FUNCITON WITH MUTABLE AND IMMUTABLE DONE, IT'S NOT EASY BUT I DID THOUGH.")

ClosingMessage.show_message()













