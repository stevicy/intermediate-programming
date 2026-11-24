list_1 = [2,5,"HOPE", 12, True]
print(list_1)

#accessing  elements using index
print("\nElements of index 0 is:", list_1[0])
print("Elements of index 2 is:", list_1[2])
print("Elements of index 4 is:", list_1[4])

#Looping - for loop display the list_1 elements
print("\nThe elements of list_1 are: ")
for l in list_1:
    print(l)

print()

#Checking the type of elements
print(type(list_1[1])) #integer
print(type(list_1[2])) #string 
print(type(list_1[4])) #boolean

print()

#Checking elements using if-else statement
for l in list_1:
    if type(l) == int:
        print(l,"is an integer.")
    elif type(l) == str:
        print(l,"is an string.")
    elif type(l) == bool:
        print(l,"is an boolean.")
    else:
        print(l,"it has another type.")

print()

#list of integer
num_list = [2,5,7,12,15,17]
print("List of integer: ", num_list)

#Using while loop in integer list
n = 0
while n < len(num_list):
    print(num_list[n])
    n += 1

print()

#list of string
word_list = ["Patient", "Humble", "Caring"]
print("List of string:", word_list)

#Using while loop in string list 
w = 0
while w < len(word_list):
    print(word_list[w])
    w += 1
    
print()

#mixed data type
nwfl_list = [2,5,'Humble',True]
print("Mixed data type:", nwfl_list)

#Using while loop in mixed data type
mdt= 0
while mdt < len(nwfl_list):
    print(nwfl_list[mdt])
    mdt += 1

print()

#Creating a list with repeated elements
n1 = [5] * 5 # Output : [5,5,5,5,5]
print(n1)

#Using short hand for loop in n1 list
[print(x) for x in n1]

n2 = [2] * 7 # Output : [2,2,2,2,2,2]
print(n2)

#Using short hand for loop in n2 list 
[print(y) for y in n2]

print()

#Accessing List Elements
num1_list = [2,12,21,22]
print(num1_list)

print("Access the fourth elements:", num1_list[3])
print("Access the second elements backward counting:", num1_list[-2])

print()

#Adding Elements into List
#We can add elements to a list using the following methods:

#append(): Adds an element at the end of the list.
#extend(): Adds multiple elements to the end of the list.
#insert(): Adds an element at a specific position.

#Initialized list integer
n3 = [2,12]

n3.append(15)
print("After append(15): ", n3)

n3.insert(2,5)
print("After insert(2,5): ", n3)

n3.extend([51,55,500,550,555,5555])
print("After extend(51,55,500,550,555): ", n3)
print()

#Initialized an empty list str
personal_brand = []
print("My Personal Brand Empty List: ", personal_brand)

personal_brand.append("Discipline")
print("\nAfter append (Discipline): ", personal_brand)

personal_brand.insert(0,"God-fearing")
print("After insert (0, God-fearing): ", personal_brand)

personal_brand.extend(["Humble", "Caring", "Fighter"])
print("After insert (Humble, Caring, Fighter): ", personal_brand)

print("\nMy Personal Brand Full List: ", personal_brand)

print()

#Removing Elements from List
#We can remove elements from a list using:

#remove(): Removes the first occurrence of an element.
#pop(): Removes the element at a specific index or the last element if no index is specified.
#del statement: Deletes an element at a specified index.

#Initialized list integer
mm_dd_yy = [5,15,2005]
print("The day I was born in this boring world: ", mm_dd_yy)

mm_dd_yy.remove(2005)
print("After removing (2005) Im still alive: ", mm_dd_yy)

mm_dd_yy.pop(1)
print("After popping element (1) which is: ", mm_dd_yy, "is the day I popped in this void world!!.")

del mm_dd_yy[0]
print("After deleting: ", mm_dd_yy, "I'll stop existing.")

print()

#Nested Lists in Python:
table = [
    [2,4,6],
    [8,10,12],
    [14,16,18]
]

## Access element at row 3, column 3
print(table[1][2])
print()

#List Comprehension in Python:
squares = [y1*5 for y1 in range(5,15)]
print(squares)
print()

message = ["PYTHON LIST DONE!, ITS NOT EASY BUT I DID IT DONE." for w3 in range(5)]
print(message)
