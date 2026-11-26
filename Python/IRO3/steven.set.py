#My set of work days
set_1 = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}
print("My day set: ", set_1)
print("How many days in set: ", len(set_1)) #using len() to identify how many data in set_1
print()

#Using match case to identify what day is schedule to work or shift
for days in set_1:
    match days:
        case "Monday":
            print(f"{days}, It's day off.")
        case "Tuesday":
            print(f"{days}, It's day off.")
        case "Wednesday":
            print(f"{days}, Halfday shift in morning.")
        case "Thursday":
            print(f"{days}, It's day off.")
        case "Friday":
            print(f"{days}, It's day off.")
        case "Saturday":
            print(f"{days}, Wholeday shift.")
        case _:
            print(f"{days}, days are not recognize.")

print()

for school in set_1:
    match school:
        case "Monday":
            print(f"{school}, It's school days!!!")
        case "Tuesday":
            print(f"{school}, It's school days!!!")
        case "Wednesday":
            print(f"{school}, Work days. :(")
        case "Thursday":
            print(f"{school}, It's school days!!!")
        case "Friday":
            print(f"{school}, It's school days!!!")
        case "Saturday":
            print(f"{school}, Work days. :(")
        case _:
            print(f"{school}, days are not recognize.")

print()

for work in set_1:
    match work:
        case "Monday"|"Tuesday"|"Thursday"|"Friday":
            print(f"{work}, School days. :(")
        case "Wednesday"|"Saturday":
            print(f"{work}, It's work days baby!!!")
        case _:
            print(f"{work}, days are not recognize")

print()

#My set of Lifting weight
set_2 = set()
print("Empty weight set: ", set_2)

#Adding weight
set_2.add(140)
set_2.add(150)
set_2.add(200)
set_2.add(80)

print("Now this is my ideal Lifting weight set:", set_2)
print()

#Now here i use if-elif-else condition to identify each Lifting weight
for weight in set_2:
    if weight == 140:
        print(f"{weight}lbs - Bench press baby!!!")
    elif weight == 150:
        print(f"{weight}lbs - Squat baby!!!")
    elif weight == 200:
        print(f"{weight}lbs - Deadlift lightweight baby!!!")
    elif weight == 80:
        print(f"{weight}lbs - Shoulder press baby!!!")
    else:
        print(f"{weight}lbs - Unknown lift, but anyways let's lift something baby!!")
        
print()

# Here is a set of mixing data type and also this is my personal problem set
set_3 = set((300, 5, True, "Tired"))
print("My personal problem set:", set_3)
print()

for item in set_3:
    if type(item) == bool:
        if item:
            print("Woke up on time. Good start.")
        else:
            print("Woke up late. Already behind schedule.")
    
    elif type(item) == str:
        if item == "Tired":
            print("I'm feeling tired, I'm just gonna take it easy today.")
        elif item == "okay":
            print("I'm okay, just get the things done.")
        else:
            print(f"Mood right now: {item}")
    
    elif type(item) == int:
        if item <= 10:  # Assuming task count is small numbers like 5
            if item >= 3:
                print(f"{item} tasks completed today even though I'm tired.")
            else:
                print(f"{item} tasks today — not much done.")
        else:
            if item > 200:
                print(f"I only have {item} pesos left. Manage it wisely.")
            else:
                print(f"{item} pesos left. You're doing fine financially.")

print()
                
message = "PYTHON SET IS DONE, NOT EASY BUT I DID THOUGH"
message_set = {message}

for _ in range(5):
    for msg in message_set:
        print(msg)