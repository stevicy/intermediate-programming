def intro():
    print("=== Simualtion Probset 1 ===")

def add(x, y):
    return x + y

def divide(x, y):
    try:
        if y == 0:
            raise ZeroDivisionError("Cannot divide by zero.")
        return x / y
    except ZeroDivisionError as e:
        print(f"Error: {e}")
        return None
    
def grade_status(grade):
    if grade >= 90:
        return "Execellent!"
    elif grade >= 75:
        return "Passed"
    else:
        return "Failed"
    
def collection_personality():
    personality = ["Patient", "Humble", "God-fearing"]

    print("\n--- My Personality ---")
    for p in personality:
        print("-", p)

def me_collection():
    me = {"Name:":"Steven Payapaya", "Age:":20, "Role:":"BSIT Student & PeakGym Assistant"}

    for k,v in me.items():
        print(f"{k} {v}")
    