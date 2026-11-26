print("=== MULTIPLE EXCEPTION HANDLING IN PYTHON ===")

# Example 1: Division with multiple exceptions
try:
    a = 10
    b = 0
    c = a / b
except ZeroDivisionError:
    print("ZeroDivisionError: cannot divide by zero")
except Exception:
    print("Some other error happened")

print()

# Example 2: Conversion with multiple exceptions
try:
    x = "five"
    y = int(x)
except ValueError:
    print("ValueError: cannot convert string to int")
except TypeError:
    print("TypeError found")
else:
    print("No error, value is:", y)

print()

# Example 3: Index and ValueError together
nums = [5, 2, 7]
try:
    print(nums[5])
    print(int("oops"))
except IndexError:
    print("Caught IndexError: list index wrong")
except ValueError:
    print("Caught ValueError: invalid conversion")
finally:
    print("This finally block always executes")

print()

# For loop with multiple exceptions
print("=== FOR LOOP WITH TRY ===")
values = [10, 0, "abc"]
for v in values:
    try:
        result = 100 // v
        print("Result:", result)
    except ZeroDivisionError:
        print("ZeroDivisionError in loop")
    except TypeError:
        print("TypeError in loop")
    except Exception:
        print("General error in loop")

print()

# While loop with multiple exceptions
print("=== WHILE LOOP WITH TRY ===")
count = 0
while count < 4:
    try:
        if count == 1:
            res = 10 / 0
        elif count == 2:
            res = int("bad")
        else:
            res = count * 2
            print("Result in while:", res)
    except ZeroDivisionError:
        print("ZeroDivisionError in while loop")
    except ValueError:
        print("ValueError in while loop")
    count += 1

print()

# Nested try with multiple exceptions
print("=== NESTED TRY EXAMPLE ===")
try:
    print("Outer block start")
    try:
        num = int("text")
    except ValueError:
        print("Inner caught ValueError")
    arr = [5, 6]
    print(arr[4])
except IndexError:
    print("Outer caught IndexError")

print()

# Extra small demos of multiple excepts
print("=== EXTRA MULTIPLE EXCEPTS ===")
try:
    val = "hello" + 5
except TypeError:
    print("Caught TypeError in string + int")
except Exception:
    print("Caught generic error")

print()

try:
    div = 50 / 0
except ZeroDivisionError:
    print("Divide by zero again handled")
except:
    print("Other error")

print()

for i in range(5):
    print("MULTIPLE EXCEPTION HANDLING DONE IS NOT EASY THOUGH BUT I DID IT.")