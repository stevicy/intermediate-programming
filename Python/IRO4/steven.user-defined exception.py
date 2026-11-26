# User-defined exception 
class TooYoungError(Exception):   # if age < 16
    pass

class TooOldError(Exception):     # if age > 60
    pass

class NegativeFeeError(Exception):  # if fee < 0
    pass

# ==========================================================
print("=== GYM REGISTRATION SIMULATION ('User-defined') ===")
print("Welcome to Peak Gym Cabadbaran Branch!")
print("Please follow the rules before entering.")
print("--------------------------------------------------------")
print()

# Initialize counter
count = 0

# Loop for multiple registrations
while count < 5:
    try:
        print("=== Registration Attempt:", count + 1, "===")
        print()

        # Ask user age
        age = int(input("Enter your age: "))

        # Check invalid age
        if age < 0:
            raise TooYoungError("Age cannot be negative oy!")

        if age < 16:
            raise TooYoungError("Sorry, you are too young. Dili pa allowed sa gym if below 16.")

        if age > 60:
            raise TooOldError("Too old na, risky for seniors to workout.")

        print("Age accepted. Pwede na ka mag-register.")
        print()

        # Ask user fee
        fee = int(input("Enter membership fee payment: "))

        # Fee checks
        if fee < 0:
            raise NegativeFeeError("Negative payment? Dili pwede oy!")

        if fee < 500:
            print("Too small ang bayad, minimum 500 required.")
        elif fee > 5000:
            print("Too big ang payment, maximum 5000 only.")
        else:
            print("Fee accepted. Welcome to Peak Gym!")
            
        print()

        # Match-case for special fee promos
        match fee:
            case 1000:
                print("Promo: Free water bottle with ₱1000 fee.")
            case 1500:
                print("Promo: Free gloves with ₱1500 fee.")
            case 2000:
                print("Promo: Free gym bag with ₱2000 fee.")
            case 3000:
                print("Promo: Free 1-month personal trainer with ₱3000 fee.")
            case 4000:
                print("Promo: Free Peak Gym jacket with ₱4000 fee.")
            case 5000:
                print("Promo: VIP access + all freebies at ₱5000!")
            case _:
                print("Normal membership fee, no promo this time.")

        print("Thank you for choosing Peak Gym!")
        print("Stay strong and healthy always.")
        print()

    # Handle custom exceptions
    except TooYoungError as e:
        print("Custom Exception Caught:", e)

    except TooOldError as e:
        print("Custom Exception Caught:", e)

    except NegativeFeeError as e:
        print("Custom Exception Caught:", e)

    # Handle built-in exception
    except ValueError:
        print("Invalid input. Please enter an integer.")

    # Final block always executes
    finally:
        print("Registration", count + 1, "done.")
        print("----------------------------")
        count += 1
        print()


print("=== SUMMARY REPORT ===")
print("Total Registrations Processed:", count)
print("Thank you to all who registered.")
print("Peak Gym Cabadbaran - Fitness for All Ages (16 to 60).")
print("--------------------------------------------------------")
print()

for m in range(5):
    print("USER-DEFINED EXCEPTIONDONE,NOT EASY THOUGH BUT I DID IT.")

print()
print("=== END OF PROGRAM ===")
print("=========================================================")