#====This Belong to 1st Simulation Run=====
def grade_status(grade):
    if grade >= 90:
        return "Excellent!"
    elif grade >= 75:
        return "Passed"
    else:
        return "Failed"
    

#====This Belong to 2nd Simulation Run=====
def info_personality(personality):
    return personality

def my_sports(sports):
    return sports

def fighters(fighter_list):
    return fighter_list

def tuple_info():
    return ("Bill Gates", "Mark Zuckerberg", "Steve Jobs")


#======This Belong to 3rd Simulation Run======
def vowel_counter(word):
    vowels = "aeiouAEIOU"
    v_count = 0
    c_count = 0
    for letter in word:
        if letter.isalpha():
            if letter in vowels:
                v_count += 1
            else:
                c_count += 1
    return v_count, c_count


#======This Belong to 4th Simulation Run======
def compute_salary():
    print("=== Salary Computation ===")
    name = input("Enter employee name: ")
    rate = float(input("Enter rate per hour: "))
    hours = float(input("Enter hours worked: "))
    days = int(input("Enter number of days worked: "))

    daily_salary = rate * hours
    total_salary = daily_salary * days

    print("\n=== Salary Summary ===")
    print("Employee name:", name)
    print("Rate per Hour:", rate)
    print("Hours Worked per Day:", hours)
    print("Days Worked:", days)
    print("Daily Salary:", daily_salary)
    print("Total Salary:", total_salary)


#======This Belong to 6th Simulation Run======
def n5(x):
        return x

def n6(x):
        return x
    
def n7(x):
        return x
    
