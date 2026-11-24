#Working with Basic Example of Ternary Operator
number = 7
result = "Even number" if number % 2 == 0 else "Odd number"
print(result)

#Working with Ternary Operator in Nested If else
print()
num1= 15
status = "Positive" if num1 > 0 else "Negative" if num1 < 0 else "Zero"
print("The number is:", status)

#Working with Ternary Operator using Tuple
print()
num2 = 2
result = ("Odd", "Even")[num2 % 2 == 0]
print("The number is:", result)

#Working with Ternary Operator using Dictionary
print()
num3 = 20
num4 = 25

maximum = {True: num3, False: num4}[num3 > num4] # Select the greater number using a dictionary lookup
print("The greater number is:", maximum)

#Working with Ternary Operator using Python Lambda
print()
a = 15
b = 45

maximum = (lambda x, y: x if x > y else y)(a, b) # Lambda function to find the maximum of two numbers
print("The maximum value is:", maximum)

#Working with Ternary Operator with Print Function
print()
a1 = 35
b2 = 50

message = "a is greater" if a1 > b2 else "b is greater"
print(message)
