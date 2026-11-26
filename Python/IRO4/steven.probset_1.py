list_1 = [2,5,7]
try:
    print(list_1[5])
except IndexError:
    print("\nError: Index out of range.")
    
n = (5,7)
try:
    result = n[0]+n[1]
except IndexError:
    print("Tuple index error.")
else:
    print("\nThe sum is: ", result)

try:
    n1 = 10
    n2 = 0 
    n3 = n1 / n2
    print(n3)
except ZeroDivisionError:
    print("\nCannot divide by zero.")
except Exception:
    print("Some other error happend.")
else:
    print("Division result is: ", n3)
finally:
    print("This blocks always run.")
    print("Divison attempt complete.")

print()    
for i in range(5):
    try:
        print("Number: ", i)
    except:
        print("Looping error.")
        
print()
count = 0 
while count < 5:
    try:
        print("Number: ", count)
        count+=1
    except:
        print("While loop error.")

print()
choice = 2 
try:
    match choice:
        case 1:
            print("You chose one.")
        case 2:
            raise RuntimeError("Option 2 is not allowed.")
        case _:
            print("Other choice.")
except RuntimeError as e:
    print("Runtime problem: ", e)
    