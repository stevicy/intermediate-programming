print("=====My Personal Detail=====")
#Syntax
my_detail = {"My name": "Steven P. Payapaya", "Age": 20, "Sex": "Male", "Birthdate": "May 15, 2005"}
print("My dictionary detail:", my_detail)
print()

#Accesing Value
print(f"My name: {my_detail["My name"]}")
print(f"Age: {my_detail["Age"]}")
print(f"Sex: {my_detail["Sex"]}")
print(f"Birthdate: {my_detail["Birthdate"]}")

print()

print("=====My Mother Detail=====")
mother_detail = {"Mother name": "Erlinda P. Payapaya", "Age": 45, "Birthdate": "January 30, 1980", "Occupation": "Domestic Helper"}
print("My mother's detail:", mother_detail)
print()

print(f"Mother name: {mother_detail["Mother name"]}")
print(f"Age: {mother_detail["Age"]}")
print(f"Birthdate: {mother_detail["Birthdate"]}")
print(f"Occupation: {mother_detail["Occupation"]}")
print()

print("=====My Father Detail=====")
father_detail = {"Father name": "Goldwin M. Payapaya", "Age": 52, "Birthdate": "December 29 1973", "Occupation": "N/A"}
print("My father's detail:", father_detail)
print()

print(f"Father name: {father_detail["Father name"]}")
print(f"Age: {father_detail["Age"]}")
print(f"Birthdate: {father_detail["Birthdate"]}")
print(f"Occupation: {father_detail["Occupation"]}")
print()

print("====================Adding Item to My Personal Detail================================")
#Adding and Updating Items in My Personal Detail 
my_detail["Education"] = "Bachelor of Science in Information Technology"
my_detail["GPA"] = 1.52
my_detail["Hobbies"] = "Gym","Running","Cycling", "Muay-Thai"
my_detail["Skills"] = "Basic Programming","Basic Networking"


print("My dictionary detail:", my_detail)
print(f"\nMy name: {my_detail["My name"]}")
print(f"Age: {my_detail["Age"]}")
print(f"Sex: {my_detail["Sex"]}")
print(f"Birthdate: {my_detail["Birthdate"]}")
print(f"Education:", my_detail.get("Education"))
print(f"GPA:", my_detail.get("GPA"))
print(f"Hobbies:", my_detail.get("Hobbies"))
print(f"Skills:", my_detail.get("Skills"))
print()


print("===== Final Summary of My Detail (with loop + condition) =====")

for k, v in my_detail.items():
    print(f"Key: {k}\tValue: {v}")

print()

# GPA Feedback
for key, value in my_detail.items():
    match key:
        case "GPA":
            if value <= 1.75:
                print(f"{key}: {value} - Pasar bai!!!")
            else:
                print(f"{key}: {value} - Pagtuon megoyyy!")
 
print()
 
# Age Check               
for key, value in my_detail.items():
    if key == "Age":
        if value < 18:
            print("Bata pa kaayo!, e enjoy sa imong pagka ulitaw, kay ana sila og mo tiguwang naka daghan ng problema.")
        elif value <= 25:
            print("Guwang naman diay ko hahaha. Dapat daw akong mindset ron 'TRABAHO NA'.")
        else:
            print("Guwang pas tanang guwang hahaha")

print()

# Loop Hobbies
for key, value in my_detail.items():
    if key == "Hobbies":
        print("Here are my hobbies:")
        for hobby in value:
            print(f"- {hobby}")

print()

# Loop Skills
for key , value in my_detail.items():
    if key == "Skills":
        print("Here are my skills:")
        for skills in value:
            print(f"- {skills}")
 
print()

# checking Sex
for key,value in my_detail.items():
    if key == "Sex":
        if value == "Male":
            print("Lalaki ko bai, dapat daw lig-on og nawng ay esti lawas diay og pang-utok haha.")
        elif value == "Female":
            print("Babae, wala koy ma print kay always sila sakto, maong dinako mag print kay sakto na daan.")
        else:
            print("Way sex or gender? aw okay rana importanti tao.")
            
print()
            
#Education Response
for key, value in my_detail.items():
    if key == "Education":
        if "Information Technology" in value:
            print("IT course? niceee noh???? -Sir Junell Bojocan ")
        else:
            print("Nganung nag IT man ka gwapo? No choice lagi, awa ron naunsa nata. -Steven Payapaya")
            
print()

# Birthdate Month Reaction
for key, value in my_detail.items():
    if key == "Birthdate":
        if "May" in value:
            print("Born in May? Mga bright og talented daw mga May. Weh? kinsay ingon ana? kay akong tagaan peso. -Steven Payapaya")
        elif "December" in value:
            print("December baby! Near Christmas so daghan regalo hahaha.")
        else:
            print("Lapas nas calendar akong birth month")
            
print()
    
#Reaction to Name
for key, value in my_detail.items():
    if key == "My name":
        if "Steven" in value:
            print("Steven? Soon your name will be well known. Timan e na! -Steven Payapaya")
        else:
            print(f"{value}? Padayon lang, ma ilado ralagi ka puhon. By God's will. -Steven Payapaya")
 
        
print()
for _ in range(5):
    print("PYTHON DICTIONARIES IS DONE, NOT EASY BUT I DID THOUGH")