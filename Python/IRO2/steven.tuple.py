#Note: In tuple we use round brackets ()

# Like Lists, tuples are ordered and we can access their elements using their index values
# We cannot update items to a tuple once it is created.
# Tuples cannot be appended or extended.
# We cannot remove items from a tuple once it is created.

group = (5, 15, 25, 35)
name = ("Steven", "steven", "STEVEN")

print(group)
print(type(group))
print(name)
print(type(name))

#Looping - for loop display tuple elements
print("\nThe tuple elements of group are: ")
for g in group:
    print(g)
    
print("\nThe tuple elements of name are: ")
for n in name:
    print(n)
    
print()

## Python Access Tuple using a Positive Index:
tp = (2,5,7,12,15,17)

print("The tp elements: ", tp)
print("\nThe value of tp[0]: ", tp[0])
print("The value of tp[1]: ", tp[1])
print("The value of tp[3]: ", tp[3])
print("The value of tp[4]: ", tp[4])
print()

#Working with If statement  in tp elements
x = 2
if tp[1] > x:
    print(f"The tp = {tp[1]} is greater than x = {x}.")

print()
    
#Working with if-elif  in tp elements
print("tp [3] value: ", tp[3])
print("tp [5] value: ", tp[5])

if tp[3] > tp[5]:
    print(f"\nThe tp[3] = {tp[3]} is greater than tp[5] = {tp[5]}.")
elif tp[5] > tp[3]:
    print(f"\nThe tp[5] = {tp[5]} is greater than tp[3] = {tp[3]}.")
    
print()

# Access Tuple using Negative Index:
tp1 = ("Bill Gates", "Mark Zuckerberg", "Steve Jobs")

print("The tp1 elements: ", tp1)
print()
print("The value of tp1[-1]: ", tp1[-1])
print("The value of tp1[-2]: ", tp1[-2])
print("The value of tp1[-3]: ", tp1[-3])
print()

#Using while loop and break in tp1 elements
y = 0
while y < len(tp1[-1]):
    print(f"{tp1[-1]}, You inspire me not to quit my job.")
    y += 1
    if y == 5:
        break
print()

y1 = 0
while y1 < len(tp1[-3]):
    print(f"{tp1[-3]}, My job pays my bills.")
    if y1 == 4:
        break
    y1 += 1

print()

y2 = 0 
while y2 < len(tp1[-2]):
    print(f"{tp1[-2]}, I don't drink beers, I only do code.")
    if y2 == 4:
        break
    y2 += 1

print()   

#Using if-else statement in tp1 elements
print("Value of tp1[-1]: ", tp1[-1])

if tp1[-1] == "Steve Jobs":
    print("Yes, the last person is Steve Jobs.")
    print("Steve Jobs is the co-founder of Apple.")
else:
    print("The last person is not Steve Jobs.")
    
print()

#Using match case in tp1 elements
tp2 = tp1[-2] #Mark Zuckerberg

match tp2:
    case "Bill Gates":
        print(f"{tp2} is the co-founder of Microsoft.")
    case "Mark Zuckerberg":
        print(f"{tp2} is the CEO of Meta Facebook.")
    case "Steve Jobs":
        print(f"{tp2} is the co-founder of Apple.")
    case _:
        print(f"Unknow person {tp2}.")
        
print()

# Concatenation of Python Tuples:
print("Interconnected the: ", tp + tp1)
print()

# Nesting of Python Tuples:
tp3 = (tp, tp1)
print(tp3)
print()

# Repetition Python Tuples:
tp4 = (tp1[-1])* 3
print("Repeat 3 times: ", tp4)
print()

# Slicing Tuples in Python:
tp5 = ("gym", "muaythai", "cycling", "running")

print("My top sports are: ", tp5)
print("\nAfter slicing using index of my top sports: ")
print("My deadlies sports: ", tp5[0:2])
print("My endurance sports:", tp5[2:4])
print("My most favorites sports: ", tp5[1:2])
print()

#Using while in slicing tuple 
mt = 0
while mt < len(tp5):
    print(f"I will train hard in {tp5[1:2]} someday. Not now cause' code is my priority.")
    mt += 1

print()
# Finding the Length of a Python Tuple:
print("Elements of tp1: ", tp1)
print("Len of tp1 are: ",(len(tp1)))
print("Elements of tp5 are: ", tp5)
print("Len of tp5 are: ",(len(tp5)))
print()

#Converting a List to a Tuple:
tp6 = [2,5,7]
print(f"Here it is a list {tp6}, because i use square bracket [].")
print("But here i convert it into tuple", (tuple(tp6)), "because i use round bracket ().")

#Tuples in a Loop:
tp7 = ('JUST DO IT!')

# Number of time loop runs
n = 15
for y3 in range(int(n)):
    tp7 = (tp7,)
    print(tp7)

print()

#Different Ways of Creating a Tuple:
#1. Using Round Brackets:
tup1 = ("Cool", "Python") 
print("1: ", tup1)

#2.Using Comma Separated:
tup2 = 11,12,13
print("2: ", tup2)

#3. Using Tuple Constructor:
tup3 = tuple([7, 17, 15])
print("3: ", tup3)

#4.Creating an Empty Tuple:
tup4 = ()
print("4: ", tup4)

#5.Single Element Tuple:
# Creating a single-element tuple
tup5 = (15, ) #Comma here is important
print("5: ", tup5)  # Output: (15,)
print(type(tup5))

# What if we do not use comma
tup6 = (15) # This an integer (not a tuple)
print("6: ", tup6)
print(type(tup6))

#6.Using Tuple Packing:
# Tuple packing
s, t, p = 2,5,7
tup7  = (s, t, p)
print("7: ", tup7)

print()

tp8 = ("TUPLE")

y5 = 0
while y5 < len(tp8):
    print(f"PYTHON TUPLE DONE, ITS NOT EASY BUT I DID IT THOUGH.")
    if y5 == 2:
        break
    y5 += 1