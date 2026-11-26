print("===== BASIC EXCEPTION HANDLING IN PYTHON =====")

# Try Except
numbers = [15, 25, 35]
try:
    print(numbers[3])
except IndexError:
    print("\nError: Index out of range.")

# Try Except with ValueError
try:
    val = int("it's getting tough.")
    print(val)
except ValueError:
    print("\nError: Cannot convert string to integer.")

# Try Except Else
my_tuple = (5, 7)
try:
    result = my_tuple[0] + my_tuple[1]
except IndexError:
    print("Tuple index error.")
else:
    print("\nThe sum is:", result)

# Try Finally
data = [1, 2, 3]
try:
    print(data[5])
except IndexError:
    print("Index problem detected.")
finally:
    print("\nThis part always run.")

print("=== LOOPING SECTION ===")
for i in range(5):
    try:
        print("Number:", i)
    except:
        print("Loop error")

print()

print("=== TRY WITH INPUT ===")
try:
    user_input = input("Enter a number: ")
    num = int(user_input)
    if num % 2 == 0:
        print("Even number")
    else:
        print("Odd number")
except ValueError:
    print("Invalid input, not a number.")

print()

print("=== MULTIPLE EXCEPTIONS ===")
try:
    num1 = 10
    num2 = 0
    result = num1 / num2
except ZeroDivisionError:
    print("Cannot divide by zero.")
except Exception:
    print("Some other error happened.")
else:
    print("Division result is:", result)
finally:
    print("Division attempt complete.")
    
print()

print("=== WHILE LOOP ===")
count = 0
while count < 3:
    try:
        print("Count is:", count)
        count += 1
    except:
        print("While loop error")
print()

print("=== STRING HANDLING ===")
try:
    text = "tired"
    print(text[10])
except IndexError:
    print("String index error.")

print()

print("=== JUST ONE MORE CODE EXECUTION OF TRY-EXCEPT ===")
try:
    print(int("999"))
except:
    print("Error in conversion")

try:
    div = 100 / 0
    print(div)
except ZeroDivisionError:
    print("Divide by zero not allowed")

print()

for m in range(5):
    print("BASIC EXCEPTION HANDLING DONE, IS NOT EASY THOUGH BUT I DID IT.")