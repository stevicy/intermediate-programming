print("======== 'Methods and Funtion with Error/Exception Collection' ========")

#==============
# 'MY MESSAGE'
#==============
def greet():
    message = "Hello! this is my final term of programming simulation. It's getting tough you know.".upper()
    print("\nMy message: ", message)

greet()

#===========
# 'MY SELF'
#===========
def create_profile(name, age, course):
    print("\n===== Creating My Profile =====")
    try:
        if not isinstance(name, str):
            raise TypeError("Name must be a string.")
        if not isinstance(age, int):
            raise TypeError("Age must be a integer.")
        if not isinstance(course, str):
            raise TypeError("Course must be a string.")
        
        profile = {
            "Name: ": name,
            "Age: ": age,
            "Course: ": course,
            "Status: ": "Student",
        }

    except (TypeError, ValueError) as e:
        print(f"Error while creating profile: {e}")
    else:
        print("Profile successfully created with no errors.")
    finally:
        print("Profile created process completed.\n")
    return profile

my_profile = create_profile("Steven", 20, "BSIT")
print("---My Profile ---")
for k,v in my_profile.items():
    print(f"{k} {v}")

print()
#---------------------------------------------------------


class index:
    def num(x):
        return x
    
    def num2(x):
        return x
    
    def num3(x):
        return x
    
    def num4(x):
        return x
    
    def num5(x):
        return x
    
    def num6(x):
        return x
    

class int_num:
    def index_number():
        print("----- Basic Exception Handling Function -----")

        numbers = [15,25,35]
        print(f"numbers = {index.num(numbers)}")
        print("numbers[3]")
        try:
            print(numbers[3])
        except IndexError:
            print("Error: Index out of range.")

        data = [1,2,3,]
        print(f"\nnumbers1 = {index.num(data)}")
        print("data[5]")
        try:
            print(data[5])
        except IndexError:
            print("Index problem detected")
        finally:
            print("This part always run.")

        my_tuple = (5,7)
        print(f"\nmy_tuple = {index.num3(my_tuple)}")
        print("result = my_tuple[0] + my_tuple[1]")
        try:
            result = my_tuple[0] + my_tuple[1]
        except IndexError:
            print("Tuple index error.")
        else:
            print(f"The sum is: {result}")

        text = "tired"
        print(f"\ntext = {index.num4(text)}")
        print("text[10]")
        try:
            print(text[10])
        except IndexError:
            print("String index error.")

        try:
            user_input = input("\nEnter a number: ")
            print(f"Input: {index.num5(user_input)}")
            num = int(user_input)

            if num % 2 == 0:
                print("Even number.")
            else:
                print("Odd number.")
        except ValueError:
            print("Invalid Input. Not a number.")

        try:
            div = 100 / 0
            print(f"div = {index.num6(div)}")
        except ZeroDivisionError:
            print("\nDivide by zero not allowed.")

int_num.index_number()
#---------------------------------------------------------


def multipleException():
    print("\n----- Multiple Excecption Handling Function -----")

multipleException()

class index1:
    def n1(x,y):
        return x / y
    
    def n2(x):
        return int(x)
    
    def n3(x):
        return x[5]
    
    def n4(y):
        return int(y)
    
    def n5(x):
        return x
    
    def n6(x):
        return x
    
    
class int_num1:
    def index_number2():
        print("Example 1: Division with multiple excetptions.")
        print("x = 10")
        print("y = 0")
        print("c = x / y")

        try:
            print(f"{index1.n1(10,0)}")
        except ZeroDivisionError:
            print("ZeroDivsionError: cannot divide by zero.")
        except Exception:
            print("Some other error happened.")


        print("\nExample 2: Conversion with multiple exceptions.")
        print("x = 'five'")
        print("y = int(x)")
        
        try:
            print(f"{index1.n2("five")}")
        except ValueError:
            print("ValueError: cannot convert string to int.")
        except TypeError:
            print("TypeError found.")
        else:
            print(f"No error, value is: {index1.n2()}")


        print("\nExample 3: Index and ValueError together.")
        print("nums = [5,2,7]")
        print("nums[5]")
        print("int('opps')")

        try:
            print(index1.n3([5,2,7]))
        except IndexError:
            print("\nCaught IndexError: list index error.")
        except ValueError:
            print("Caught ValueError: invalid conversion.")
        finally:
            print("This finally block always execute.")

        try:
            print(index1.n4("opps"))
        except IndexError:
            print("Caught IndexError: list index error.")
        except ValueError:
            print("\nCaught ValueError: invalid conversion.")
        finally:
            print("This finally block always execute.")

        
        print("\nExample 4: For loop with multiple exception.")
        values = [10, 0, "nope"]
        print(f"values = {index1.n5(values)}")
        print("result = 100 // v")

        for v in values:
            try:
                result = 100 // v
                print(f"\nResult: {result}")
            except ZeroDivisionError:
                print("ZerDivisionError in loop.")
            except TypeError:
                print("TypeError in loop.")
            except Exception:
                print("General error in loop.")


        print("\nExample 5: While loop with multiple exception.")
        count = 0
        while count < 4:
            print(f"{index1.n6(count)}")
            try:
                if count == 1:
                    res = 10 / 0
                elif count == 2:
                    res = int("bad")
                else:
                    res = count * 2
                    print("Result:", res)
            except ZeroDivisionError:
                print("ZeroDivisionError in while loop.")
            except ValueError:
                print("ValueError in while loop.")
            count += 1

int_num1.index_number2()
#------------------------------------------------------------


def raiseException():
    print("\n----- Raise Excecption Handling Function -----")

raiseException()

class index2:
    def n(x):
        return x
    
    def n1(x):
        return x
    
    def n2(x):
        return x
    
    def n3(x):
        return x
    

class int_num2:
    def index_number2():
        print("Example 1: Loop with raise.")

        for i in range(4):
            try:
                print(f"{index2.n(i)}")
                if i == 2:
                    raise Exception("Random error at i = 2")
                print(f"Loop index {i}")
            except Exception as e:
                print(f"Error happened: {e}")

        
        print("\nExample 2: Match case with raise.")
        choice = 2
        print(f"choice = {index2.n1(choice)}")

        try:
            match choice:
                case 1:
                    print("You chose one.")
                case 2:
                    raise RuntimeError("Option 2 is not allowed.")
                case _:
                    print("Other choice.")
        except RuntimeError as e:
            print(f"Runtime problem: {e}")


        print("\nExample 3: Age raise example.")
        try:
            age = -5
            print(f"age = {index2.n2(age)}")
            if age < 0:
                raise ValueError("Age cannot be negative.")
        except ValueError as e:
            print(f"Caught an error: {e}")

        
        print("\nExample 4: Balance Try finaly with raise.")
        try:
            balace = -100
            print(f"balance = {index2.n3(balace)}")
            if balace < 0:
                raise ArithmeticError("Negative balance not valid.")
        except ArithmeticError as e:
            print(f"Balance issue: {e}")
        finally:
            print("Balance check complete.")
        
int_num2.index_number2()
print()
#------------------------------------------------------


class TooYoungError(Exception):
    pass
class TooOldError(Exception):
    pass 
class NegativeFeeError(Exception):
    pass


def userDefineException():
    print("\n--------- User-Defined Exception Function ----------")

userDefineException()

class peakGym:
    def peak():
        print("\n--- GYM REGISTRATION SIMULATION (user-defined) ---")
        print("Welcome to Peak Gym Cabadbaran City Branch!")
        print("Please follow the rules before entering.")
        print("---------------------------------------------------")
        
        count = 0

        while count < 5:
            try:
                print(f"\n--- Registration Attempt: {count + 1} ---")
                print()

                #Ask user age
                age = int(input("Enter your age: "))

                #Check invalid age
                if age < 0:
                    raise TooYoungError("Age cannot be negative.")
                
                if age < 16:
                    raise TooYoungError("Sorry, your too young. Dili pa allowed sa gym if below 16 years old.")
                
                if age > 90:
                    raise TooOldError("Too old na, risky for senior to workout.")
                
                print("Age accepted. Pwede na ka mag-register.")
                print()

                #Ask user fee
                fee = int(input("Enter membership fee payment: "))

                #Fee check
                if fee < 0:
                    raise NegativeFeeError("Negative payment. Not valid.")
                
                if fee < 500:
                    print("Too small ang payment, minimum 500 required.")
                elif fee > 5000:
                    print("Too big ang payment, maximum 500 only.")
                else:
                    print("Fee accepted. Welcome to Peak Gym!")

                print

                #Match-case for special fee promos
                match fee:
                    case 1000:
                        print("Promo: Free water bottle with 1000 pesos fee.")
                    case 1500:
                        print("Promo: Free gloves with 1500 pesos fee.")
                    case 2000:
                        print("Promo: Free gym bag with 2000 pesos fee.")
                    case 3000:
                        print("Promo: Free 1-month personal trainer with 3000 pesos fee.")
                    case 4000:
                        print("Promo: Free Peak Gym Jacket with 4000 pesos fee.")
                    case 5000:
                        print("Promo: VIP access + all freebies at a 5000 pesos fee!")
                    case _:
                        print("Normal membership fee, no promo this time.")
                
                print("\nThank you for choosing Peak Gym!")
                print("Stay strong and be healthy always.")
                print()

            #Handle custom exception
            except TooYoungError as e:
                print(f"Custom Exception Caught: {e}")

            except TooOldError as e:
                print(f"Custom Exception Caught: {e}")
            
            except NegativeFeeError as e:
                print(f"Custom Exception Caught: {e}")

            #Handle built-in exception
            except ValueError:
                print("Invalid input. Please enter an integer.")
            
            finally:
                print(f"Registration {count + 1} done.")
                print("--------------------------------")
                count +=1
                print()
            
            print("--- SUMMAMRY REPORT ---")
            print(f"Total Registrations Processed: {count}")
            print("Thank you to all who registered.")
            print("Peak Gym Cabadbaran City - Fitness for All Ages (16 to 90).")
            print("-------------------------------------------------------------")
            print()

peakGym.peak()

print("\nEnd of Simulation. Thank You!")
print()

#==================
#  FINAL MESSAGE
#==================

class ClosingMessage:
    def show_message():
        for i in range(5):
            print("PYTHON METHODS/FUNCTION WITH ERROR AND EXCEPTION HANDLING DONE, IT'S NOT EASY BUT I DID THOUGH.")

ClosingMessage.show_message()
                    


   









    






        


        
    



