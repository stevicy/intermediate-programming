#Working with Nested if Statement
print()
age = 20
has_ticket = "yes"  # "yes" or "no"
message = ""  # store the message here

if age >= 18:
    if has_ticket == "yes":
        message = "You can watch the movie!"
    if has_ticket != "yes":
        message = "You need a ticket to watch the movie."
if age < 18:
    message = "You are too young to watch this movie."

print(message)

#Working with Nested if Statement with else Condition
print()
number = 7
print("Number =", number)

if number > 0:
    # number is positive
    if number % 2 == 0:
        print("Positive and even")
    else:
        print("Positive but odd")
else:
    # number is zero or negative
    if number == 0:
        print("Number is zero")
    else:
        print("Number is negative")