print("============ 'Basic Methods/Function Implementation' ============")

def greet():
    message = "Hello! this is my final term of programming simulation. It's getting tough you know.".upper()
    print("\nMy message: ", message)

greet()

class Information:
    def person(n,a,c):
        print("\n=== MY PROFILE ===")
        print(f"Name: {n} \nAge: {a} \nCourse: {c}")

    def status(s):
        if s == "Student":
            print("Status:",s)
        elif s == "Professional":
            print("Status:",s)
        else:
            print("Status: Retired")

Information.person("Steven",20,"BSIT")
Information.status("Student")


class Calculator:
    def add(x,y):
        return x + y
    
    def subtraction(x,y):
        return x - y
    
    def multiplication(x,y):
        return x * y
    
    def divide(x,y):
        if y != 0:
            return x / y
        else:
            return "Error: Cannot divide by zero!"
        

#=========================
#       PROBLEM SET 1
#=========================
print("\n========= PROBLEM SET 1 =========")

class CalculatorPogram:
    def run():
        while True:
            print("\n===== Choose Calculator Operation =====")
            print("1. Addition")
            print("2. Subtraction")
            print("3. Multiplication")
            print("4. Division")
            print("Type 'skip' to proceed to the next problem.\n")

            choice = input("Choose operation(1-4 or skip): ")

            if choice.lower() == "skip":
                print("You chose to skip. Proceeding to the next problem...\n")
                break

            if choice == "1":
                print("You chose ADDITION. Proceed to enter a numbers.\n")
            elif choice == "2":
                print("You chose SUBTRACTION. Proceed to enter a numbers.\n")
            elif choice == "3":
                print("You chose MULTIPLICATION. Proceed to enter a numbers.\n")
            elif choice == "4":
                print("You chose DIVISION. Proceed to enter a numbers.\n")
            else:
                print("Invalid choice! Please try again.\n")
                continue

            num1 = float(input("Enter a first number: "))
            num2 = float(input("Enter a second number: "))

            if choice == "1":
                print("Result: ", Calculator.add(num1, num2))
            elif choice == "2":
                print("Result: ", Calculator.subtraction(num1, num2))
            elif choice == "3":
                print("Result: ", Calculator.multiplication(num1, num2))
            elif choice == "4":
                print("Result: ", Calculator.divide(num1, num2))

CalculatorPogram.run()


#========================
#     PROBLEM SET 2
#========================
print("\n===== PROBLEM SET 2 =====")

class FriendList:
    def enter_friends():
        names = []
        years = []
        ages = []
        current_year = 2025

        print("===== Enter a Friend's =====")
        for i in range(3):
            print(f"\n--- Person {i+1} ---")
            name = input("Enter a name of friend: ")
            year = int(input("Enter year of birth: "))
            names.append(name)
            years.append(year)

        for y in years:
            age = current_year - y
            ages.append(age)

        FriendList.display_friends(names, years, ages)

    def display_friends(names, years, ages):
        print("\n===== List of Friends =====")
        for i in range(3):
            print(f"Name: {names[i]} | Year: {years[i]} | Ages: {ages[i]}")

        FriendList.find_oldest_youngest(names, ages)

    def find_oldest_youngest(names, ages):
        oldest_age = max(ages)
        youngest_age = min(ages)
        oldest_index = ages.index(oldest_age)
        youngest_index = ages.index(youngest_age)

        print(f"\nThe oldest is: {names[oldest_index]} ({oldest_age}) years old")
        print(f"The youngest is: {names[youngest_index]} ({youngest_age}) years old")

FriendList.enter_friends()


#========================
#    PROBLEM SET 3
#========================
print("\n===== PROBLEM SET 3 =====")

class SalaryComputation:
    def compute_salary():
        print("=== Salary Computation ===")
        name = input("Enter employee name: ")
        rate = float(input("Enter rate per hour: "))
        hours = float(input("Enter hours worked: "))
        days = int(input("Enter number of days worked: "))

        daily_salary = rate * hours
        total_salary = daily_salary * days

        print("\n=== Salary Summary ===")
        print("Employee name: ", name)
        print("Rate per Hour: ", rate)
        print("Hours Worked per Day: ", hours)
        print("Days Worked: ", days)
        print("Daily Salary: ", daily_salary)
        print("Total Salary: ", total_salary)

SalaryComputation.compute_salary()


#=====================
# PROBLEM SET 4
#=====================
print("\n===== PROBLEM SET 4 =====")

class VowelsConsonantCounter:
    def count_vowels_consonant():
        print("=== Vowels and Consonant Counter ===")
        word = input("Enter a word: ")
        vowels = "aeiouAEIOU"
        vowels_count = 0
        consonant_count = 0

        for letter in word:
            if letter.isalpha():
                if letter in vowels:
                    vowels_count += 1
                else:
                    consonant_count += 1
        
        print("\n=== Result ===")
        print("Word: ", word)
        print("Vowels: ", vowels_count)
        print("Consonant: ", consonant_count)

VowelsConsonantCounter.count_vowels_consonant()
#-------------------------------------------------------------

print("\nEnd of Simulation. Thank You!")
print()

#==================
#  FINAL MESSAGE
#==================

class ClosingMessage:
    def show_message():
        for i in range(5):
            print("PYTHON BASIC METHODS/FUNCITON IMPLEMENTATION DONE, IT'S NOT EASY BUT I DID THOUGH.")

ClosingMessage.show_message()



    


