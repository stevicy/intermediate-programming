#My set of Lifting weight
set1 = set()
print("Empty weight set: ", set1)

#Adding weight
set1.add(140)
set1.add(150)
set1.add(200)
set1.add(80)

print("My ideal lifting weight set:", set1)
print("How may weight in set ? ", len(set1))
print()

#Now here i use if-elif-else condition to identify each Lifting weight
for weight in set1:
    if weight == 140:
        print(f"{weight}lbs - Bench press.")
    elif weight == 150:
        print(f"{weight}lbs - Squat.")
    elif weight == 200:
        print(f"{weight}lbs - Deadlift.")
    elif weight == 80:
        print(f"{weight}lbs - Shoulder press.")
    else:
        print(f"{weight}lbs - Unknown lift, but anyways let's lift something!")