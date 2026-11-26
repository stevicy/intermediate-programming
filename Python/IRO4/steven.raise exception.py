print("=== RAISING EXCEPTIONS IN PYTHON ===")

# Simple raise example
try:
    age = -5
    if age < 0:
        raise ValueError("Age cannot be negative.")
except ValueError as e:
    print("Caught an error:", e)

print()

# Raise with zero
try:
    number = 0
    if number == 0:
        raise ZeroDivisionError("Number cannot be zero here.")
except ZeroDivisionError as e:
    print("Caught an error:", e)

print()

# Loop with raise
for i in range(4):
    try:
        if i == 2:
            raise Exception("Random error at i=2")
        print("Loop index:", i)
    except Exception as e:
        print("Error happened:", e)

print()

# If else with raise
x = 10
try:
    if x < 0:
        raise ValueError("x cannot be negative")
    elif x == 10:
        print("x is equal to 10")
    else:
        print("x is another value")
except ValueError as e:
    print("Error with x:", e)

print()

# Match case with raise
choice = 2
try:
    match choice:
        case 1:
            print("You chose one")
        case 2:
            raise RuntimeError("Option 2 is not allowed")
        case _:
            print("Other choice")
except RuntimeError as e:
    print("Runtime problem:", e)

print()

# While loop with raise
count = 0
while count < 3:
    try:
        if count == 1:
            raise IndexError("Bad index simulated")
        print("While count:", count)
    except IndexError as e:
        print("Caught index issue:", e)
    count += 1

print()

# Raise manually on string check
try:
    text = "stevPY"
    if "z" not in text:
        raise ValueError("Letter z not found in text.")
except ValueError as e:
    print("Error message:", e)

print()

# Raise on list length
try:
    marks = [90, 85]
    if len(marks) < 3:
        raise Exception("Not enough marks in the list.")
except Exception as e:
    print("Marks problem:", e)

print()

# Try else with raise
try:
    n = 12
    if n % 2 != 0:
        raise ValueError("n should be even")
except ValueError as e:
    print("Odd number error:", e)
else:
    print("n is even:", n)

print()

# Try finally with raise
try:
    balance = -100
    if balance < 0:
        raise ArithmeticError("Negative balance not valid")
except ArithmeticError as e:
    print("Balance issue:", e)
finally:
    print("Balance check complete")

print()

for i in range(5):
    print("RAISE EXCEPTION DONE IS NOT EASY THOUGH BUT I DID IT.")