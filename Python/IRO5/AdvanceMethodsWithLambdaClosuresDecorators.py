print("======== 'Advance Methods and Concept Implementation with Lambda/Closures/Decorators' ========")

#==============
# 'MY MESSAGE'
#==============
def intro():
    def greet_intro(message):
        def greet():
            print(f"\n{message} Hello! this is my final term of programming simulation. It's getting tough you know.")
        greet()
    greet_intro("My message:")
    
intro()

#==========================
#  LAMBDA IMPLEMENTATION
#==========================

print("\n----- Lambda Funtion Section -----")

check_num = lambda x: "Even" if x % 2 == 0 else "Odd"

print(check_num(15))
print(check_num(12))
print()

for i in range(1, 13):
    print(f"{i} is {check_num(i)}")


def lambda_arithmethic():
    print("\nExample 1: Lambda Arithmetic")
    add = lambda x, y: x + y
    sub = lambda x, y: x - y
    mul = lambda x, y: x * y
    div = lambda x, y: "Error: divide by zero" if y == 0 else x / y

    try:
        x = int(input("Enter first number: "))
        y = int(input("Enter second number: "))
        print(f"\nSum: {add(x, y)}")
        print(f"Differece: {sub(x, y)}")
        print(f"Product: {mul(x, y)}")
        print(f"Qutient: {div(x, y)}")
    except ValueError:
        print("Invalid input. numbers only!")
    
lambda_arithmethic()


def lambda_lists():
    print("\nExample 2: Lambda with Lists")
    nums = [2,5,7,11,12,15,17,21,]

    print(f"Original list: {nums}")
    squared = list(map(lambda n: n ** 2, nums))
    even = list(map(lambda n: n % 2 == 0, nums))

    print(f"\nSquares: {squared}")
    print(f"Even: {even}")

lambda_lists()


def lamda_grading():
    print("\nExample 3: Lambda Grading System")
    grade = lambda s: (
        "A" if s >= 90 else
        "B" if s >= 80 else
        "C" if s >= 70 else
        "D" if s >= 60 else
        "F"    
    )

    try:
        name = input("Enter a name: ")
        score = int(input("Enter your score: "))
        print(f"{name}'s grade are: {grade(score)}")
    except ValueError:
        print("Invalid score input!")

lamda_grading()


def lambda_string():
    print("\nExample 4: String Lambda")
    to_upper = lambda s: s.upper()
    to_lower = lambda s: s.lower()
    reverse = lambda s: s[::-1]

    text = input("Enter a word: ")
    print(f"\nUppercase: {to_upper(text)}")
    print(f"Lowercase: {to_lower(text)}")
    print(f"Reverse: {reverse(text)}")

lambda_string()


def lambda_conditional_logic():
    print("\nExample 5: Conditional Logic")
    status = lambda age: "Minor" if age < 18 else "Adult" if age < 60 else "Senior Citizen"

    try:
        age = int(input("Enter your age: "))
        print(f"Status: {status(age)}")
    except ValueError:
        print("Invalid age input!")

lambda_conditional_logic()
#------------------------------------------------------

#===========================
#  CLOSURE IMPLEMENTATION
#===========================

def closure_intro():
    print("\n----- Closure Funtion Section -----")

    def greet_user(username):
        print("Example 1: Basic Closure Example")

        def message():
            print(f"Hello {username}! Welcome to Closure Zone.")
        message()
    greet_user("Steven")

closure_intro()


def closure_counter():
    print("\nExample 2: Counter Closure")

    def make_counter():
        count = 0
        def increment():
            nonlocal count
            count += 1
            print(f"Count: {count}")
        return increment
    
    counter1 = make_counter()
    counter2 = make_counter()

    for i in range(3):
        counter1()
    for i in range(2):
        counter2

closure_counter()


def score_closure():
     print("\nExample 3: Score Tracker Simualtion")

     def create_student_score(name):
         scores = []
         def add_score(value):
             scores.append(value)
             print(f"{name}'s Scores: {scores}")
         def show_average():
             if scores:
                 avg = sum(scores)/len(scores)
                 print(f"{name}'s Average: {avg:.2f}") 
             else:
                 print(f"No scores yet for {name}")
         return add_score, show_average
     
     add, avg = create_student_score("Steven")
     add(85)
     add(90)
     add(95)
     avg

score_closure()


def multi_closure():
    print("\nExample 4: Multi-Level Closure")

    def outer_func(msg):
        def middle_func():
            def inner_func():
                print(f"Deep closure says: {msg}")
            inner_func()
        middle_func()

    outer_func("Keep lerrning even it's tough, hard, or broke Steven you got this!, your family is counting on you.")

multi_closure()
#--------------------------------------------------

#==============================
#  DECORATORS IMPLEMENTATION
#==============================

def decorator_intro():
    print("\n----- Decorators Function Section -----")

    def simple_decorators(func):
        print("Example 1: Basic Decorator")
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


def decorator_with_args():
    print("\nExample 2: Decorator with Arguments")

    def repeat(n):
        def decorator(func):
            def wrapper(*args, **kwargs):
                for i in range(n):
                    print(f"\nExecution {i+1}:")
                    func(*args, **kwargs)
            return wrapper
        return decorator
    
    @repeat(3)
    def motivate(name):
        print(f"Keep coding bahalag sakit ng mata, {name}!")

    motivate("Steven")

decorator_with_args()

def advanced_decorators():
    print("\nExample 3: Advance Decorator")

    def validate(func):
        def wrapper(*args, **kwargs):
            try:
                return func(*args, **kwargs)
            except Exception as e:
                print(f"Error: {e}")
        return wrapper
    
    @validate
    def divide(a,b):
        print(f"Result of {a} / {b} = {a/b}")
    
    divide(10,2)
    divide(15,0)

advanced_decorators()
#--------------------------------------------------------------

#============
#  WRAP-UP
#============
def closure_decorators_ends():
    print("\n--- Wrap-Up ---")

    def end_decorators(func):
        def wrapper():
            print("End of Simulation. Thank You! ")
            func()
            print("All LAMBDA, CLOSURES, AND DECORATORS executed successfully.")
        return wrapper
    
    @end_decorators
    def say_goodbye():
        print("See Yahhhh Guys!! Good coding by the way, Kadlawnan oy HAHHAHA")
    
    say_goodbye()

closure_decorators_ends()
print()


#==================
#  FINAL MESSAGE
#==================
def ClosingMessage():
    for i in range(5):
            closeMessage = lambda: print("PYTHON ADVANCE METHODS AND CONCEPT IMPLEMENTATION WITH LAMBDA/CLOSURES/DECORATORS DONE, IT'S NOT EASY BUT I DID THOUGH.")
            closeMessage()

ClosingMessage()









    
