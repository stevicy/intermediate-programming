import random

#Generating a Random Integer within a Range
random_number1 = random.randint(1, 15)
print(random_number1)

#Generating a Random Integer from a Sequence
print()
num_list = [1, 2, 3, 4, 5]
random_number2 = random.choice(num_list)
print(random_number2)

#Selecting a Random Element from a List
print()
singers = ["Adele", "Justin Bieber", "Taylor Swift", "Ed Sheeran", "Shakira", "The Weeknd", "Rihanna"]
selected_singers = random.sample(singers, 5)
print(selected_singers)

#Shuffling a List
print()
genres = ["Action", "Comedy", "Drama", "Horror", "Sci-Fi", "Romance", "Thriller", "Fantasy", "Animation", "Documentary"]
random.shuffle(genres)
print(genres)

#Making Random Choices with Weighted Probabilities
print()
workouts = ["cardio", "strength training", "yoga"]
weights = [0.5, 0.3, 0.2]  # More likely to choose is cardio
chosen_workout = random.choices(workouts, weights, k=1)
print(chosen_workout)

#Generating Random Passwords
print()
import string

def create_strong_password(length):
    all_chars = string.ascii_letters + string.digits + string.punctuation
    new_password = ''.join(random.choices(all_chars, k=length))
    return new_password

generated_password = create_strong_password(12)
print("Your new password is:", generated_password)

#Seeding the Random Number Generator
print()
random.seed(42) # Set seed for consistent results

roll1 = random.randint(1, 100)
roll2 = random.randint(1, 100)
roll3 = random.randint(1, 100)

print("Dice rolls:", roll1, roll2, roll3)
