#==============================
# Class for My Introduction
#==============================
class Introduction:
    def __init__(self):
        self.myMessage = "Hello, this is my last final term of intermediate programming simulation. I hope maka pasar."
        self.myName = "Steven P. Payapaya"
        self.myAge = 20
        self.myCourse = "BSIT"
        self.myStatus = "Student & PeakGym Assistant"

my_introduction = Introduction()
print("=================== My Comprehensive Simulatuon IRO8 'Working with Object-Oriented Programming' ========================")
print("My message:", my_introduction.myMessage)
print("\nName:", my_introduction.myName)
print("Age:", my_introduction.myAge)
print("Course:", my_introduction.myCourse)
print("Status:", my_introduction.myStatus)
print("==================================================================================================")


#==============================
#   Class for Skills
#==============================
class MySkills:
    def __init__(self):
        self.skills = ("Basic Programming (Python, Java)", "Basic Networking")

    def display_skills(self):
        print("\n--- My Skills ---")
        for skill in self.skills:
            print("-", skill)

my_skills = MySkills()
my_skills.display_skills()


#==============================
# Class for Personality Info
#==============================
class Personality:
    def __init__(self):
        self.traits = ["Patient", "Humble", "God-fearing"]

    def display_traits(self):
        print("\n-- My Personality Traits --")
        for trait in self.traits:
            print("-", trait)

    def add_traits(self, new_traits):
        for t in new_traits:
            self.traits.append(t)

my_personality = Personality()
my_personality.display_traits()
my_personality.add_traits(["Caring", "Resilient"]) #Adding new traits
my_personality.display_traits()


#==============================
# Class for Sports Info
#==============================
class Sports:
    def __init__(self):
        self.sports_list = ["Gym", "Cycling", "Running", "Muay-Thai"]

    def display_sports(self):
        print("\n-- My Sports --")
        for sport in self.sports_list:
            print("-", sport)
    
    def select_sport(self):
        print("\n-- Selecting Sports --")
        for sport in self.sports_list:
            if sport == "Muay-Thai":
                print(sport, "it is! Time to unleash the warrior within.")
            else:
                print("Skipping", sport, "- not today.")

my_sports = Sports()
my_sports.display_sports()
my_sports.select_sport()


#==============================
# Class for ScheduleRule
#==============================
class ScheduleRoutine:
    def __init__(self):
        self.days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}

    def display_schedule(self):
        print("\n--- My Set Schedule Routine ---")
        for day in self.days:
            match day:
                case "Monday":
                    print(f"{day}, It's school day.")
                case "Tuesday":
                    print(f"{day}, It's school day.")
                case "Wednesday":
                    print(f"{day}, Halfday shift in morning.")
                case "Thursday":
                    print(f"{day}, It's school day.")
                case "Friday":
                    print(f"{day}, It's school day.")
                case "Saturday":
                    print(f"{day}, Wholeday shift.")
                case "Sunday":
                    print(f"{day}, It's Sabbath day.")
                case _:
                    print(f"{day}, days are not recognized.")

my_scheduleRoutine = ScheduleRoutine()
my_scheduleRoutine.display_schedule()



#==============================
# Class for Lifting Weights
#==============================
class LiftingWeights:
    def __init__(self):
        self.weight_set = set()
        self.weight_set.add(140)
        self.weight_set.add(150)
        self.weight_set.add(200)
        self.weight_set.add(80)

    def display_lifts(self):
        print("\n-- Now This Is My Ideal Lifting Weights Set --")
        for weight in self.weight_set:
            if weight == 140:
                print(f"{weight}lbs - Bench press.")
            elif weight == 150:
                print(f"{weight}lbs - Squat.")
            elif weight == 200:
                print(f"{weight}lbs - Deadlift.")
            elif weight == 80:
                print(f"{weight}lbs - Shoulder press.")
            else:
                print(f"{weight}lbs - Unknown lift, but anyways let's lift something baby!!\n")

my_liftingWeights = LiftingWeights()
my_liftingWeights.display_lifts()


#==============================
# Class for Wealth Info
#==============================
class WealthyPeople:
    def __init__(self):
        self.people = ("Jeff Bezos", "Steve Jobs", "Elon Musk", "Mark Zuckerberg", "Bill Gates")

    
    def display_people(self):
        print("\n-- Wealthiest People in Earth --")
        for person in self.people:
            print("-", person)

    def describe_people(self):
        print("\n-- Wealthiest People Info --")
        for person in self.people:
            if person == "Bill Gates":
                print(person, ": Co-founder of Microsoft")
            elif person == "Steve Jobs":
                print(person, ": Co-founder of Apple")
            elif person == "Mark Zuckerberg":
                print(person, ": CEO of Meta")
            elif person == "Elon Musk":
                print(person, ": CEO of Tesla and SpaceX")
            elif person == "Jeff Bezos":
                print(person, ": Founder of Amazon")
            else:
                print(person, ": Unknown")
        print() 

        tp1 = self.people

        y1 = 0
        while y1 < len(tp1[-4]):
            print(f"{tp1[-4]}, You inspire me not to quit my job.")
            y1 += 1
            if y1 == 5:
                break
        print()

        y2 = 0
        while y2 < len(tp1[-1]):
            print(f"{tp1[-1]}, my job pay my bills.")
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

wealthy_people = WealthyPeople()
wealthy_people. display_people()
wealthy_people.describe_people()

print("\nEnd of Simulation. Thank You!")

#=======================
#    FINAL MESSAGE
#=======================
class FinalMessage:
    def __init__(self):
        self.message = "PYTHON OBJECT-ORIENTED PROGRAMMING DONE, IT'S NOT EASY BUT NA HUMAN RAJOD NAKO ANG LAST NGA SIMULATION!!!!"

    def show_message(self):
        print()
        for i in range(5):
            print(self.message)

my_finalMessage = FinalMessage()
my_finalMessage.show_message()







