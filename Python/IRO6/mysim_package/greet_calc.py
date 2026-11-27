#=====This Belong to 1st Simulation Run======
def message(mes):
    return mes

def title():
    print("======= My Comprehensive Simulatuon IRO6 'Structuring with Modules and Packages' ======= ")

def my_info(name,age,course, status):
    return {
        "Name" : name,
        "Age" : age,
        "Course" : course,
        "Status" : status
    }

def add(x, y):
    return x + y

def divide(x, y):
    try:
        if y == 0:
            raise ZeroDivisionError("Error: Division by zero.")
        return x / y
    except ZeroDivisionError as e:
        print(e)
        return None
    
def even_and_odd(num):
    if num % 2 == 0:
        return f"The number {num} is EVEN."
    else:
        return f"The number {num} is ODD"


#====This Belong to 3nd Simulation Run=====
def lambda_check_num(x):
    return "Even" if x % 2 == 0 else "Odd"

def arithmetic_ops():
    return {
        "add": lambda a, b: a + b,
        "sub": lambda a, b: a - b,
        "mul": lambda a, b: a * b,
        "div": lambda a, b: a / b if b != 0 else "Cannot divide by zero"
    }

def string_manip():
    return {
        "upper": lambda s: s.upper(),
        "reverse": lambda s: s[::-1],
        "count": lambda s: len(s)
    }

def age_conditional_logic():
    return lambda age: "Minor" if age < 18 else "Adult" if age < 60 else "Senior Citizen"


#====This Belong to 5th Simulation Run=====
def n1(x,y):
        return x / y

def n2(x):
        return x

def n3(x):
        return x[5]

def n4(x):
        return int(x)

    



