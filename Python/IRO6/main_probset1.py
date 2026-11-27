from probset1_package import intro
from probset1_package import add
from probset1_package import divide
from probset1_package import grade_status
from probset1_package import collection_personality
from probset1_package import me_collection

def main():
    intro()
    print()

    while True:
        print("\nMenu: ")
        print("1. Add Numbers")
        print("2. Divide Numbers")
        print("3. Grade Status Check")
        print("4. Collection of Me")
        print("5. Exit")

        choice = input("Enter choie (1-5): ")

        if choice == "1":
            print("\nYou chose 1. Add Numbers")
            print("Now proceed to enter a numbers..")
            num1 = float(input("\nEnter a first number: "))
            num2 = float(input("Enter a second number: "))
            print(f"Result: {add(num1, num2)}")
        elif choice == "2":
            print("\nYou chose 2. Divide Numbers")
            print("Now proceed to enter a numbers..")
            num3 = float(input("\nEnter a first number: "))
            num4 = float(input("Enter a second number: "))
            print(f"Result: {divide(num3, num4)}")
        elif choice == "3":
            print("\nYou chose 3. Grade Status Checker")
            print("Now proceed to enter a grade..")
            grade = float(input("\nEnter your grade: "))
            print(f"Result: {grade_status(grade)}")
        elif choice == "4":
            print("\nYou chose 4. Collection of Me")
            print("Now here they are:")
            print()

            me_collection()
            collection_personality()
        elif choice == "5":
            print("\nExiting the program.. Thanks!")
            break
        else:
            print("Invalid choice! Try again.")

main()