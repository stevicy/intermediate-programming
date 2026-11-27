f1 = "file1.txt"
f2 = "file2.txt"
f3 = "file3.txt"


#====================================================================================================
#                                  'FILE 1 CONTENT'
#====================================================================================================
#Appending into the 'file1.txt'
my_dict = {"Name: " : "Steven Payapaya", "Age: " : 20, "Course: " : "BSIT", "Status: " : "Student & PeakGym Assistant"}

with open(f1, "a") as f:
    f.write("=================== My Comprehensive Simulatuon IRO7 'Working with Files' ========================")
    f.write("\nMy message: Hello! This is my final term of programming simulation. It's getting tough you know.")
    f.write(f"\nName: {my_dict["Name: "]}")
    f.write(f"\nAge: {my_dict["Age: "]}")
    f.write(f"\nCourse: {my_dict["Course: "]}")
    f.write(f"\nStatus: {my_dict["Status: "]}")
    f.write("\n==================================================================================================")

#Reading and displaying into the content of 'file1.txt' after appending
try:
    with open(f1, "r") as f:
        print("--------------------------")
        print("      File 1 content:     ")
        print("--------------------------")
        print()

        print(f.readline())
        print(f.read(96)) #return char of the file
        print(f.readline().strip()) 
        print(f.readline().strip())
        print(f.readline().strip())
        print(f.readline().strip())
        print(f.readline().strip()) 
        print(f.readline().strip())
except FileExistsError:
    print(f"Error: {f1} not found.")



#====================================================================================================
#                                  'FILE 2 CONTENT'
#====================================================================================================
#Writing into the content of 'file2.txt' 
with open(f2, "w") as f:
    f.write("---My Personality---\n")
    i = 3
    personality = ""
    for n in range(i):
        personality = input("\nEnter my personality: \n")
        f.write(f"{personality}\n")

#Reading and displaying into the file of 'file2.txt' after writing
try:
    with open(f2, "r") as f:
        print()
        print("--------------------------")
        print("      File 2 content:     ")
        print("--------------------------")
        print()
        print("==================================================================================================")

        print(f.read())      
except FileExistsError:
    print(f"Error: {f2} not found.")



#Appending into the 'file2.txt'
my_sports = ["Gym", "Muay-Thai", "Cycling", "Running"]

with open(f2, "a") as f:
    f.write("\n---My Sports---\n")
    for s in my_sports:
        f.write(f"{s} \n")

    f.write("\n--Selecting Sports--\n")
    for sp in my_sports:
        if sp == "Muay-Thai":
            f.write(f"{sp} it is! Time to unleash the warrior within.\n")
        else:
            f.write(f"Skipping {sp}. Not vibes today.\n")

#Reading and displaying into the content of 'file2.txt' after appending
try:
    with open(f2, "r") as f:
        print("\nAdding data in File 2 content: ")
        print(f.read())
except FileExistsError:
    print(f"Error: {f2} not found.")


#Appending into the 'file2.txt'
my_dict["Skills"] = "Basic Programming (Python, Java)", "Basic Networking"

with open(f2, "a") as f:
    for key, value in my_dict.items():
        if key == "Skills":
            f.write("\n---My Skills---\n")
            for skills in value:
                f.write(f"- {skills} \n")

#Reading and displaying into the content of 'file2.txt' after appending
try:
    with open(f2, "r") as f:
        print("\nAdding data in File 2 content: ")
        print(f.read())
except FileExistsError:
    print(f"Error: {f2} not found.")


#Appending into the 'file2.txt'
set1 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}

with open(f2, "a") as f:
    f.write(f"\n---My Set Schedule Routine---\n")
    for days in set1:
        match days:
            case "Monday":
                f.write(f"{days}, It's school day.\n")
            case "Tuesday":
                f.write(f"{days}, It's school day.\n")
            case "Wednesday":
                f.write(f"{days}, Halfday shift in morning.\n")
            case "Thursday":
                f.write(f"{days}, It's school day.\n")
            case "Friday":
                f.write(f"{days}, It's school day.\n")
            case "Saturday":
                f.write(f"{days}, Wholeday shift.\n")
            case "Sunday":
                f.write(f"{days}, It's Sabbath day.\n")
            case _:
                f.write(f"{days}, days are not recognize.\n")

#Reading and displaying into the content of 'file2.txt' after appending
try:
    with open(f2, "r") as f:
        print("\nAdding data in File 2 content: ")
        print(f.read())
except FileExistsError:
    print(f"Error: {f2} not found.")


#Appending into the 'file2.txt'
set2 = set()

with open(f2, "a") as f:
    set2.add(140)
    set2.add(150)
    set2.add(200)
    set2.add(80)

    f.write(f"\n--Now this is My ideal Lifting weights Set--\n")
    for weight in set2:
        if weight == 140:
            f.write(f"{weight}lbs - Bench press.\n")
        elif weight == 150:
            f.write(f"{weight}lbs - Squat.\n")
        elif weight == 200:
            f.write(f"{weight}lbs - Deadlift.\n")
        elif weight == 80:
            f.write(f"{weight}lbs - Shoulder press.\n")
        else:
            f.write(f"{weight}lbs - Unknown lift, but anyways let's lift something baby!!\n")
    
#Reading and displaying into the content of 'file2.txt' after appending
try:
    with open(f2, "r") as f:
        print("\nAdding data in File 2 content: ")
        print(f.read())
        print("==================================================================================================")
except FileExistsError:
    print(f"Error: {f2} not found.")



#====================================================================================================
#                                  'FILE 3 CONTENT'
#====================================================================================================
#Writing into the content of 'file3.txt' 
with open(f3, "w") as f:
    f.write("---Salary Computation---\n")

    name = input("Enter employee name: ")
    f.write(f"Employee Name: {name} \n")
    rate = float(input("Enter rate per hour: "))
    f.write(f"Rate per Hour: {rate} \n")
    hours = float(input("Enter hours worked: "))
    f.write(f"Hours Worked per Day: {hours} \n")
    days = int((input("Enter numbers of days worked: ")))
    f.write(f"Days Worked: {days} \n")

    daily_salary = rate * hours
    f.write(f"Daily Salary: {daily_salary} \n")
    total_salary = daily_salary * days
    f.write(f"Total Salary: {total_salary} \n")

#Reading and displaying into the content of 'file3.txt' after appending
try:
    with open(f3, "r") as f:
      print()
      print("--------------------------")
      print("      File 3 content:     ")
      print("--------------------------")
      print()
      print("==================================================================================================")
      print(f.readline().strip())
      print(f.readline().strip())
      print(f.readline().strip())
      print(f.readline().strip())
      print(f.readline().strip())
      print(f.readline().strip())
      print(f.readline().strip())
except FileExistsError:
    print(f"Error: {f3} not found.")


#Appending into the file3.txt
with open(f3, "a") as f:
    f.write("\n---Even and Odd Checker---\n")
    num = input("\nEnter a number: ")
    num_1 = int(num)

    if num_1 % 2 == 0:
        f.write(f"The {num_1} is EVEN number.\n")
    else:
        f.write(f"The {num_1} is ODD number.\n")

#Reading and displaying into the content of 'file3.txt' after appending
try:
    with open(f3, "r") as f:
        print("\nAdding data in File 3 content: ")
        print(f.read())
except FileExistsError:
    print(f"Error: {f3} not found.")


#Appending into the file3.txt
with open(f3, "a") as f:
    f.write("\n---Lambda Arithmetic---\n")
    add = lambda x, y: x + y
    sub = lambda x, y: x - y
    mul = lambda x, y: x * y
    div = lambda x, y: "Error: divide by zero" if y == 0 else x / y

    try:
        x = int(input("\nEnter first number: "))
        y = int(input("Enter second number: "))
        f.write(f"Sum: {add(x,y)}\n")
        f.write(f"Difference: {sub(x,y)}\n")
        f.write(f"Product: {mul(x,y)}\n")
        f.write(f"Quitent: {div(x,y)}\n")
    except ValueError:
        f.write("Invalid input. integers only!\n")

#Reading and displaying into the content of 'file3.txt' after appending
try:
    with open(f3, "r") as f:
        print("\nAdding data in File 3 content: ")
        print(f.read())
except FileExistsError:
    print(f"Error: {f3} not found.")


#Appending into the file3.txt
with open(f3, "a") as f:
    f.write("\n---Lambda Grading System---\n")
    grade = lambda s: (
        "A" if s >= 90 else 
        "B" if s >= 80 else
        "C" if s >= 70 else
        "D" if s >= 60 else
        "F"
    )

    try:
        name = input("\nEnter a name: ")
        score = int(input("Enter your score: "))
        f.write(f"{name}'s your grade are: {grade(score)}\n")
    except ValueError:
        f.write("Invalid score input!")

#Reading and displaying into the content of 'file3.txt' after appending
try:
    with open(f3, "r") as f:
        print("\nAdding data in File 3 content: ")
        print(f.read())
except FileExistsError:
    print(f"Error: {f3} not found.")



#========================= Here is the start point of updating the file3.txt =========================
#Here im just reading and displaying the current content of file3.txt
n_current_file = f3
with open(n_current_file, "r") as f:
    current_f = f.read()

    print("Current Content in File 3: \n")
    print(f"{current_f} \n")


#Now here im going to edite and updating the current content of file3.txt
total = []
num = 0

while num < 5:
    try:
        user_input = input("\nEnter a number: ")
        n = int(user_input)
        total.append(n)
        num += 1
    except:
        print("Invalid input. Only integer are allowed.")

#Now here the file 3 content is updated, the current content of file 3 is gone, and replace it with new.
try:
    with open(n_current_file, "w") as f:
        for number in total:
            f.write(f"{number} \n")
except FileExistsError:
    print(f"Error: {n_current_file} not found.")    


#Now here im going to make process of each lines to sum all of them.
sum_files = []  #New list only for summing
with open(n_current_file, "r") as f:
    f_line = f.readlines()

    for lines in f_line:
        num1 = int(lines)       # convert line to int
        sum_files.append(num1)  # store numbers in correct list
    
print(f"Total of numbers: {sum(sum_files)}")
print("\nFile 3 content updated successfully! Go see it!.")

#Now here im gonna append the sum of all lines into the file3.txt
with open(n_current_file, "a") as f:
    f.write(f"Total of numbers: {sum(sum_files)}\n")


#Appending into the 'n_current_file.txt'
with open(n_current_file, "a") as f:
    f.write("\n---Vowels and Consonant Counter---\n")
    word = input("\nEnter a word: ")
    vowels = "aeiouAEIOU"
    vowels_count = 0
    consonant_count = 0

    for letter in word:
        if letter.isalpha():
            if letter in vowels:
                vowels_count += 1
            else:
                consonant_count += 1
    f.write("-Result-\n")
    f.write(f"Word: {word}\n")
    f.write(f"Vowels: {vowels_count}\n")
    f.write(f"Consonant: {consonant_count}\n")

#Reading and displaying into the content of 'n_current_file.txt' after appending
try:
    with open(n_current_file, "r") as f:
        print(f.read())
except FileExistsError:
    print(f"Error: {n_current_file} not found.")


#Appending into the 'n_current_file.txt'
import random

random_numbers = []
for i in range(10): # generate 10 random numbers between 1 and 100
    num = random.randint(1,100)
    random_numbers.append(num)

with open(n_current_file, "a") as f:
    f.write("\n---Random Numbers for Math Fun---\n")
    for num3 in random_numbers:
        f.write(f"{num3}\n")
    f.write(f"Sum of numbers: {sum(random_numbers)}\n")
    f.write(f"Average of numbers: {sum(random_numbers) / len(random_numbers):.2f}\n")

#Reading and displaying into the content of 'n_current_file.txt' after appending
try:
    with open(n_current_file, "r") as f:
        print(f.read())
        print("==================================================================================================")
except FileExistsError:
    print(f"Error: {n_current_file} not found.")



#Here i do simualtion of deleting the file name 'file2.txt', after finishing a simulation of appending and reading in 'file2.txt'.
#-------------------------------------------
import os

if os.path.exists(f2):
    os.remove(f2)
    print("\nFile 2 deleted successfully!")
else:
    print("File does not exist.")
#-------------------------------------------   


print("\nEnd of Simulation. Thank You!")

#=======================
#    FINAL MESSAGE
#=======================
print()
with open(f1, "w") as f:
    for i in range(5):
        print("PYTHON FILE HANDLING DONE, IT'S NOT EASY BUT I DID THOUGH.")
        f.write("PYTHON FILE HANDLING DONE, IT'S NOT EASY BUT I DID THOUGH.\n")

    






































        



        

    




        

































    
  


