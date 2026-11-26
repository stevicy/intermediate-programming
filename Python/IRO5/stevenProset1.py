#Closures 
def intro():
    def greet_intro(message):
        def greet():
            print(f"\n{message} Hello! this is my final term of programming simulation. It's getting tough you know.")
        greet()
    greet_intro("My message:")
    
intro()

#Basic Function
def my_info(name, age, course):
    print("\n=== MY PROFILE ===")
    print(f"Name: {name} \nAge: {age} \nCourse: {course}")

def status(s):
    if s == "Student":
         print("Status:",s)
    elif s == "Professional":
        print("Status:",s)
    else:
         print("Status: Retired")

my_info("Steven", 20, "BSIT")
status("Student")

#Mutable and Immutable Collection
def mutable_immutable():
    num_list = [2,5,7]   #mutable
    num_list.append(22)

    num_tuple = (5,15,25) #immutable

    print("\nMutable List: ", num_list)
    print("Immutable Tuple: ", num_tuple)

mutable_immutable()

#Function with Error and Exception
def safe_divide(x,y):
    try:
        result = x / y
        print("\nDivision Result: ", result)
    except ZeroDivisionError:
        print("Error: Cannot divide by zero!")

safe_divide(10, 2)
safe_divide(5, 0)

#Lambda Function 
square = lambda x: x ** 2
print("\nLambda Result (square of 5): ", square(5))

#Decorator Function
def decorator_intro():
    def simple_decorators(func):
        print("\nBasic Decorator:")
        def wrapper():
            print("[Before Funtion]")
            func()
            print("[After Function]")
        return wrapper
    
    @simple_decorators
    def say_hello():
        print("Hello, World!!!!")
    say_hello()

decorator_intro()








    
