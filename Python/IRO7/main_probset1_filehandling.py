f1 = "file1_probset1.txt"

#Writing in 'file1_probset1.txt'
with open(f1, "w") as f:
    f.write("---My Personality---\n")
    i = 3
    personality = ""
    for n in range(i):
        personality = input("\nEnter my personality: \n")
        f.write(f"{personality}\n")
#Reading in 'file1_probset1.txt'
try:
    with open(f1, "r") as f:
        print()
        print(f.read())
except FileExistsError:
    print(f"Error: {f1} not found.")


#Appending in 'file1_probset1.txt'
my_sports = ["Gym", "Muay-Thai", "Cycling", "Running"]

with open(f1, "a") as f:
    f.write("\n---My Sports---\n")
    for s in my_sports:
        f.write(f"{s} \n")
    
    f.write("\n---Selecting Sports---\n")
    for sp in my_sports:
        if sp == "Muay-Thai":
            f.write(f"{sp} it is! Time to unleash the warrior within.\n")
        else:
            f.write(f"Skipping {sp}. Not vibes today.\n")
#Reading in 'file1_probset1.txt'
try:
    with open(f1, "r") as f:
        print("\n'Adding new data in file1_probset1.txt: '")
        print(f.read())
except FileExistsError:
    print(f"Error: {f1} not found.")


#Updating the current content file
with open(f1, "r") as f:
    current_f = f.read()

    print("'Current Content in file1_probset1.txt: ' ")
    print(f"{current_f} \n")

num = input("Enter a number: ")
num_1 = int(num)

with open(f1, "w") as f:
    f.write("---Even and Odd Checker---\n")
    if num_1 % 2 == 0:
        f.write(f"The {num_1} is EVEN number.\n")
    else:
        f.write(f"The {num_1} is ODD number.\n")

try:
    with open(f1, "r") as f:
        print()
        print(f.read())
        print("file1_probset1.txt content updated successfully! Go see it!.")
except FileExistsError:
    print(f"Error: {f1} not found.")

print("\nEnd of Simulation. Thanks!")








