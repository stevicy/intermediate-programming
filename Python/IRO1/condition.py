#Python supports the usual logical conditions from mathematics:

#Equals: a == b
#Not Equals: a != b
#Less than: a < b
#Less than or equal to: a <= b
#Greater than: a > b
#Greater than or equal to: a >= b
#These conditions can be used in several ways, most commonly in "if statements" and loops.

#An "if statement" is written by using the if keyword.

#Example:

#============================================= 'Working with If statement' ====================================
y = 55
x = 555
if x > y:
  print("x is greater than y") 

print()

wood = 5
fire = 1
if fire <= wood:
    print("Fire beats all the wood though, cause fire is something well burn no matter what things that are, except the water haha.")

print()

lastname = "Payapaya"
if lastname == "Payapaya":
    print("Yes it is, Payapaya is my lastname.")

print()

year1 = 2025
year2 = 2026
if year1 < year2:
    print("year1 is less than to year2, cause year1 is frustrating and painful year.")

print()

num1 = 15
num2 = 5
if num1 >= num2:
    print(f"num1 = {num1} is greater than num2 = {num2}")

print()

password = "SelfDeBuG"
if password != "oLDsELF":
    print("Password unmatched.")

#====================================================================================================================


#============================================ 'Working with if-else condition' ======================================
print()

age = int(input("Enter age: "))
print(f"You are now {age} years old.")

if age >= 18:
    print("You are in a legal age now—welcome to the real world! there's a lot of responsibilities ahead, bro. It's gonna be tough.")
else:
    print(f"You are {age} years old. You're underage, bro—you're too young to experience and enter the real world,marami kapang kakaining bigas!!!.")

print()

password1 = input("Enter a password: ")

if password1 == "Goyexoyeah051505":
    print("Password matched.")
else:
    print("Password unmatched. Please try again.")

print()

gasol = 1590
kahoy = 10

if kahoy <= gasol:
    print(f"Kahoy is {kahoy}, very cheap, i go for it.")
else:
    print(f"Gasol is very expensive.")

print()

gym_daily = 40
gym_mothly = 550

if gym_daily < gym_mothly:
    print("You pay for daily workout. Have a good workout.")
else:
    print("You pay for gym membership. Have a great journey to your workout.")

print()

if gym_mothly > gym_daily:
    print("You pay for the gym membership. Have a great journey to your workout.")
else: 
    print("You pay for daily workout. Have a good workout.")

print()

wear_shoes = "nike"

if wear_shoes != "adidas":
    print(f"wear_sheos is {wear_shoes}, but i wear addidas hahayst.")
else:
    print("just wear anything shoes men, thats all matter.")

print()
#==============================================================================================================================


#=================================================== 'Working with if-elif' ===================================================
print()
price = int(input("Enter price: ")) # i will be inputing a data "500"

if price>300:
    print(f"You entered {price} and is greater than 300.")
elif price<300:
    print(f"{price} is less than 300.")

#==============================================================================================================================


#============================================== 'Working with if-elif-else condition simulation' ============================== 
print()

level = 15  

if level >= 15:
    print("You're a pro player!")
elif level >= 5:
    print("You're getting better!")
else:
    print("Keep practicing!")

#==============================================================================================================================


#============================================= 'Working with Short Hand If' ===================================================
print()
if x > y: print("x is greater than y")

#==============================================================================================================================


#============================================= 'Working with Short Hand If ... Else' ==========================================
print()
s = 5
p = 50
print("S") if s > p else print("P")

#==============================================================================================================================


#=============================== 'Working with One line if else statement, with 3 conditions:' ================================
print()

n = 555
e = 555
print("N") if n > e else print("=") if n == e else print("E")

#==============================================================================================================================

