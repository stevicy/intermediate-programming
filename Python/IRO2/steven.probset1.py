#Declared two integer varibale
num1 = 5
num2 = 15

#Displaying the value
print("First value is ", num1)
print("Second value is", num2)

#If/else statement
if num2 > num1:
    print(f"\nThe second value is {num2}, and it is greater than the first value, which is {num1}.")
elif num1 < num2:
    print(f"\nThe first value is {num1}, and it is less than the second value, which is {num2}.")
else:
    print(f"\nBoth value is equal.")

print()

#List 
number = [num1,num2]
print(number)
number.append(2)
print("After append: ", number)
number.insert(1,12)
print("After insert:", number)
number.extend([17,7,22,25])
print("After extend:", number)
print()

#Array
number.pop()
print("After popping the last elements 25:", number)
number.reverse()
print("After reversing:", number)
number.remove(22)
print("After removing the 22:", number)
index_of = number.index(17)
print("The index of 17 is:", index_of)

#Looping - for loop display the list elemets
print("\nThe numbers in the list are: ")
for n in number:
    print(n)
    
#Ternary operator 
max_num = num1 if num1 > num2 else num2
print(f"\nThe larger value is:", {max_num})
