class InvalidError(Exception):
    pass
    
    
total = []
number = 0

while number < 5:
    try:
        user_input = input("\nEnter a number: ")
        n = int(user_input)
        total.append(n)
        number+=1
        
    except ValueError:
        try:
            raise InvalidError("Invalid input. Only integers are allowed.")
        except InvalidError as e:
            print("Caught Error:", e)
                
print("\nTotal sum of all number input: ", sum(total))
    