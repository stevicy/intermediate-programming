# Create a list from 0 to 9
numbers = [x for x in range(10)]
print("List of numbers from 0 to 9:", numbers)
print()

# Create a list of even numbers from 0 to 20
even_numbers = [x for x in range(21) if x % 2 == 0]
print("Even numbers from 0 to 20:", even_numbers)
print()

# Create a list of odd numbers from 0 to 20
odd_numbers = [x for x in range(21) if x % 2 != 0]
print("Odd numbers from 0 to 20:", odd_numbers)
print()

# Square each number in a list
squares = [x * x for x in range(10)]
print("Squares from 0 to 9:", squares)
print()

# Use list comprehension with strings
words = ["apple", "banana", "cherry", "date"]
first_letters = [word[0] for word in words]
print("First letters:", first_letters)
print()

# Convert to uppercase
uppercase_words = [word.upper() for word in words]
print("Uppercase words:", uppercase_words)
print()

#Filter short words
short_words = [word for word in words if len(word) <= 5]
print("Short words (<= 5 letters):", short_words)
print()

# Multiply numbers by 10
multiplied = [x * 10 for x in range(5)]
print("Numbers multiplied by 10:", multiplied)
print()

# Replace 'a' with '@' in each word
replaced = [word.replace('a', '@') for word in words]
print("Words with 'a' replaced by '@':", replaced)
print()

# Get word lengths
lengths = [len(word) for word in words]
print("Lengths of each word:", lengths)

# Double each letter in a word
word = "JUST DO IT!"
doubled_letters = [char*2 for char in word]
print("Doubled letters in 'hello':", doubled_letters)
print()

# Combine words with 'fruit'
combined = [word + " fruit" for word in words]
print("Combined with 'fruit':", combined)
print()

# Exclude 'banana'
no_banana = [word for word in words if word != "banana"]
print("Without banana:", no_banana)
print()

# Reverse each word
reversed_words = [word[::-1] for word in words]
print("Reversed words:", reversed_words)
print()

# Keep only lowercase letters
letters = "Nice NohH"
lowercase_only = [c for c in letters if c.islower()]
print("Lowercase letters:", lowercase_only)
print()

# Boolean list for even check
bool_even = [x % 2 == 0 for x in range(10)]
print("Is number even:", bool_even)
print()

# Replace vowels with '*'
text = "abracadabra"
replaced_vowels = [char if char not in 'aeiou' else '*' for char in text]
print("Vowels replaced:", "".join(replaced_vowels))
print()

# Uppercase only if starts with 'b'
filtered_upper = [word.upper() for word in words if word.startswith('b')]
print("Uppercase words starting with 'b':", filtered_upper)

# Get digits from a string
string_with_digits = "abc123xyz45678xznzhygz@hj123"
digits = [c for c in string_with_digits if c.isdigit()]
print("Digits found:", digits)
print()

list_1 = [x+1 for x in range(10)]
list_2 = [word.upper() for word in ["im", "truly", "tired", "my", "god", "help", "me"]]
list_3 = [len(w)*2 for w in words]
list_4 = [x+100 for x in range(10)]
list_5 = [w.replace('e', '3') for w in words]
list_6 = [f"Word: {w}" for w in words]
print(list_1)
print(list_2)
print(list_3)
print(list_4)
print(list_5)
print(list_6)
print()

for _ in range(5):
    print("PYTHON LIST COMPREHENSION IS DONE, NOT EASY BUT I DID THOUGH")