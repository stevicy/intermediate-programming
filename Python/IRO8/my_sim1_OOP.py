#Class for PeakGym Record Attendance System
class PeakGymRecords:
    def __init__(self):
        # Introduction instance attributes
        self.myMessage = ""
        self.myName = ""
        self.myAge = 0
        self.myCourse = ""
        self.myStatus = ""

        # Customer Info instance attributes
        self.personName = ""
        self.age = 0
        self.gender = ""
        self.contactNumber = ""

        # Attendance and Payment instance attributes
        self.timeIn = ""
        self.paymentType = ""
        self.paymentAmount = 0
        self.membershipExpiry = ""

        # Amino purchase  instance attributes
        self.boughtAmino = False
        self.aminoQty = 0
        self.aminoTotal = 0


#Class for PeakGym Salary Compute
class SalaryCompute:
    def __init__(self):
        self.employeeName = ""
        self.dailySalary = 0
        self.shift = ""
        self.daysWorked = 0
        self.totalSalary = 0

    def final_mesage(self):
        for i in range(5):
            print("PYTHON OBJECT-ORIENTED PROGRAMMING DONE, IT'S NOT EASY BUT NA HUMAN RAJOD NAKO ANG LAST NGA SIMULATION!!!!")


#=======================================
#  'INTRODUCTION OF MY SIMUALTION OOP'
#=======================================
introduction = PeakGymRecords()

introduction.myMessage = "Hello, this is my last final term of intermediate programming simulation. I hope maka pasar."
introduction.myName = "Steven P. Payapaya"
introduction.myAge = 20
introduction.myCourse = "BSIT"
introduction.myStatus = "Student & PeakGym Assistant"

print("=================== My Comprehensive Simulatuon IRO8 'Working with Object-Oriented Programming' ========================")
print("My message:", introduction.myMessage)
print("\nName:", introduction.myName)
print("Age:", introduction.myAge)
print("Course:", introduction.myCourse)
print("Status:", introduction.myStatus)
print("==================================================================================================");


#===============================
#   '1ST SIMULATION OOP'
#===============================
again = "Yes"

while again.lower() == "yes":
    customer = PeakGymRecords()

    print("\n===========================================")
    print("    'PEAK GYM RECORD ATTENDANCE SYSTEM'    ")
    print("===========================================")

    customer.personName = input("Enter your name: ")
    customer.age = int(input("Enter your age: "))
    customer.gender = input("Enter Gender (M/F): ")
    customer.contactNumber = input("Enter Contact Number: ")
    customer.timeIn = input("Enter Time In: ")

    # Customer Payment Type
    print("\nChoose Payment Type:")
    print("1 - Daily (40)")
    print("2 - Monthly (550)")
    print("3 - Member")
    p = int(input("Enter option: "))

    if p == 1:
        customer.paymentType = "Daily"
        customer.paymentAmount = 40
    elif p == 2:
        customer.paymentType = "Monthly"
        customer.paymentAmount = 550
        customer.membershipExpiry = input("Enter Membership Expiry (MM/DD/YY): ")
    else:
        customer.paymentType = "Member"
        customer.membershipExpiry = "N/A"

    # Customer Amino Purchase
    b = input("\nBuy Amino? (yes/no): ")
    if b.lower() == "yes":
        customer.boughtAmino = True
        customer.aminoQty = int(input("Enter Amino Quantity: "))
        customer.aminoTotal = customer.aminoQty * 12
    else:
        customer.boughtAmino = False
        customer.aminoQty = 0
        customer.aminoTotal = 0
    print("===========================================")
    

    # Display Customer Record
    print("\n\n======================================")
    print("          'CUSTOMER RECORD'           ")
    print("======================================")
    print("Name:", customer.personName)
    print("Age:", customer.age)
    print("Gender:", customer.gender)
    print("Contact Number:", customer.contactNumber)
    print("--------------------------------------")
    print("Time In:", customer.timeIn)
    print("Payment Type:", customer.paymentType)
    print("Payment Amount:", customer.paymentAmount)
    print("Membership Expiry:", customer.membershipExpiry)

    if customer.boughtAmino:
        print("--------------------------------------")
        print("Amino Qty:", customer.aminoQty)
        print("Amino Total:", customer.aminoTotal)
    print("======================================")

    again = input("\nRecord another customer? (Yes/No): ")

print("======================================")
print("        'SYSTEM ARE NOW CLOSE'        ")
print("======================================")

#===============================================================================================

#===============================
#     '2ND SIMULALTION OOP'
#===============================
salaryCompute = SalaryCompute()

print("\n\n=======================================================")
print("         'WELCOME TO PEAK GYM SALARY COMPUTE'          ")
print("=======================================================")

salaryCompute.employeeName = input("Enter employee name: ")
salaryCompute.shift = input("Enter shift (morning/afternoon/wholeday): ")

if salaryCompute.shift.lower() == "morning":
    salaryCompute.dailySalary = 200
elif salaryCompute.shift.lower() == "afternoon":
    salaryCompute.dailySalary = 250
elif salaryCompute.shift.lower() == "wholeday":
    salaryCompute.dailySalary = 200 + 250
else:
    print("Invalid shift, defaulting to morning.")
    salaryCompute.dailySalary = 200
    salaryCompute.shift = "morning"

salaryCompute.daysWorked = int(input("Enter number of days worked: "))

salaryCompute.totalSalary = salaryCompute.dailySalary * salaryCompute.daysWorked

print("\n================= Salary Summary =====================")
print("Employee Name :", salaryCompute.employeeName)
print("Daily Salary  :", salaryCompute.dailySalary)
print("Shift         :", salaryCompute.shift)
print("Days Worked   :", salaryCompute.daysWorked)
print("-------------------------------------------------------")
print("TOTAL SALARY  :", salaryCompute.totalSalary)
print("========================================================")
print("           'SALARY COMPUTE ARE NOW CLOSE'               ")
print("========================================================")

print("\nEnd of Simulation. Thank You!")
print()

#=========================
#     FINAL MESSAGE
#=========================
final_Message = SalaryCompute() 
final_Message.final_mesage()



